package barbatos_rex1.laprivcore.meeting.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class StartScheduleDTO {
    public long id;
    public int year;
    public int month;
    public int day;
    public int hour;
    public int minute;
}
