package barbatos_rex1.laprivteacherapp.commands;

import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;

@ShellComponent
public class ExampleCommand {


    @ShellMethod(key = "hello")
    public String hello() {
        return "Hello World!";
    }

    @ShellMethod(key = "goodbye")
    public String goodbye() {
        return "Bye Bye!";
    }


}
