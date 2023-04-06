package barbatos_rex1.laprivcore.meeting.domain;

import barbatos_rex1.laprivcore.user.domain.UserDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
public class ParticipantDTO {
    public String id;
    public UserDTO user;
    public Permission permission;
}
