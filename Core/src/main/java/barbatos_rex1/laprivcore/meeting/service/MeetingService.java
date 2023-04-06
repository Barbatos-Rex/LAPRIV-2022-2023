package barbatos_rex1.laprivcore.meeting.service;

import barbatos_rex1.laprivcore.meeting.domain.*;
import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.shared.domain.exception.BuisnessRuleViolationException;
import barbatos_rex1.laprivcore.shared.domain.exception.ValidationException;
import barbatos_rex1.laprivcore.shared.utils.Validations;
import barbatos_rex1.laprivcore.user.domain.User;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class MeetingService implements barbatos_rex1.laprivcore.meeting.domain.MeetingService {

    private MeetingRepository repo;
    private MeetingMapper mapper;

    @Override
    public List<MeetingDTO> all() {
        return repo.findAll().stream().map(mapper::toDTO).toList();
    }

    @Override
    public Optional<MeetingDTO> create(MeetingDTO dto) {
        var m = mapper.toDomain(dto);
        verifyOverlaping(m.getResponsible(), m.getStartTime(), m);
        var met = repo.save(m);
        if (met == null) {
            return Optional.empty();
        }
        return Optional.of(mapper.toDTO(met));
    }

    @SneakyThrows
    private void verifyOverlaping(User responsible, StartSchedule startSchedule, Meeting meeting) {
        try {
            var results = repo.findAllMeetingsOfUserIn(responsible, startSchedule.getDay());
            for (Meeting m : results) {
                Validations.isFalse(m.getStartTime().getTime().overlaps(meeting.getDuration(), meeting.getStartTime().getTime()));
            }
        } catch (ValidationException e) {
            throw new BuisnessRuleViolationException("Meeting in question overlaps with other meeting!", e);
        }
    }

    @Override
    public Optional<MeetingDTO> delete(String id) {
        var m = repo.findById(StringId.from(id));
        if (m.isPresent()) {
            repo.delete(m.get());
            return m.map(mapper::toDTO);
        }
        return Optional.empty();
    }
}
