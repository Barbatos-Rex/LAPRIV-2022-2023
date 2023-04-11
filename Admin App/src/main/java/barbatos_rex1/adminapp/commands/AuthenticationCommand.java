package barbatos_rex1.adminapp.commands;

import barbatos_rex1.laprivcore.user.domain.AuthzService;
import barbatos_rex1.laprivcore.user.domain.Role;
import barbatos_rex1.laprivcore.user.domain.UserDTO;
import lombok.AllArgsConstructor;
import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.Availability;
import org.springframework.shell.standard.ShellCommandGroup;
import org.springframework.shell.standard.ShellComponent;
import org.springframework.shell.standard.ShellMethod;
import org.springframework.shell.standard.ShellOption;

import java.util.Optional;

@ShellComponent
@AllArgsConstructor
@ShellCommandGroup("Authentication")
public class AuthenticationCommand {


    private static final String LOGIN = "Allows for the login in the application.";
    private AuthzService service;

    @ShellMethod(key = "login", value = LOGIN)
    private AttributedString login(@ShellOption({"-e"}) String email, @ShellOption({"-p"}) String password) {
        Optional<UserDTO> user = service.login(email, password);
        if (user.isEmpty()) {
            return new AttributedString("Invalid email or password!", AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
        }
        if (service.isAuthorized(Role.MANAGER)) {


            return new AttributedString(String.format("Welcome %s!", user.get().fullName), AttributedStyle.DEFAULT.foreground(AttributedStyle.CYAN));
        } else {
            service.logout();
            return new AttributedString("No authorization!", AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
        }
    }


    public Availability loginAvailability() {
        return service.currentSession().isEmpty() ? Availability.available() : Availability.unavailable("there is already a session.");
    }

    @ShellMethod
    public AttributedString logout() {
        var session = service.logout();
        if (session.isPresent()) {
            return new AttributedString(String.format("Loging out. Have a nice day %s!", session.get().fullName), AttributedStyle.BOLD.foreground(AttributedStyle.CYAN));
        }
        return new AttributedString("");
    }

    public Availability logoutAvailability() {
        return service.currentSession().isPresent() ? Availability.available() : Availability.unavailable("there is no open session.");
    }

}
