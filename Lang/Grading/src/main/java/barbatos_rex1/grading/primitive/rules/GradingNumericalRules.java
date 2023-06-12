package barbatos_rex1.grading.primitive.rules;

import barbatos_rex1.grading.primitive.GradingRules;
import barbatos_rex1.grading.primitive.questions.GradableNumericalQuestion;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class GradingNumericalRules implements GradingRules<GradableNumericalQuestion> {


    private String id;
    private List<Double> acceptedValues;
    private Double lv;
    private Double hv;
    private int allPoints;
    private int minPoints;





    @Override
    public String id() {
        return id;
    }

    @Override
    public long grade(GradableNumericalQuestion question) {
        if(lv!=null){
            if(question.getAwnser()>= lv && question.getAwnser()<= hv){
                return allPoints;
            }
            if(acceptedValues.contains(question.getAwnser())){
                return (allPoints+minPoints)/2;
            }
            return minPoints;
        }


        if(acceptedValues.contains(question.getAwnser())){
            return allPoints;
        }

        return minPoints;
    }
}
