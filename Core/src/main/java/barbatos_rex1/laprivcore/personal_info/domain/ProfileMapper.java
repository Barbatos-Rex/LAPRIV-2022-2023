package barbatos_rex1.laprivcore.personal_info.domain;

import lombok.SneakyThrows;
import org.springframework.stereotype.Component;

@Component
public class ProfileMapper {

    @SneakyThrows
    public Profile toDomain(ProfileDTO dto) {
        if (dto instanceof TeacherProfileDTO teacherProfileDTO) {
            return new ProfileFactory().createTeacherProfile(teacherProfileDTO);
        }

        if (dto instanceof StudentProfileDTO studentProfileDTO) {
            return new ProfileFactory().createStudentProfile(studentProfileDTO);
        }
        return new ProfileFactory().createManagerProfile(dto);
    }

    public ProfileDTO toDTO(Profile domain) {
        if (domain instanceof TeacherProfile teacherProfile) {
            var dto = new TeacherProfileDTO();
            dto.id = teacherProfile.getUserId().getId();
            dto.birthDate = teacherProfile.getBirthDate().getBirthDate();
            dto.taxNumber = teacherProfile.getTaxNumber().getTaxNumber();
            dto.acronym = teacherProfile.getAcronym().getAcronym();
            return dto;
        }
        if (domain instanceof StudentProfile studentProfile) {
            var dto = new StudentProfileDTO();
            dto.id = studentProfile.getUserId().getId();
            dto.birthDate = studentProfile.getBirthDate().getBirthDate();
            dto.taxNumber = studentProfile.getTaxNumber().getTaxNumber();
            dto.mechanographicNumber = studentProfile.getMechanographicNumber().getMechanographicNumber();
            return dto;
        }
        return new ProfileDTO(domain.getUserId().getId(), domain.getBirthDate().getBirthDate(), domain.getTaxNumber().getTaxNumber());
    }


}
