package barbatos_rex1.grading.primitive.rules;

import barbatos_rex1.grading.primitive.GradingRules;
import barbatos_rex1.grading.primitive.questions.GradableMatchingQuestion;
import barbatos_rex1.grading.primitive.questions.GradableMissingWordsQuestion;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;
import java.util.Map;

@AllArgsConstructor
@Getter
public class GradingMissingRules implements GradingRules<GradableMissingWordsQuestion> {

    private String id;
    private List<ParcialAward> partial;

    private int max;
    private int min;




    @Override
    public String id() {
        return id;
    }

    @Override
    public long grade(GradableMissingWordsQuestion question) {
        var connections =question.getSolution();
        int correct = 0;
        for(Map.Entry<Integer,Integer> entry : connections.entrySet()){
            if(entry.getKey().intValue()==entry.getValue().intValue()){
                correct++;
            }
        }
        if(correct==0){
            return min;
        }
        if(correct==connections.entrySet().size()){
            return max;
        }
        final int CORRECT = correct;
        ParcialAward max=null;
        for(ParcialAward p : partial.stream().filter(p -> p.getThreshold() <= CORRECT).toList()){
            if(max==null){
                max=p;
                continue;
            }
            if (p.getThreshold()> max.getThreshold()){
                max=p;
            }
        }
        if(max==null){
            return min;
        }
        return max.getPoints();
    }
}
