package barbatos_rex1.laprivcore.course.domain;

import barbatos_rex1.laprivcore.shared.domain.value_objects.Title;
import jakarta.persistence.*;
import lombok.*;


@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class Course {

    @EmbeddedId
    @AttributeOverride(name = "code", column = @Column(unique = true))
    private Code uniqueCode;
    @AttributeOverride(name = "capacity", column = @Column(name = "maxCapacity"))
    private Capacity maxCapacity;
    @AttributeOverride(name = "capacity", column = @Column(name = "minCapacity"))
    private Capacity minCapacity;
    private Title title;

    @Enumerated(value = EnumType.STRING)
    private CourseState state;

    public void openEnrollments() {
        if (state == CourseState.CREATED) {
            this.state = CourseState.OPEN;
        }
    }

    public void closeEnrollments() {
        if (state == CourseState.OPEN) {
            this.state = CourseState.WAITING;
        }
    }

    public void openCourse() {
        if (state == CourseState.WAITING) {
            this.state = CourseState.OCCURING;
        }
    }

    public void closeCourse() {
        if (state == CourseState.OCCURING) {
            this.state = CourseState.DONE;
        }
    }
}