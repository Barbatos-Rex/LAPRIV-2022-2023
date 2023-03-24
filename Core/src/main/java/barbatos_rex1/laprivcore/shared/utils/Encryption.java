package barbatos_rex1.laprivcore.shared.utils;

import lombok.SneakyThrows;
import lombok.experimental.UtilityClass;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;

@UtilityClass
public class Encryption {
    @SneakyThrows
    public String encode(String message) {
        MessageDigest digest = MessageDigest.getInstance("SHA-256");
        byte[] encodedhash = digest.digest(message.getBytes(StandardCharsets.UTF_8));
        return new String(encodedhash, StandardCharsets.UTF_8);
    }

}
