package barbatos_rex1.laprivcore.board.doamin;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.shared.domain.value_objects.Title;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;
import java.util.Set;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class SharedBoard {
    @EmbeddedId
    private StringId id;

    private Title boardName;

    @ManyToOne
    private BoardParticipant owner;

    @ManyToMany
    private List<BoardParticipant> boardParticipants;

    @OneToOne
    private BoardStateMemento memento;

    @OneToMany
    private List<BoardColumn> colList;

    @OneToMany
    private List<BoardRow> boardRowList;

    @OneToMany
    private Set<Post> posts;


}
