package barbatos_rex1.sharedboardapp.components;

import barbatos_rex1.laprivcore.event.EventListener;
import barbatos_rex1.sharedboardapp.config.BoardServerConfig;
import lombok.AllArgsConstructor;
import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.jline.PromptProvider;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class ServerPromptProvider implements PromptProvider {

    private BoardServerConfig config;
    private EventListener eventListener;

    @Override
    public AttributedString getPrompt() {
        StringBuilder sb = new StringBuilder();
        sb.append("Server");
        if(config.isMonitoring()){
            buildMonitoringProfile(sb);
        }
        sb.append(":> ");
        return new AttributedString(sb.toString(), AttributedStyle.BOLD.foreground(AttributedStyle.RED));
    }

    private void buildMonitoringProfile(StringBuilder sb) {
        sb.append(":").append("(Threads:").append(eventListener.activeThreads()).append(")");
    }
}
