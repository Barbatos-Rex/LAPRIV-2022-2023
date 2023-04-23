package barbatos_rex1.adminapp.commands;


import barbatos_rex1.laprivcore.course.domain.CourseDTO;
import barbatos_rex1.laprivcore.course.domain.CourseService;
import barbatos_rex1.laprivcore.course.domain.CourseState;
import barbatos_rex1.laprivcore.personal_info.domain.ProfileDTO;
import barbatos_rex1.laprivcore.personal_info.domain.ProfileService;
import barbatos_rex1.laprivcore.personal_info.domain.TeacherProfileDTO;
import barbatos_rex1.laprivcore.shared.domain.exception.BuisnessRuleViolationException;
import barbatos_rex1.laprivcore.user.domain.AuthzService;
import barbatos_rex1.laprivcore.user.domain.Role;
import barbatos_rex1.laprivcore.user.domain.UserDTO;
import barbatos_rex1.laprivcore.user.domain.UserService;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.shell.Availability;
import org.springframework.shell.standard.*;

import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

@AllArgsConstructor
@ShellComponent
@ShellCommandGroup("Course Management")
public class CourseManagementCommand {

    private CourseService courseService;
    private AuthzService authzService;
    private UserService userService;
    private ProfileService profileService;
    private static Logger logger = LoggerFactory.getLogger(CourseManagementCommand.class);


    private Availability isAvailable() {
        return authzService.currentSession().isPresent() && authzService.isAuthorized(Role.MANAGER) ? Availability.available() : Availability.unavailable("either no session is open or it is unauthorized!");
    }


    @ShellMethod(key = "createCourse", value = "Create a new course in the app")
    @ShellMethodAvailability("isAvailable")
    public AttributedString createCourse() {

        Scanner sc = new Scanner(System.in);
        System.out.print("Course Code: ");
        var code = sc.nextLine();
        System.out.print("Course Title: ");
        var title = sc.nextLine();
        System.out.print("Maximum Capacity: ");
        var maxCapacity = Integer.parseInt(sc.nextLine());
        System.out.print("Minimum Capacity: ");
        var minCapacity = Integer.parseInt(sc.nextLine());


        CourseDTO course = new CourseDTO();
        course.code = code;
        course.title = title;
        course.state = CourseState.CREATED;
        course.maxCapacity = maxCapacity;
        course.minCapacity = minCapacity;

        var result = courseService.createCourse(course);


        var str2 = new AttributedString(result.orElse(course).toString());

        if (result.isPresent()) {
            return AttributedString.join(new AttributedString("Course sucessfully created!",
                    AttributedStyle.DEFAULT.foreground(AttributedStyle.GREEN)), str2);
        }
        return AttributedString.join(new AttributedString("Course failed to be created!",
                AttributedStyle.DEFAULT.foreground(AttributedStyle.RED)), str2);

    }

    @ShellMethod(key = "progressCourse", value = "Alter the course state accordint to its natural flux.")
    @ShellMethodAvailability("isAvailable")
    public AttributedString progressCourse(@ShellOption("-c") String courseCode) {
        Optional<CourseDTO> course = courseService.course(courseCode);
        if (course.isPresent()) {
            return switch (course.get().state) {
                case CREATED -> buildString(courseService.openEnrollments(courseCode));
                case OPEN -> buildString(courseService.closeEnrollments(courseCode));
                case WAITING -> buildString(courseService.openCourse(courseCode));
                case OCCURING -> buildString(courseService.closeCourse(courseCode));
                default -> buildString(course);
            };
        }
        return buildString(course);
    }


    private AttributedString buildString(Optional<CourseDTO> opt) {
        return opt.map(courseDTO -> new AttributedString(String.format("Course is currently %s!", courseDTO.state.name()),
                AttributedStyle.DEFAULT.foreground(AttributedStyle.GREEN))).orElseGet(() -> new AttributedString("Course is invalid!",
                AttributedStyle.DEFAULT.foreground(AttributedStyle.RED)));
    }

    @ShellMethod(key = "isetTeacher", value = "Set a teacher of a course")
    @ShellMethodAvailability("isAvailable")
    public AttributedString assignTeacher(@ShellOption(value = "-r", arity = 0, help = "If -r is used, the command will set the teacher as responsible, if not it will set as a teacher for the course.") boolean responsible) {
        System.out.println("Courses: ");
        List<CourseDTO> cs = courseService.courses();
        cs.stream().map(c -> new AttributedString(c.code, AttributedStyle.DEFAULT.foreground(AttributedStyle.CYAN))).forEach(System.out::println);
        System.out.println();
        System.out.println("Choose a course to assign teacher (code):");
        Scanner sc = new Scanner(System.in);
        String courseCode = sc.nextLine();
        List<UserDTO> users = userService.teachers();
        users.stream().map(u -> buildTeacherAttributedString(u)).forEach(System.out::println);
        System.out.println();
        System.out.println("Choose a teacher (id): ");
        String userId = sc.nextLine();
        if (responsible) {
            Optional<CourseDTO> courseDTO = courseService.setResponsibleTeacher(courseCode, userId, CourseService.Option.REPLACE);
            return new AttributedString(courseDTO.get().toString(), AttributedStyle.DEFAULT.foreground(AttributedStyle.CYAN));
        }
        Optional<CourseDTO> courseDTO = courseService.addTeacher(courseCode, userId);
        return new AttributedString(courseDTO.get().toString(), AttributedStyle.DEFAULT.foreground(AttributedStyle.CYAN));
    }


    private AttributedString buildTeacherAttributedString(UserDTO u) {
        StringBuilder sb = new StringBuilder();
        Optional<ProfileDTO> rawProfile = profileService.profileOfUser(u.id);
        if (rawProfile.isEmpty()) {
            throw new RuntimeException();
        }
        TeacherProfileDTO profile = ((TeacherProfileDTO) rawProfile.get());
        sb.append(u.id).append(" - ").append(profile.acronym).append(" - ").append(u.fullName).append(" - ").append(u.status);
        return new AttributedString(sb.toString(), AttributedStyle.DEFAULT.foreground(AttributedStyle.CYAN));
    }


    @ShellMethod(key = "imanageEnrollments", value = "Allows for accepting or rejecting enrollments for course")
    @ShellMethodAvailability("isAvailable")
    public AttributedString acceptEnrollments(@ShellOption(value = "-c", help = "The code of the course") String courseCode) {
        StringBuilder sb = new StringBuilder();
        Optional<CourseDTO> course = courseService.course(courseCode);
        if (course.isEmpty()) {
            return new AttributedString("Course could not be found!", AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
        }
        var requests = course.get();
        //TODO Implement
        throw new UnsupportedOperationException("Not implemented yet!");
    }

    @SneakyThrows
    @ShellMethod(key = "bulkEnrollments", value = "Makes bulk enrollemnts from csv file with student id and the courses it is enrolled")
    @ShellMethodAvailability("isAvailable")
    public AttributedString bulkEnrrolments() {
        File f = new File("D:\\Repos\\LAPRIV-2022-23\\Admin App\\src\\main\\resources\\enrollments\\bulk.csv");
        if (f.getName().matches(".*\\.csv")) {
            InputStream is = new FileInputStream(f);
            var warnings = courseService.bulkEnrollment(is);
            for (BuisnessRuleViolationException e : warnings) {
                logger.warn("Skiped a line due to an error", e);
            }
            return new AttributedString("File successfuly imported!");
        }
        return new AttributedString("Selected component is not a csv file", AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
    }


}



