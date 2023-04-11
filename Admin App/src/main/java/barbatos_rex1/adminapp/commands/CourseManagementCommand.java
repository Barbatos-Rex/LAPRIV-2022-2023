package barbatos_rex1.adminapp.commands;


import barbatos_rex1.laprivcore.course.domain.CourseDTO;
import barbatos_rex1.laprivcore.course.domain.CourseService;
import barbatos_rex1.laprivcore.course.domain.CourseState;
import barbatos_rex1.laprivcore.user.domain.AuthzService;
import barbatos_rex1.laprivcore.user.domain.Role;
import lombok.AllArgsConstructor;
import org.jline.utils.AttributedString;
import org.jline.utils.AttributedStyle;
import org.springframework.shell.Availability;
import org.springframework.shell.standard.*;

import java.util.Optional;
import java.util.Scanner;

@AllArgsConstructor
@ShellComponent
@ShellCommandGroup("Course Management")
public class CourseManagementCommand {

    private CourseService courseService;
    private AuthzService authzService;


    private Availability isAviable() {
        return authzService.currentSession().isPresent() && authzService.isAuthorized(Role.MANAGER) ? Availability.available() : Availability.unavailable("either no session is open or it is unauthorized!");
    }


    @ShellMethod(key = "createCourse", value = "Create a new course in the app")
    @ShellMethodAvailability("isAviable")
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

//    @ShellMethod(key = "alterCourseEnrollment", value = "Alter the enrollment status of a course")
//    @ShellMethodAvailability("isAviable")
//    public AttributedString alterCourseEnrollment(@ShellOption("-i") String courseId, @ShellOption(value = "-o", arity = 0) boolean open, @ShellOption(value = "-c", arity = 0) boolean close) {
//        if (open) {
//            Optional<CourseDTO> dto = courseService.openEnrollments(courseId);
//            if (dto.isPresent() && dto.get().state.equals("OPEN")) {
//                return new AttributedString("Course enrollments are currently open!", AttributedStyle.DEFAULT.foreground(AttributedStyle.GREEN));
//            } else {
//                return new AttributedString("Course is either closed, done, canceled or ongoing!", AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
//            }
//        }
//        if (close) {
//            Optional<CourseDTO> dto = courseService.closeEnrollments(courseId);
//            if (dto.isPresent() && dto.get().state.equals("CLOSED")) {
//                return new AttributedString("Course enrollments are currently closed!", AttributedStyle.DEFAULT.foreground(AttributedStyle.GREEN));
//            } else {
//                return new AttributedString("Course is either just created, done, canceled or ongoing!", AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
//            }
//        }
//        return new AttributedString("No action performed! Consult command instructions for help!");
//    }
//
//    @ShellMethod(key = "alterCourseState", value = "Alter the course state (to open or done)")
//    @ShellMethodAvailability("isAviable")
//    public AttributedString alterCourse(@ShellOption("-i") String courseId, @ShellOption(value = "-o", arity = 0) boolean open, @ShellOption(value = "-c", arity = 0) boolean close) {
//        if (open) {
//            Optional<CourseDTO> dto = courseService.openCourse(courseId);
//            if (dto.isPresent() && dto.get().state.equals("OPEN")) {
//                return new AttributedString("Course is now currently open!", AttributedStyle.DEFAULT.foreground(AttributedStyle.GREEN));
//            } else {
//                return new AttributedString("Course is either just created, canceled, done or ongoing!", AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
//            }
//        }
//        if (close) {
//            Optional<CourseDTO> dto = courseService.closeEnrollments(courseId);
//            if (dto.isPresent() && dto.get().state.equals("CLOSED")) {
//                return new AttributedString("Course is now currently done!", AttributedStyle.DEFAULT.foreground(AttributedStyle.GREEN));
//            } else {
//                return new AttributedString("Course is either just created, waiting enrollments, canceled or wating to comence!", AttributedStyle.DEFAULT.foreground(AttributedStyle.RED));
//            }
//        }
//        return new AttributedString("No action performed! Consult command instructions for help!");
//    }

    @ShellMethod(key = "progressCourse", value = "Alter the course state accordint to its natural flux.")
    @ShellMethodAvailability("isAviable")
    public AttributedString progressCourse(@ShellOption("-i") String courseId) {
        Optional<CourseDTO> course = courseService.course(courseId);
        if (course.isPresent()) {
            return switch (course.get().state) {
                case CREATED -> buildString(courseService.openEnrollments(courseId));
                case OPEN -> buildString(courseService.closeEnrollments(courseId));
                case WAITING -> buildString(courseService.openCourse(courseId));
                case OCCURING -> buildString(courseService.closeCourse(courseId));
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


}
