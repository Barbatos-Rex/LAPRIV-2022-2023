package barbatos_rex1.laprivcore.meeting.domain;

import barbatos_rex1.laprivcore.user.domain.UserDTO;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
public class MeetingDTO {
    public String id;
    public String description;

    public StartScheduleDTO startTime;

    public int duration;

    public List<ParticipantDTO> participants;

    public UserDTO responsible;

    public Permission defaultPermission;

}
