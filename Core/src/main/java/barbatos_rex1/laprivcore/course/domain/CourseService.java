package barbatos_rex1.laprivcore.course.domain;

import barbatos_rex1.laprivcore.meeting.domain.Permission;
import barbatos_rex1.laprivcore.shared.domain.exception.BuisnessRuleViolationException;
import lombok.SneakyThrows;

import java.io.InputStream;
import java.util.Date;
import java.util.List;
import java.util.Optional;

public interface CourseService {
    enum Option {
        ADD,
        REPLACE
    }

    enum DayOfWeek {
        MONDAY,
        TUESDAY,
        WEDNESDAY,
        THURSDAY,
        FRIDAY,
        SATURDAY,
        SUNDAY
    }


    Optional<CourseDTO> createCourse(CourseDTO course);

    Optional<CourseDTO> openEnrollments(String courseCode);

    Optional<CourseDTO> closeEnrollments(String courseCode);

    Optional<CourseDTO> openCourse(String courseCode);

    Optional<CourseDTO> closeCourse(String courseCode);

    Optional<CourseDTO> setResponsibleTeacher(String courseCode, String teacherId, Option option);

    Optional<CourseDTO> addTeacher(String courseCode, String teacherId);

    Optional<CourseDTO> requestEnrollment(String courseCode, String userId);

    List<CourseDTO> courses();

    Optional<CourseDTO> course(String courseId);

    List<BuisnessRuleViolationException> bulkEnrollment(InputStream stream);

    void sheduleClassForCourse(String courseCode, String userId, Date firstClass, Permission defaultPermission, boolean fullSemester);

//    List<>
}
