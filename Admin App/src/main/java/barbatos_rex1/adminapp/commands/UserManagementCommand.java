package barbatos_rex1.adminapp.commands;

import barbatos_rex1.laprivcore.personal_info.domain.ProfileDTO;
import barbatos_rex1.laprivcore.personal_info.domain.StudentProfileDTO;
import barbatos_rex1.laprivcore.personal_info.domain.TeacherProfileDTO;
import barbatos_rex1.laprivcore.user.domain.*;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.Availability;
import org.springframework.shell.standard.*;

import java.text.SimpleDateFormat;
import java.util.Scanner;


@AllArgsConstructor
@ShellComponent
@ShellCommandGroup("User Management")
public class UserManagementCommand {

    private AuthzService authzService;
    private UserService userService;


    private Availability isAviable() {
        return authzService.currentSession().isPresent() && authzService.isAuthorized(Role.MANAGER) ? Availability.available() : Availability.unavailable("either no session is open or it is unauthorized!");
    }

    @ShellMethod(key = "users", value = "Lists all users registered in the application")
    @ShellMethodAvailability("isAviable")
    public AttributedString listUsers(@ShellOption(help = "Flags for list command", defaultValue = "iesfr", value = "-f") String flags) {
        var allUsers = userService.all();
        StringBuilder sb = new StringBuilder();
        UserFlags uf = manageFlags(flags);
        for (UserDTO user : allUsers) {
            buildWithFlags(sb, user, uf);
        }
        System.out.println("\nRegistered Users:\n");
        return new AttributedString(sb, AttributedStyle.DEFAULT.foreground(AttributedStyle.CYAN));
    }

    @SneakyThrows
    @ShellMethod(key = "createUser", value = "Create an user")
    @ShellMethodAvailability("isAviable")
    public AttributedString createUser(@ShellOption(value = {"-e"}) String email, @ShellOption({"-n"}) String shortName,
                                       @ShellOption({"-f"}) String fullName, @ShellOption({"-r"}) Role role, @ShellOption({"-b"}) String birthdate,
                                       @ShellOption({"-t"}) String taxNumber, @ShellOption(value = "-o", defaultValue = "0") String optional) {
        CreateUserDTO dto = new CreateUserDTO();
        dto.email = email;
        dto.shortName = shortName;
        dto.fullName = fullName;
        dto.role = role;
        dto.password = "Qwerty123";

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");


        switch (role) {
            case STUDENT ->
                    dto.profile = new StudentProfileDTO(null, sdf.parse(birthdate), taxNumber, Integer.parseInt(optional));
            case TEACHER -> dto.profile = new TeacherProfileDTO(null, sdf.parse(birthdate), taxNumber, optional);
            case MANAGER -> dto.profile = new ProfileDTO(null, sdf.parse(birthdate), taxNumber);
        }

        var result = authzService.register(dto);

        var str = new AttributedString(result.map(UserDTO::toString).orElse(dto.toString()), AttributedStyle.DEFAULT.foreground(AttributedStyle.CYAN));


        if (result.isPresent()) {
            System.out.println(new AttributedString("New User Registered in the application!\n",
                    new AttributedStyle(AttributedStyle.DEFAULT.foreground(AttributedStyle.GREEN))));
        } else {
            System.out.println(new AttributedString("Failed to create user!", AttributedStyle.DEFAULT.foreground(AttributedStyle.RED)));
        }

        return str;
    }


    @SneakyThrows
    @ShellMethod(key = "setUserStatus", value = "Allows for enabling and disabling of users")
    @ShellMethodAvailability("isAviable")
    public AttributedString setUserStatus(@ShellOption(value = "-i") String userId, @ShellOption(arity = 0, value = "-d") boolean disable) {

        boolean bol;
        String message;
        if (disable) {
            bol = userService.disableUser(userId);
            if (bol) {
                message = String.format("User with id '%s' is disabled", userId);
            } else {
                message = String.format("User with id '%s' is already disabled!", userId);
            }
        } else {
            bol = userService.enableUser(userId);
            if (bol) {
                message = String.format("User with id '%s' is enabled", userId);
            } else {
                message = String.format("User with id '%s' is already enabled!", userId);
            }
        }
        return new AttributedString(message);
    }


    @SneakyThrows
    @ShellMethod(key = "icreateUser", value = "Create an user in interactive mode")
    @ShellMethodAvailability("isAviable")
    public AttributedString createUser() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Short Name: ");
        String sn = sc.nextLine();
        System.out.print("Full Name: ");
        String fn = sc.nextLine();
        System.out.print("Role: ");
        String r = sc.nextLine();
        System.out.print("Birth Date(dd/MM/yyyy): ");
        String bd = sc.nextLine();
        System.out.print("Tax Number: ");
        String tn = sc.nextLine();
        String o;

        Role role = Role.valueOf(r);
        if (role == Role.STUDENT) {
            System.out.print("Mechanographic Number: ");
            o = sc.nextLine();
        } else if (role == Role.TEACHER) {
            System.out.print("Acronym: ");
            o = sc.nextLine();
        } else {
            o = "0";
        }
        return createUser(email, sn, fn, role, bd, tn, o);
    }


    private void buildWithFlags(StringBuilder sb, UserDTO user, UserFlags flags) {
        var conditions = flags;
        if (conditions.id) {
            sb.append(user.id).append(" - ");
        }
        if (conditions.email) {
            sb.append(user.email).append(" - ");
        }
        if (conditions.shortName) {
            sb.append(user.shortName).append(" - ");
        }
        if (conditions.fullName) {
            sb.append(user.fullName).append(" - ");
        }
        if (conditions.role) {
            sb.append(user.role).append(" - ");
        }
        sb.append(user.status).append("\n");
    }

    private UserFlags manageFlags(String flags) {
        UserFlags result = new UserFlags();
        for (char c : flags.toCharArray()) {
            switch (c) {
                case 'i':
                    result.id = true;
                    break;
                case 'e':
                    result.email = true;
                    break;
                case 's':
                    result.shortName = true;
                    break;
                case 'f':
                    result.fullName = true;
                    break;
                case 'r':
                    result.role = true;
                    break;
                default:
                    System.out.println(new AttributedString(String.format("Flag '%s' is not valid, and will be ignored.", c), AttributedStyle.BOLD.foreground(AttributedStyle.YELLOW)));
            }
        }
        return result;
    }

    private class UserFlags {
        public boolean id, email, shortName, fullName, role = false;
    }


}
