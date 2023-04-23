package barbatos_rex1.sharedboardapp.commands;

import barbatos_rex1.laprivcore.event.EventListener;
import barbatos_rex1.laprivcore.event.Handler;
import barbatos_rex1.sharedboardapp.config.ListenerConfig;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

import java.lang.reflect.InvocationTargetException;
import java.text.AttributedString;


@ShellCommandGroup("Server")
@ShellComponent
@AllArgsConstructor
public class ServerCommands {

    private EventListener listener;
    private ListenerConfig listenerConfig;
    private static Logger logger = LoggerFactory.getLogger(ServerCommands.class);


    @ShellMethod("start")
    public AttributedString start() {
        registerAllListeners();
        return new AttributedString("");
    }

    private void registerAllListeners() {
        var classes = listenerConfig.getHandlerClasses();

        for (String str : classes) {
            try {
                Class<? extends Handler> rClass = (Class<? extends Handler>) Class.forName(str);
                Handler newInstance = rClass.getDeclaredConstructor().newInstance();
                listener.addListener(newInstance);
                logger.debug(String.format("Added listner %s", rClass.getSimpleName()));
            } catch (ClassNotFoundException | ClassCastException e) {
                logger.warn(String.format("No handler found for %s. Ignoring entry!", str));
            } catch (InvocationTargetException | InstantiationException | IllegalAccessException |
                     NoSuchMethodException e) {
                logger.warn(String.format("Could not initialize new instance of %s. Ignoring entry!", str));
            }
        }


    }


}
