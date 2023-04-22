package barbatos_rex1.laprivcore.board.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import jakarta.persistence.*;
import lombok.*;
import org.springframework.beans.factory.annotation.Value;

import java.util.Set;

@Entity
@Getter
@AllArgsConstructor(access = AccessLevel.PRIVATE)
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Builder
@ToString
public class BoardStateMemento {

    @Value("${sharedboard.maxStoredStatesPerBoard}")
    private static int maxAllowedStates;


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @OneToOne
    private BoardStateMemento previousState;

    @OneToOne
    private BoardStateMemento nextState;

    @OneToOne(cascade = CascadeType.ALL)
    private BoardLog stateLog;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Post> postsStates;

    private static BoardStateMemento recursiveAppend(BoardStateMemento state, BoardStateMemento newState, int level) {
        if (state == null || level == maxAllowedStates) {
            return newState;
        }
        BoardStateMemento tail = recursiveAppend(state.previousState, newState, level);
        state.previousState = tail;
        tail.nextState = state;
        return state;
    }

    public BoardStateMemento appendState(BoardStateMemento memento) {
        return recursiveAppend(this, memento, 0);
    }

    public BoardStateMemento goBack() {
        this.previousState.nextState = null;
        var result = this.previousState;
        this.previousState = null;
        return result;
    }


}
