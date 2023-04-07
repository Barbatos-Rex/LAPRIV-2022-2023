package barbatos_rex1.laprivbootstrap.boot;

import barbatos_rex1.laprivcore.personal_info.domain.ProfileDTO;
import barbatos_rex1.laprivcore.user.domain.AuthzService;
import barbatos_rex1.laprivcore.user.domain.CreateUserDTO;
import barbatos_rex1.laprivcore.user.domain.Role;
import barbatos_rex1.laprivcore.user.domain.Status;
import lombok.AllArgsConstructor;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
@AllArgsConstructor
public class UserBootstrapper implements CommandLineRunner {

    private AuthzService service;


    @Override
    public void run(String... args) throws Exception {

        var adm = new CreateUserDTO();
        adm.email = "master@no-reply.org";
        adm.password = "Qwerty123";
        adm.fullName = "Master Admin";
        adm.shortName = "Master";
        adm.status = Status.ENABLE;
        adm.role = Role.MANAGER;
        adm.profile = new ProfileDTO();
        adm.profile.birthDate = new Date();
        adm.profile.taxNumber = "000000000";
        service.register(adm);
    }
}
