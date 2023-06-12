package barbatos_rex1.grading.primitive.rules;

import barbatos_rex1.grading.primitive.GradingRules;
import barbatos_rex1.grading.primitive.questions.GradableMatchingQuestion;
import barbatos_rex1.grading.primitive.questions.GradableMultipleChoiceQuestion;
import lombok.AllArgsConstructor;

import java.util.Map;
import java.util.Set;

@AllArgsConstructor
public class GradingMultipleRules implements GradingRules<GradableMultipleChoiceQuestion> {
    private String id;
    private int allCorrect;
    private Set<ParcialAward> parcialAwards;
    private int defaultAward;
    @Override
    public String id() {
        return id;
    }

    @Override
    public long grade(GradableMultipleChoiceQuestion question) {
        return question.getChoice().isValid() ? allCorrect : defaultAward;
    }
}
