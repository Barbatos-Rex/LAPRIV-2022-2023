package barbatos_rex1.laprivbootstrap.boot.user;

import barbatos_rex1.laprivcore.personal_info.domain.ProfileDTO;
import barbatos_rex1.laprivcore.personal_info.domain.StudentProfileDTO;
import barbatos_rex1.laprivcore.personal_info.domain.TeacherProfileDTO;
import barbatos_rex1.laprivcore.user.domain.CreateUserDTO;
import barbatos_rex1.laprivcore.user.domain.Role;
import barbatos_rex1.laprivcore.user.domain.Status;
import lombok.Getter;
import lombok.SneakyThrows;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Component
@Getter
@Order(1)
public class UserPayload {

    private List<CreateUserDTO> payload;
    private List<String> emails;
    private String defaultPassword = "Qwerty123";
    private List<String> fullNames;
    private List<String> shortNames;
    private List<Status> status;
    private List<Role> roles;
    private List<ProfileDTO> profiles;
    private Logger logger = LoggerFactory.getLogger(UserPayload.class);

    public UserPayload() {
        logger.trace("Starting user payload creation...");
        this.payload = new ArrayList<>();
        this.emails= buildEmails();
        this.fullNames=buildFNames();
        this.shortNames=buildSNames();
        this.status=buildStatus();
        this.roles=buildRoles();
        this.profiles=buildProfiles();
        for (int i = 0; i < emails.size(); i++) {
            CreateUserDTO u = new CreateUserDTO();
            u.profile=profiles.get(i);
            u.role=roles.get(i);
            u.password=defaultPassword;
            u.shortName=shortNames.get(i);
            u.fullName=fullNames.get(i);
            u.email=emails.get(i);
            u.status=status.get(i);
            logger.debug("Adding user to payload: "+u);
            payload.add(u);
        }
        logger.trace("User payload created!");
        logger.trace(payload.toString());
    }

    @SneakyThrows
    private List<ProfileDTO> buildProfiles() {
        var sdf = new SimpleDateFormat("dd/MM/yyyy");
        List<ProfileDTO> profiles = new ArrayList<>();
        ProfileDTO p5 = new ProfileDTO();
        p5.birthDate=new Date();
        p5.taxNumber="0000";
        profiles.add(p5);
        StudentProfileDTO p1 = new StudentProfileDTO();
        p1.mechanographicNumber=1190387;
        p1.taxNumber="0000";
        p1.birthDate=sdf.parse("13/07/2001");
        profiles.add(p1);
        TeacherProfileDTO p2 = new TeacherProfileDTO();
        p2.acronym="ALG";
        p2.taxNumber="0000";
        p2.birthDate=sdf.parse("13/07/1995");
        profiles.add(p2);
        ProfileDTO p3 = new ProfileDTO();
        p3.taxNumber="0000";
        p3.birthDate=sdf.parse("13/07/2001");
        profiles.add(p3);
        StudentProfileDTO p4 = new StudentProfileDTO();
        p4.birthDate=sdf.parse("01/01/2001");
        p4.mechanographicNumber=1190616;
        p4.taxNumber="0000";
        profiles.add(p4);
        return profiles;
    }

    private List<Role> buildRoles() {
        return List.of(Role.MANAGER,Role.STUDENT,Role.TEACHER,Role.MANAGER,Role.STUDENT);
    }

    private List<Status> buildStatus() {
        return List.of(Status.ENABLED,Status.ENABLED,Status.ENABLED,Status.DISABLED,Status.ENABLED);
    }

    private List<String> buildSNames() {
        return List.of("Master","1190387","ALG","NEW","1190616");
    }

    private List<String> buildFNames() {
        return List.of("Master Admin","André L. Gomes", "André L. Gomes", "Nuno E. Wellington", "Gonçalo Lima Boa-Nova");
    }

    private List<String> buildEmails() {
        return List.of("master@no-reply.org","1190387@isep.ipp.pt","alg@isep.ipp.pt","new@isep.ipp.pt","1190616@isep.ipp.pt");
    }

    public List<CreateUserDTO> payload() {
        return payload;
    }
}
