package barbatos_rex1.laprivcore.board;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
public class Index {
    private int index;

    public static Index from(int index) {
        return new Index(index);
    }


}
