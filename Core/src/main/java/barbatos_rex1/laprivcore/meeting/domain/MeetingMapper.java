package barbatos_rex1.laprivcore.meeting.domain;

import barbatos_rex1.laprivcore.personal_info.domain.Day;
import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.user.domain.UserMapper;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class MeetingMapper {

    private UserMapper userMapper;


    private ParticipantDTO toDTO(Participant domain) {
        return new ParticipantDTO(domain.getId().getId(), userMapper.toDTO(domain.getUser()),
                domain.getPermission());
    }

    private Participant toDomain(ParticipantDTO dto) {
        var builder = Participant.builder();
        var user = userMapper.toDomain(dto.user).getProxi();
        return builder.id(StringId.from(dto.id))
                .user(user).permission(dto.permission)
                .build();
    }

    private StartScheduleDTO toDTO(StartSchedule domain) {
        return new StartScheduleDTO(domain.getId(),
                domain.getDay().getYear(), domain.getDay().getMonth(), domain.getDay().getDay(),
                domain.getTime().getHour(), domain.getTime().getMinutes());
    }

    private StartSchedule toDomain(StartScheduleDTO dto) {
        return StartSchedule.builder().id(dto.id)
                .day(Day.from(dto.year, dto.month, dto.day))
                .time(Time.from(dto.hour, dto.minute)).build();

    }


    public MeetingDTO toDTO(Meeting domain) {
        return new MeetingDTO(domain.getId().getId(),
                toDTO(domain.getStartTime()), domain.getDuration().getDuration(),
                domain.getParticipants().stream().map(this::toDTO).toList(),
                userMapper.toDTO(domain.getResponsible()), domain.getDefaultPermission());
    }

    public Meeting toDomain(MeetingDTO dto) {
        var builder = Meeting.builder();
        var user = userMapper.toDomain(dto.responsible);
        return builder.id(StringId.from(dto.id)).
                startTime(toDomain(dto.startTime)).
                duration(Duration.from(dto.duration))
                .participants(dto.participants.stream().map(this::toDomain).toList())
                .responsible(user.getProxi()).defaultPermission(dto.defaultPermission).build();
    }


}
