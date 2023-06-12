package barbatos_rex1.grading.primitive.questions;

import barbatos_rex1.exam.primitive.questions.MultipleChoice;
import barbatos_rex1.grading.primitive.GradableQuestion;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@Getter
public class GradableMultipleChoiceQuestion extends GradableQuestion {

    @AllArgsConstructor
    @ToString
    @Getter
    @EqualsAndHashCode
    public final static class MultipleUnit{
        private String prompt;
        private boolean valid;
    }

    private List<MultipleUnit> options;
    private MultipleUnit choice;

    public GradableMultipleChoiceQuestion(String idCode, String prompt, int question, long awardedPoints, long maxPoints, List<MultipleUnit> options, MultipleUnit choice) {
        super(idCode, prompt, question, awardedPoints, maxPoints);
        this.options = options;
        this.choice = choice;
    }


}
