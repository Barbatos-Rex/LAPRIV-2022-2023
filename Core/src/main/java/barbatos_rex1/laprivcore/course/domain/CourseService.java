package barbatos_rex1.laprivcore.course.domain;

import java.util.List;
import java.util.Optional;

public interface CourseService {

    enum Option{
        ADD,
        REPLACE
    }


    Optional<CourseDTO> createCourse(CourseDTO course);

    Optional<CourseDTO> openEnrollments(String courseCode);

    Optional<CourseDTO> closeEnrollments(String courseCode);

    Optional<CourseDTO> openCourse(String courseCode);

    Optional<CourseDTO> closeCourse(String courseCode);

    Optional<CourseDTO> setResponsibleTeacher(String courseCode, String teacherId, Option option);

    Optional<CourseDTO> addTeacher(String courseCode,String teacherId);

    Optional<CourseDTO> requestEnrollment(String courseCode, String userId);

    List<CourseDTO> courses();

    Optional<CourseDTO> course(String courseId);

    Optional<CourseDTO> bulkEnrollment(String filePath);
}
