package barbatos_rex1.laprivbootstrap.boot.course;

import barbatos_rex1.laprivbootstrap.boot.Bootstrapper;
import barbatos_rex1.laprivcore.course.domain.CourseService;
import barbatos_rex1.laprivcore.user.domain.UserDTO;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
@Order(2)
public class CourseBootstrapper implements Bootstrapper, CommandLineRunner {

    private CoursePayload payload;
    private CourseService service;
    private static Logger logger = LoggerFactory.getLogger(CourseBootstrapper.class);


    @Override
    public void boot() {
        this.payload.build();
        List<CompleteCourseDTO> payload = this.payload.getPayload();
        logger.trace("Start course payload injection...");
        for (CompleteCourseDTO c : payload) {
            try {
                service.createCourse(c);
                if (c.responsible != null) {
                    service.setResponsibleTeacher(c.code, c.responsible.id, CourseService.Option.REPLACE);
                }
                for (UserDTO u : c.auxiliaryTeachers) {
                    service.addTeacher(c.code, u.id);
                }
                for (UserDTO u : c.requestedEnrollments) {
                    service.requestEnrollment(c.code, u.id);
                }
                logger.debug("Course registered (or overwritten): " + c);
            } catch (Exception e) {
                logger.warn("Could not save course: " + c, e);
            }
        }
    }
}
