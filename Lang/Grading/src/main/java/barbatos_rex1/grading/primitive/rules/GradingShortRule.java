package barbatos_rex1.grading.primitive.rules;

import barbatos_rex1.grading.primitive.GradingRules;
import barbatos_rex1.grading.primitive.questions.GradableShortAwnserQuestion;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class GradingShortRule implements GradingRules<GradableShortAwnserQuestion> {

    private String id;
    private List<String> acceptedAwnsers;
    private String overrideRegex;
    private int allCorrect;
    private int defaultValue;


    @Override
    public String id() {
        return id;
    }

    @Override
    public long grade(GradableShortAwnserQuestion question) {
        if (overrideRegex != null) {
            if (question.getAwnser().matches(overrideRegex)) {
                return allCorrect;
            }
            if (acceptedAwnsers.contains(question.getAwnser())) {
                return (allCorrect + defaultValue) / 2;
            }
            return defaultValue;
        }

        if (acceptedAwnsers.contains(question.getAwnser())) {
            return allCorrect;
        }

        return defaultValue;
    }


}
