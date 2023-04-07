package barbatos_rex1.laprivcore.personal_info.domain;

import barbatos_rex1.laprivcore.shared.domain.StringId;
import barbatos_rex1.laprivcore.shared.domain.exception.BuisnessRuleViolationException;
import barbatos_rex1.laprivcore.shared.domain.exception.ValidationException;
import barbatos_rex1.laprivcore.shared.utils.Validations;

import java.util.HashMap;

public class ProfileFactory {


    @SuppressWarnings("all")
    public Profile createStudentProfile(ProfileDTO profileDTO) throws BuisnessRuleViolationException {
        try {
            Validations.isTrue(profileDTO instanceof StudentProfileDTO);
        } catch (ValidationException e) {
            throw new BuisnessRuleViolationException("Cannot create student profile!", e);
        }
        return new StudentProfile(StringId.from(profileDTO.id), BirthDate.from(profileDTO.birthDate),
                TaxNumber.from(profileDTO.taxNumber),
                MechanographicNumber.from(((StudentProfileDTO) profileDTO).mechanographicNumber),
                Calendar.builder().mapOfMeetings(new HashMap<>()).build());
    }

    @SuppressWarnings("all")
    public Profile createTeacherProfile(ProfileDTO profileDTO) throws BuisnessRuleViolationException {
        try {
            Validations.isTrue(profileDTO instanceof TeacherProfileDTO);
        } catch (ValidationException e) {
            throw new BuisnessRuleViolationException("Cannot create teacher profile!", e);
        }
        return new TeacherProfile(StringId.from(profileDTO.id), BirthDate.from(profileDTO.birthDate),
                TaxNumber.from(profileDTO.taxNumber), Acronym.from(((TeacherProfileDTO) profileDTO).acronym),
                Calendar.builder().mapOfMeetings(new HashMap<>()).build());
    }

    @SuppressWarnings("all")
    public Profile createManagerProfile(ProfileDTO profileDTO) throws BuisnessRuleViolationException {
        try {
            Validations.isFalse(profileDTO instanceof TeacherProfileDTO || profileDTO instanceof StudentProfileDTO);
        } catch (ValidationException e) {
            throw new BuisnessRuleViolationException("Cannot create manager profile!", e);
        }
        return new ManagerProfile(StringId.from(profileDTO.id), BirthDate.from(profileDTO.birthDate),
                TaxNumber.from(profileDTO.taxNumber),
                Calendar.builder().mapOfMeetings(new HashMap<>()).build());
    }

}
