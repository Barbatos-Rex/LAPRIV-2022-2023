package barbatos_rex1.laprivcore.user.domain;


import barbatos_rex1.laprivcore.shared.domain.exception.BuisnessRuleViolationException;
import barbatos_rex1.laprivcore.shared.utils.Encryption;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
public class Password {

    private String salt;
    private String encryptedPassword;

    private Password(String salt, String insecurePassword) {
        this.salt = salt;
        StringBuilder sb = new StringBuilder();
        sb.append(salt).append(insecurePassword).append(salt);
        this.encryptedPassword = Encryption.encode(sb.toString());
    }

    private Password(String salt, String encryptedPassword, String controll) {
        this.salt = salt;
        this.encryptedPassword = encryptedPassword;
    }

    public static Password from(String salt, String encryptedPassword) throws BuisnessRuleViolationException {
        return new Password(salt, encryptedPassword, "");
    }

    public static Password secure(String salt, String insecurePassword) throws BuisnessRuleViolationException {
        return new Password(salt, insecurePassword);
    }


}
