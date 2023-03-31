package barbatos_rex1.laprivcore.user.domain;

import java.util.List;

public interface UserService {

    List<UserDTO> all();

    boolean enableUser(String userId);

    boolean disableUser(String disableUser);


}
