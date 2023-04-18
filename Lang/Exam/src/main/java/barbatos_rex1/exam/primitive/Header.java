package barbatos_rex1.exam.primitive;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@AllArgsConstructor
@ToString
@Getter
@EqualsAndHashCode
public class Header {
    public enum HeaderType {
        NONE,
        ON_SUBMISSION,
        AFTER_CLOSING
    }

    private String description;
    private HeaderType grading;
    private HeaderType feedback;
}
