package barbatos_rex1.laprivcore.personal_info.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.HashMap;
import java.util.Map;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class Calendar {

    @EmbeddedId
    private StringId id;

    @OneToMany
    private Map<Day, DaySchedule> mapOfMeetings = new HashMap<>();


}
