package barbatos_rex1.laprivcore.user;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class User {


    @EmbeddedId
    private StringId id;

    private Email email;

    private Name shortName;

    private FullName fullName;

    private Password password;

    private Role role;




}
