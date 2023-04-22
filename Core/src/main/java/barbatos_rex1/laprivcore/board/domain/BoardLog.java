package barbatos_rex1.laprivcore.board.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import jakarta.persistence.*;
import lombok.*;

import java.util.Map;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class BoardLog {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToMany
    @MapKeyColumn(name = "board_alteration_entry")
    private Map<TimeStamp, BoardAlteration> log;


}
