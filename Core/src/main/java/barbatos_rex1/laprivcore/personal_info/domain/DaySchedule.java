package barbatos_rex1.laprivcore.personal_info.domain;

import barbatos_rex1.laprivcore.meeting.domain.Meeting;
import jakarta.persistence.*;
import lombok.*;

import java.util.Set;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class DaySchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    private Set<Meeting> meetings;


}
