package barbatos_rex1.laprivcore.board.domain;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class BoardAlterationDTO {
    public long id;
    public BoardParticipantDTO actor;
    public String alteration;
}
