package barbatos_rex1.laprivcore.user.domain;

import java.util.List;
import java.util.Optional;

public interface UserService {

    List<UserDTO> all();

    List<UserDTO> managers();

    List<UserDTO> teachers();

    List<UserDTO> students();

    List<UserDTO> allEnabled();

    List<UserDTO> allDisabled();

    boolean enableUser(String userId);

    boolean disableUser(String disableUser);


    Optional<UserDTO> user(String userId);
}
