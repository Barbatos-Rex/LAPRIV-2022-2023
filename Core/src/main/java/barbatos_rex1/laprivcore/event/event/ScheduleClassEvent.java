package barbatos_rex1.laprivcore.event.event;

import barbatos_rex1.laprivcore.event.Event;
import barbatos_rex1.laprivcore.meeting.domain.MeetingDTO;
import barbatos_rex1.laprivcore.meeting.domain.Participant;
import barbatos_rex1.laprivcore.meeting.domain.ParticipantDTO;
import barbatos_rex1.laprivcore.personal_info.domain.Profile;
import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@Getter
@AllArgsConstructor
public class ScheduleClassEvent implements Event {

    MeetingDTO meeting;

    @Override
    public String getDescription() {
        return String.format("Schedule meeting by %s%nWith:%n%s",meeting.responsible.fullName,
                meeting.participants.stream().map(p -> String.format("%s, with permissions %s",p.user.fullName,p.permission)).toList());
    }

    @Override
    public String getId() {
        return StringId.newId().getId();
    }
}
