package barbatos_rex1.laprivcore.meeting.domain;

import barbatos_rex1.laprivcore.shared.utils.Validations;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
@EqualsAndHashCode
public class Time {
    private int hour;
    private int minutes;


    public static Time from(int hour, int minutes) {
        Validations.isTrue(hour >= 0);
        Validations.isTrue(minutes >= 0);
        Validations.isTrue(hour < 25);
        Validations.isTrue(minutes < 60);
        return new Time(hour, minutes);
    }

    public boolean isBefore(Time time) {
        if (hour == time.hour) {
            return minutes < time.minutes;
        }
        return hour < time.hour;
    }

    public boolean overlaps(Duration duration, Time time) {
        if (isBefore(time)) {
            if (hour + duration.getDuration() / 60 == time.hour) {
                return minutes + duration.getDuration() % 60 < time.minutes;
            }
            return hour + duration.getDuration() / 60 < time.hour;
        }

        if (time.hour + duration.getDuration() / 60 == hour) {
            return time.minutes + duration.getDuration() % 60 < minutes;
        }
        return time.hour + duration.getDuration() / 60 < hour;
    }


}
