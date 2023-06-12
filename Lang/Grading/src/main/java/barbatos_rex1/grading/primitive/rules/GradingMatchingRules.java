package barbatos_rex1.grading.primitive.rules;

import barbatos_rex1.grading.primitive.GradingRules;
import barbatos_rex1.grading.primitive.questions.GradableMatchingQuestion;
import lombok.AllArgsConstructor;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
@AllArgsConstructor
public class GradingMatchingRules implements GradingRules<GradableMatchingQuestion> {

    private String id;
    private int allCorrect;
    private Set<ParcialAward> parcialAwards;

    private int defaultAward;


    @Override
    public String id() {
        return id;
    }

    @Override
    public long grade(GradableMatchingQuestion question) {
        var connections =question.getConnections();
        int correct = 0;
        for(Map.Entry<GradableMatchingQuestion.MatchingUnit,GradableMatchingQuestion.MatchingUnit> entry : connections.entrySet()){
            if(entry.getKey().getIid()==entry.getValue().getIid()){
                correct++;
            }
        }
        if(correct==0){
            return defaultAward;
        }
        if(correct==connections.entrySet().size()){
            return allCorrect;
        }
        final int CORRECT = correct;
        ParcialAward max=null;
        for(ParcialAward p : parcialAwards.stream().filter(p -> p.getThreshold() <= CORRECT).toList()){
            if(max==null){
                max=p;
                continue;
            }
            if (p.getThreshold()> max.getThreshold()){
                max=p;
            }
        }
        if(max==null){
            return defaultAward;
        }
        return max.getPoints();
    }
}
