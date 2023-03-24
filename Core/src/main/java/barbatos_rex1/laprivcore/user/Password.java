package barbatos_rex1.laprivcore.user;


import barbatos_rex1.laprivcore.shared.utils.Encryption;
import jakarta.persistence.Embeddable;
import lombok.*;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@ToString
@Getter
public class Password {

    private String salt;
    private String encryptedPassword;

    public Password(String salt, String insecurePassword) {
        this.salt = salt;
        StringBuilder sb = new StringBuilder();
        sb.append(salt).append(insecurePassword).append(salt)
        this.encryptedPassword = Encryption.encode(sb.toString());
    }
}
