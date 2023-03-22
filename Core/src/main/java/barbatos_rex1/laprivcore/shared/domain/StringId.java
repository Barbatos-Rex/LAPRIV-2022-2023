package barbatos_rex1.laprivcore.shared.domain;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
public class StringId implements EntityId {

    @Column(length = 54)
    private String id;


    private StringId(String id) {
        this.id = id;
    }

    private static String generateNewId() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 4; i++) {
            sb.append(generatePart()).append("-");
        }
        return sb.append(generatePart()).toString();
    }

    private static String generatePart() {
        String chars = "0123456789abcdef";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            sb.append(chars.charAt(((int) (Math.random() * chars.length()))));
        }
        return sb.toString();
    }

    private static boolean isValidId(String id) {
        return id.matches("^([\\da-f]{10}-){4}[\\da-f]{10}$");
    }

    public static StringId newId() {
        return new StringId(generateNewId());
    }

    public static StringId from(String id) {
        if (!isValidId(id)) {
        }
        return new StringId(id);
    }


}
