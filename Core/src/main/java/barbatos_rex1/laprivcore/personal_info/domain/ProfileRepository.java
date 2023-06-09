package barbatos_rex1.laprivcore.personal_info.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface ProfileRepository extends JpaRepository<Profile, StringId> {
    @Query("SELECT p FROM Profile p JOIN StudentProfile sp ON p.userId=sp.userId")
    List<Profile> findAllStudentProfiles();

    @Query("SELECT p FROM Profile p JOIN TeacherProfile tpr ON p.userId=tpr.userId")
    List<Profile> findAllTeacherProfiles();

    @Query("SELECT p FROM Profile p JOIN ManagerProfile sp ON p.userId=sp.userId")
    List<Profile> findAllManagerProfiles();

    @Query("SELECT p FROM Profile p JOIN User u ON u.profile.userId=p.userId WHERE u.id=?1")
    Optional<Profile> findProfileByUserId(StringId userId);

}
