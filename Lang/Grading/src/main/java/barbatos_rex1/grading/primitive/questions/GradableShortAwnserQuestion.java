package barbatos_rex1.grading.primitive.questions;

import barbatos_rex1.grading.primitive.GradableQuestion;
import lombok.Getter;

@Getter
public class GradableShortAwnserQuestion extends GradableQuestion {


    private String awnser;
    private String regex;

    private String fixedAwnser;

    public GradableShortAwnserQuestion(String idCode, String prompt, int question, long awardedPoints, long maxPoints, String awnser, String regex, String fixedAwnser) {
        super(idCode, prompt, question, awardedPoints, maxPoints);
        this.awnser = awnser;
        this.regex = regex;
        this.fixedAwnser = fixedAwnser;
    }
}
