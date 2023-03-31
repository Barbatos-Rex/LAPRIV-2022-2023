package barbatos_rex1.laprivcore.meeting;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.user.domain.User;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class Meeting {

    @EmbeddedId
    private StringId id;

    private StartSchedule startTime;

    private Duration duration;

    @OneToMany
    private List<Participant> participants;

    @ManyToOne
    private User responsible;

    @Enumerated(EnumType.STRING)
    private Permission defaultPermission;


}
