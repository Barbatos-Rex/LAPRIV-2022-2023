package barbatos_rex1.laprivcore.board.doamin;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.MapKeyColumn;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.Map;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class BoardLog {

    @EmbeddedId
    private StringId id;

    @OneToMany
    @MapKeyColumn(name = "board_alteration_entry")
    private Map<TimeStamp, BoardAlteration> log;


}
