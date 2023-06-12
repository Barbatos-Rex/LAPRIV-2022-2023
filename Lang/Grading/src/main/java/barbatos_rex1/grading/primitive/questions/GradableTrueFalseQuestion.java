package barbatos_rex1.grading.primitive.questions;

import barbatos_rex1.grading.primitive.GradableQuestion;
import lombok.Getter;

@Getter
public class GradableTrueFalseQuestion extends GradableQuestion {

    private boolean awnser;
    private boolean solution;

    public GradableTrueFalseQuestion(String idCode, String prompt, int question, long awardedPoints, long maxPoints, boolean awnser, boolean solution) {
        super(idCode, prompt, question, awardedPoints, maxPoints);
        this.awnser = awnser;
        this.solution = solution;
    }
}
