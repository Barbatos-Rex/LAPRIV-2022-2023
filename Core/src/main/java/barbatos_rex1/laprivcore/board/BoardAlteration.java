package barbatos_rex1.laprivcore.board;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class BoardAlteration {
    @EmbeddedId
    private StringId id;
    @ManyToOne
    private BoardParticipant actor;

    private Alteration alteration;
}
