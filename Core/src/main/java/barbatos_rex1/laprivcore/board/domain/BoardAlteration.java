package barbatos_rex1.laprivcore.board.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class BoardAlteration {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(cascade = CascadeType.ALL)
    private BoardParticipant actor;

    private Alteration alteration;
}
