package barbatos_rex1.laprivcore.board.domain;

import jakarta.persistence.Embeddable;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Embeddable
@NoArgsConstructor(access = lombok.AccessLevel.PROTECTED)
@AllArgsConstructor(access = lombok.AccessLevel.PRIVATE)
@ToString
@Getter
public class Alteration {
    private String alteration;

    public static Alteration from(String alteration) {
        return new Alteration(alteration);
    }

}
