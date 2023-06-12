package barbatos_rex1.grading.primitive.questions;

import barbatos_rex1.grading.primitive.GradableQuestion;
import lombok.Getter;

@Getter
public class GradableNumericalQuestion extends GradableQuestion {


    private double awnser;
    private double lowerBound;
    private double higherBound;

    private double fixedValue;

    public GradableNumericalQuestion(String idCode, String prompt, int question, long awardedPoints, long maxPoints, double awnser, double lowerBound, double higherBound, double fixedValue) {
        super(idCode, prompt, question, awardedPoints, maxPoints);
        this.awnser = awnser;
        this.lowerBound = lowerBound;
        this.higherBound = higherBound;
        this.fixedValue = fixedValue;
    }
}
