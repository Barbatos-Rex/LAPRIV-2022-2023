package barbatos_rex1.laprivcore.board.doamin;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.shared.domain.value_objects.Title;
import jakarta.persistence.AttributeOverride;
import jakarta.persistence.Column;
import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class BoardColumn {

    @EmbeddedId
    private StringId id;

    private Title title;

    @AttributeOverride(name = "index", column = @Column(name = "boardIndex"))
    private Index number;
}
