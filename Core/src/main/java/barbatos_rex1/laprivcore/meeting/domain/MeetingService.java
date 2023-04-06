package barbatos_rex1.laprivcore.meeting.domain;

import java.util.List;
import java.util.Optional;

public interface MeetingService {
    List<MeetingDTO> all();

    Optional<MeetingDTO> create(MeetingDTO dto);

    Optional<MeetingDTO> delete(String id);

}
