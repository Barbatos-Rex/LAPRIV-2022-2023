package barbatos_rex1.laprivcore.user.domain;

import java.util.Optional;

public interface AuthzService {


    Optional<UserDTO> login(String email, String password);

    Optional<UserDTO> register(CreateUserDTO user);

    Optional<UserDTO> logout();

    //Taking advantage of singleton property of SPRING Beans https://stackoverflow.com/questions/31629993/is-spring-default-scope-singleton-or-not
    Optional<UserDTO> currentSession();

    boolean isAuthorized(Role... roles);

}
