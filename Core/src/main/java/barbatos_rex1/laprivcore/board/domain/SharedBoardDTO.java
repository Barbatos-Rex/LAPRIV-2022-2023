package barbatos_rex1.laprivcore.board.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
public class SharedBoardDTO {
    public String id;
    public String boardName;
    public BoardParticipantDTO owner;
    public List<BoardParticipantDTO> participants;
    public BoardMementoDTO memento;
    public Set<PostDTO> posts;
    public List<RowDTO> rows;
    public List<CollumnDTO> collumns;
}
