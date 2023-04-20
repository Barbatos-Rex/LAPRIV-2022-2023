package barbatos_rex1.laprivcore.course.domain;

import barbatos_rex1.laprivcore.shared.domain.exception.BuisnessRuleViolationException;
import barbatos_rex1.laprivcore.shared.utils.Validations;
import barbatos_rex1.laprivcore.user.domain.Role;
import barbatos_rex1.laprivcore.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Builder
@ToString
public class Teachers {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(name = "auxilary_teachers")
    private Set<User> auxilaryTeachers;


    public boolean add(User teacher) throws BuisnessRuleViolationException {
        try {
            Validations.isTrue(teacher.getRole() == Role.TEACHER);
        } catch (Exception e) {
            throw new BuisnessRuleViolationException("User assigned to teaching position is not a teacher!", e);
        }
        return auxilaryTeachers.add(teacher);
    }


}
