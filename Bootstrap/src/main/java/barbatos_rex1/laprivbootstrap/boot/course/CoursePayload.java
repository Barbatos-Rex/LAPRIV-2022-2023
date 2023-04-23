package barbatos_rex1.laprivbootstrap.boot.course;

import barbatos_rex1.laprivcore.course.domain.CourseState;
import barbatos_rex1.laprivcore.user.domain.Status;
import barbatos_rex1.laprivcore.user.domain.UserService;
import lombok.Getter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Getter
@Component
@Order(2)
public class CoursePayload {
    private UserService userService;
    private List<CompleteCourseDTO> payload;
    private static Logger logger = LoggerFactory.getLogger(CoursePayload.class);

    public CoursePayload(UserService service) {
        this.userService = service;
        this.payload = new ArrayList<>();


    }

    public void build() {
        logger.trace("Starting course payload creation...");
        CompleteCourseDTO c1 = new CompleteCourseDTO();
        c1.code = "Intro-Java-Sem01";
        c1.maxCapacity = 100;
        c1.minCapacity = 50;
        c1.title = "Introduction to Java";
        c1.state = CourseState.CREATED;
        c1.responsible = userService.teachers().stream().filter(u -> u.status != Status.DISABLED).toList().get(0);
        c1.auxiliaryTeachers = userService.teachers().stream().filter(u -> !u.id.equals(c1.responsible.id)).toList();
        c1.requestedEnrollments = userService.students();
        c1.enrollments = new ArrayList<>();
        payload.add(c1);

        CompleteCourseDTO c2 = new CompleteCourseDTO();
        c2.code = "Data-Structures-Sem01";
        c2.maxCapacity = 200;
        c2.minCapacity = 100;
        c2.title = "Data Structures - From Collections to Graphs and Trees";
        c2.state = CourseState.CREATED;
        c2.responsible = null;
        c2.auxiliaryTeachers = new ArrayList<>();
        c2.requestedEnrollments = new ArrayList<>();
        c2.enrollments = new ArrayList<>();
        payload.add(c2);

        logger.trace("Course payload created!");
        logger.trace(payload.toString());
    }
}
