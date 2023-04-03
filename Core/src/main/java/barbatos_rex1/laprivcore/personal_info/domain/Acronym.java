package barbatos_rex1.laprivcore.personal_info.domain;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
public class Acronym {
    private String acronym;

    public static Acronym from(String acronym) {
        return new Acronym(acronym);
    }
}
