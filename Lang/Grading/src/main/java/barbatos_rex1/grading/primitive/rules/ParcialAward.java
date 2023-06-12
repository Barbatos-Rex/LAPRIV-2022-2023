package barbatos_rex1.grading.primitive.rules;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@AllArgsConstructor
@Getter
@EqualsAndHashCode(onlyExplicitlyIncluded = true)
public class ParcialAward {
    @EqualsAndHashCode.Include
    private int threshold;
    private int points;
}
