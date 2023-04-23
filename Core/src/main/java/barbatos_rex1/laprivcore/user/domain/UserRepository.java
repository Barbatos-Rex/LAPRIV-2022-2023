package barbatos_rex1.laprivcore.user.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, StringId> {


    @Query("SELECT u from User u WHERE u.status=barbatos_rex1.laprivcore.user.domain.Status.DISABLED")
    List<User> findAllDisabled();

    @Query("SELECT u from User u WHERE u.status=barbatos_rex1.laprivcore.user.domain.Status.ENABLED")
    List<User> findAllEnabled();

    @Query("SELECT u FROM User u WHERE u.email=?1")
    Optional<User> findByEmail(Email email);


    @Query("SELECT u FROM User u WHERE u.role=barbatos_rex1.laprivcore.user.domain.Role.MANAGER")
    List<User> findAllManagers();

    @Query("SELECT u FROM User u WHERE u.role=barbatos_rex1.laprivcore.user.domain.Role.TEACHER")
    List<User> findAllTeachers();

    @Query("SELECT u FROM User u WHERE u.role=barbatos_rex1.laprivcore.user.domain.Role.STUDENT")
    List<User> findAllStudents();
}
