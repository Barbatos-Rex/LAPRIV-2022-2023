package barbatos_rex1.laprivcore.personal_info.domain;

import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class NullProfile extends Profile {

}
