package barbatos_rex1.laprivcore.shared.domain;

import barbatos_rex1.laprivcore.shared.utils.Validations;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Random;

@Embeddable
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@Getter
public class StringId implements EntityId {

    @Column(length = 54)
    private String id;

    private static final Random RANDOM = new Random();


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
            sb.append(chars.charAt(RANDOM.nextInt(0, chars.length())));
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
        /*
        If id is null all cases will demand a newId.
        If for some reason a case where the id is null, and it is requiered that it is not null,
        The domain rules are assured by the controllers
        */
        if (id == null) {
            return newId();
        }
        Validations.isTrue(isValidId(id));
        return new StringId(id);
    }


}
