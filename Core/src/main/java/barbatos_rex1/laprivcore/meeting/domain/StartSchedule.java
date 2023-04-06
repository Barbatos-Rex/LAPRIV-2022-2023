package barbatos_rex1.laprivcore.meeting.domain;

import barbatos_rex1.laprivcore.personal_info.domain.Day;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ToString
public class StartSchedule {
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Id
    private Long id;
    private Day day;
    private Time time;


}
