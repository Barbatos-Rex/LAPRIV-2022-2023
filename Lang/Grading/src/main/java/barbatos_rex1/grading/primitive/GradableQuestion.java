package barbatos_rex1.grading.primitive;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public abstract class GradableQuestion {
    @EqualsAndHashCode.Include
    private String idCode;

    private String prompt;

    private int question;
    @Setter
    private long awardedPoints;

    private long maxPoints;

}
