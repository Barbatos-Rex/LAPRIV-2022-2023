package barbatos_rex1.laprivbootstrap.boot;

import barbatos_rex1.laprivcore.personal_info.domain.ProfileDTO;
import barbatos_rex1.laprivcore.user.domain.*;
import lombok.AllArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.List;

@Component
@AllArgsConstructor
public class UserBootstrapper implements CommandLineRunner, Bootstrapper {

    private AuthzService service;
    private UserPayload payload;
    private static Logger logger= LoggerFactory.getLogger(UserPayload.class);

    @Override
    public void boot() {
        List<CreateUserDTO> payload = this.payload.payload();
        logger.trace("Start user payload injection...");
        for (CreateUserDTO u : payload){
            try{
                service.register(u);
                logger.debug("User registered: "+u);
            }catch (Exception e){
                logger.warn("User already registered: "+u);
            }
        }
    }
}
