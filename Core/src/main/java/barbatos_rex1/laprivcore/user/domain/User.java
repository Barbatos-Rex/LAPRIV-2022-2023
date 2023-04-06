package barbatos_rex1.laprivcore.user.domain;

import barbatos_rex1.laprivcore.course.domain.Course;
import barbatos_rex1.laprivcore.personal_info.domain.Profile;
import barbatos_rex1.laprivcore.shared.domain.StringId;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class User {
    @EmbeddedId
    private StringId id;

    @AttributeOverride(name = "email", column = @Column(unique = true))
    private Email email;

    @AttributeOverride(name = "name", column = @Column(name = "shortName"))
    private Name shortName;

    @AttributeOverride(name = "name", column = @Column(name = "fullName"))
    private FullName fullName;

    private Password password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Enumerated(EnumType.STRING)
    private Status status;

    @OneToOne(fetch = FetchType.LAZY)
    private Profile profile;

    @ManyToMany(fetch = FetchType.LAZY)
    private List<Course> accessibleCourses = new ArrayList<>();

    public boolean enableUser() {
        if (status == Status.DISABLE) {
            status = Status.ENABLE;
            return true;
        }
        return false;
    }

    public boolean disableUser() {
        if (status == Status.ENABLE) {
            status = Status.DISABLE;
            return true;
        }
        return false;
    }
}
