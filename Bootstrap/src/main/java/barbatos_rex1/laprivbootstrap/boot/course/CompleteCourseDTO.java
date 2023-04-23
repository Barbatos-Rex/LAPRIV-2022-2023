package barbatos_rex1.laprivbootstrap.boot.course;

import barbatos_rex1.laprivcore.course.domain.CourseDTO;
import barbatos_rex1.laprivcore.course.domain.CourseState;
import barbatos_rex1.laprivcore.user.domain.UserDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;


@NoArgsConstructor
public class CompleteCourseDTO extends CourseDTO {
    public UserDTO responsible;
    public List<UserDTO> auxiliaryTeachers;
    public List<UserDTO> requestedEnrollments;

    public List<UserDTO> enrollments;

    public CompleteCourseDTO(String code, int maxCapacity, int minCapacity, String title,
                             CourseState state, UserDTO responsible, List<UserDTO> auxiliaryTeachers,
                             List<UserDTO> requestedEnrollments, List<UserDTO> enrollments) {
        super(code, maxCapacity, minCapacity, title, state);
        this.responsible = responsible;
        this.auxiliaryTeachers = auxiliaryTeachers;
        this.requestedEnrollments = requestedEnrollments;
        this.enrollments = enrollments;
    }
}
