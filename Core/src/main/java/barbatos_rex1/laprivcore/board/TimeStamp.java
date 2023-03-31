package barbatos_rex1.laprivcore.board;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.util.Date;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
public class TimeStamp {

    private Date stamp;

    public static TimeStamp from(Date date) {
        return new TimeStamp(date);
    }

    public static TimeStamp newStamp() {
        return new TimeStamp(new Date());
    }


}
