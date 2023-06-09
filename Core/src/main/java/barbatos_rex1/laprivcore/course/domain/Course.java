package barbatos_rex1.laprivcore.course.domain;

import barbatos_rex1.laprivcore.shared.domain.exception.BuisnessRuleViolationException;
import barbatos_rex1.laprivcore.shared.domain.value_objects.Title;
import barbatos_rex1.laprivcore.user.domain.Role;
import barbatos_rex1.laprivcore.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.HashSet;


@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor
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

    @ManyToOne
    private User responsibleTeacher;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Teachers auxilaryTeachers;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Enrollments enrolledStudents;

    @OneToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private Enrollments requestedEnrollments;

    @Enumerated(value = EnumType.STRING)
    private CourseState state;

    public void openEnrollments() {
        if (state == CourseState.CREATED) {
            this.state = CourseState.OPEN;
        }
    }

    public void closeEnrollments() {
        if (enrolledStudents.number() < minCapacity.getCapacity()) {
            this.state = CourseState.CANCELED;
        }
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

    public void initialize() {
        if (enrolledStudents == null) {
            enrolledStudents = Enrollments.builder().students(new HashSet<>()).build();
        }
        if (auxilaryTeachers == null) {
            auxilaryTeachers = Teachers.builder().auxilaryTeachers(new HashSet<>()).build();
        }
        if (requestedEnrollments == null) {
            requestedEnrollments = Enrollments.builder().students(new HashSet<>()).build();
        }
    }

    @SneakyThrows
    public void assignResponsibleTeacher(User user) {
        if (responsibleTeacher != null) {
            throw new BuisnessRuleViolationException("Course already has responsible teacher!");
        }
        replaceResponsibleTeacher(user);
    }

    @SneakyThrows
    public void replaceResponsibleTeacher(User user) {
        if (user.getRole() != Role.TEACHER) {
            throw new BuisnessRuleViolationException("Assigned user to course responsible is not a teacher");
        }
        responsibleTeacher = user;
    }

    public boolean isTeacher(User user) {
        return user.getId().equals(responsibleTeacher.getId()) || auxilaryTeachers.getAuxilaryTeachers().stream().anyMatch(t -> t.getId().equals(user.getId()));
    }
}