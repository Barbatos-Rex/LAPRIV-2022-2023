package barbatos_rex1.laprivcore.meeting.domain;

import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter

public class Description {
    private String description;

    public static Description of(String description) {
        return new Description(description);
    }
}
