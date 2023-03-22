package barbatos_rex1.laprivcore.course.controller;

import barbatos_rex1.laprivcore.course.domain.CourseDTO;
import barbatos_rex1.laprivcore.course.domain.CourseService;
import org.springframework.stereotype.Controller;

import java.util.Optional;

@Controller
public class CourseController {

    private CourseService service;

    //TODO Check authorization and authentication for every action
    public Optional<CourseDTO> createCourse(CourseDTO dto) {
        return service.createCourse(dto);
    }

    public Optional<CourseDTO> manipulateEnrollment(String courseCode, Options option) {
        if (option == Options.OPEN) {
            return service.openEnrollments(courseCode);
        }
        return service.closeEnrollments(courseCode);
    }

    public Optional<CourseDTO> manipulateCourseStatus(String courseCode, Options options) {
        if (options == Options.OPEN) {
            return service.openCourse(courseCode);
        }
        return service.closeCourse(courseCode);
    }

    public enum Options {
        OPEN, CLOSE;
    }


}
