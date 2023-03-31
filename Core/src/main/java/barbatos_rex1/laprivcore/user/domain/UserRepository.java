package barbatos_rex1.laprivcore.user.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface UserRepository extends JpaRepository<User, StringId> {


    @Query("SELECT u from User u WHERE u.status=barbatos_rex1.laprivcore.user.domain.Status.DISABLE")
    List<User> findAllDisabled();

    @Query("SELECT u from User u WHERE u.status=barbatos_rex1.laprivcore.user.domain.Status.ENABLE")
    List<User> findAllEnabled();

    @Query("SELECT u FROM User u WHERE u.email=?1")
    Optional<User> findByEmail(Email email);


}
