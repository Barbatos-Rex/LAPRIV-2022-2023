package barbatos_rex1.laprivcore.board.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.Map;

@AllArgsConstructor
@NoArgsConstructor
public class BoardLogDTO {
    public long id;
    public Map<Date, BoardAlterationDTO> alterations;
}
