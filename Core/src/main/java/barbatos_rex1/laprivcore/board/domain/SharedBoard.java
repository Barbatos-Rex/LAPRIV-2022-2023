package barbatos_rex1.laprivcore.board.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.shared.domain.value_objects.Title;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
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

    @ManyToMany(cascade = CascadeType.ALL)
    private List<BoardParticipant> boardParticipants = new ArrayList<>();

    @OneToOne(cascade = CascadeType.ALL)
    private BoardStateMemento memento;

    @OneToMany
    private List<BoardColumn> colList = new ArrayList<>();

    @OneToMany
    private List<BoardRow> boardRowList = new ArrayList<>();

    @OneToMany
    private Set<Post> posts = new HashSet<>();


}
