package barbatos_rex1.laprivcore.meeting.domain;

import barbatos_rex1.laprivcore.personal_info.domain.Day;
import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.user.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface MeetingRepository extends JpaRepository<Meeting, StringId> {


    @Query("SELECT m FROM Meeting m WHERE m.startTime.day=?2 and m.responsible = ?1")
    List<Meeting> findAllMeetingsOfUserIn(User responsible, Day day);


}
