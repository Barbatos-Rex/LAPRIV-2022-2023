package barbatos_rex1.exam.primitive;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Optional;

@AllArgsConstructor
@ToString
@Getter
@EqualsAndHashCode
public class Header implements Serializable {
    public enum HeaderType {
        NONE,
        ON_SUBMISSION,
        AFTER_CLOSING;


        public static Optional<HeaderType> fromString(String type){
            return switch (type.toLowerCase()) {
                case "none" -> Optional.of(NONE);
                case "on submission" -> Optional.of(ON_SUBMISSION);
                case "after closing" -> Optional.of(AFTER_CLOSING);
                default -> Optional.empty();
            };
        }


    }

    private String description;
    private HeaderType grading;
    private HeaderType feedback;
}
