package barbatos_rex1.laprivcore.board.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class BoardMementoDTO {

    public long id;

    public BoardMementoDTO previousState;

    public BoardLogDTO log;

}
