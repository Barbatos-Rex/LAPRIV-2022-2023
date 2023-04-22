package barbatos_rex1.laprivcore.board.domain;

import barbatos_rex1.laprivcore.user.domain.UserDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class BoardParticipantDTO {
    public Long id;
    public UserDTO user;
    public PermissionLevel permission;
}
