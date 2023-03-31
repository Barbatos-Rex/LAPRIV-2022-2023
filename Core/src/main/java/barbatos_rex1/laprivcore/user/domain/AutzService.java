package barbatos_rex1.laprivcore.user.domain;

import java.util.Optional;

public interface AutzService {


    Optional<UserDTO> login(String email, String password);

    Optional<UserDTO> register(CreateUserDTO user);

    Optional<UserDTO> logout();

    default Optional<UserDTO> registerAndLogin(CreateUserDTO user) {
        var u = register(user);
        if (u.isPresent()) {
            return login(u.get().email, user.password);
        }
        return Optional.empty();
    }

    //Taking advantage of singleton property of SPRING Beans https://stackoverflow.com/questions/31629993/is-spring-default-scope-singleton-or-not
    Optional<UserDTO> currentSession();

    boolean isAuthorized(Role... roles);

}
