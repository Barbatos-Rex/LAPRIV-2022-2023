package barbatos_rex1.grading.primitive.questions;

import barbatos_rex1.grading.primitive.GradableQuestion;
import lombok.Getter;

import java.util.Map;

@Getter
public class GradableMissingWordsQuestion extends GradableQuestion {

    private Map<Integer,String> keys;

    private Map<Integer,Integer> solution;

    private String text;

    public GradableMissingWordsQuestion(String idCode, String prompt, int question, long awardedPoints, long maxPoints, Map<Integer, String> keys, Map<Integer, Integer> solution, String text) {
        super(idCode, prompt, question, awardedPoints, maxPoints);
        this.keys = keys;
        this.solution = solution;
        this.text = text;
    }
}
