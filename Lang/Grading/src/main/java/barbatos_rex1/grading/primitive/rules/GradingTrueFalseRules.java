package barbatos_rex1.grading.primitive.rules;

import barbatos_rex1.grading.primitive.GradingRules;
import barbatos_rex1.grading.primitive.questions.GradableTrueFalseQuestion;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class GradingTrueFalseRules implements GradingRules<GradableTrueFalseQuestion> {
    private String id;
    private int max;

    private int min;



    @Override
    public String id() {
        return id;
    }

    @Override
    public long grade(GradableTrueFalseQuestion question) {
        return question.isAwnser()==question.isSolution() ? max : min;
    }
}
