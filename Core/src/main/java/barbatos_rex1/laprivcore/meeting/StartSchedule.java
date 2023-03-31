package barbatos_rex1.laprivcore.meeting;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.util.Date;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
public class StartSchedule {
    private Date start;

    public static StartSchedule from(Date start) {
        return new StartSchedule(start);
    }
}
