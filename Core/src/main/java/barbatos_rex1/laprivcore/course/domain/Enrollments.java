package barbatos_rex1.laprivcore.course.domain;

import barbatos_rex1.laprivcore.shared.domain.exception.BuisnessRuleViolationException;
import barbatos_rex1.laprivcore.user.domain.Role;
import barbatos_rex1.laprivcore.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@ToString
public class Enrollments {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name="enrolled_students")
    private Set<User> students;

    public int number() {
        return students.size();
    }

    @SneakyThrows
    public boolean add(User student){
        if(student.getRole()!= Role.STUDENT){
            throw new BuisnessRuleViolationException("Cannot request enrollment unless you are a student!");
        }
        return students.add(student);
    }
}
