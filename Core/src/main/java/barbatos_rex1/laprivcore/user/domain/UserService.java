package barbatos_rex1.laprivcore.user.domain;

import java.util.List;

public interface UserService {

    List<UserDTO> all();

    List<UserDTO> allEnabled();

    List<UserDTO> allDisabled();

    boolean enableUser(String userId);

    boolean disableUser(String disableUser);


}
