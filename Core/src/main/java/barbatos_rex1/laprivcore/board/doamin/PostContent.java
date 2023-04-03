package barbatos_rex1.laprivcore.board.doamin;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@ToString
@Getter
public class PostContent {
    @Column(length = 1000)
    private String content;

    public static PostContent from(String content) {
        return new PostContent(content);
    }
}
