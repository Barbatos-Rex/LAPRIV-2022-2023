package barbatos_rex1.laprivcore.board.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.shared.domain.value_objects.Title;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class BoardColumn {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Title title;

    @AttributeOverride(name = "index", column = @Column(name = "boardIndex"))
    private Index number;
}
