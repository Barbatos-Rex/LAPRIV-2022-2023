package barbatos_rex1.laprivcore.course.domain;

import barbatos_rex1.laprivcore.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

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
    @JoinTable(name="auxilary_teachers")
    private List<User> auxilaryTeachers;
}
