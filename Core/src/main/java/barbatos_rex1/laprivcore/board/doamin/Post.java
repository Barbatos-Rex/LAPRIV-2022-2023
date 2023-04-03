package barbatos_rex1.laprivcore.board.doamin;

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
public class Post {
    @EmbeddedId
    private StringId id;

    @ManyToOne
    private BoardRow boardRow;

    @ManyToOne
    private BoardColumn boardBoardColumn;

    private PostContent postContent;

    private TimeStamp stamp;


}
