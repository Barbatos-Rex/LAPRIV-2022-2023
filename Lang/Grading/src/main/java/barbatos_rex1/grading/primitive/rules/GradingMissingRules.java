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
        System.out.println();
        System.out.println();
        System.out.println("Question: "+question.getIdCode());
        System.out.println("Prompt: "+question.getPrompt());

        System.out.println();
        System.out.println("Text: "+question.getText());
        System.out.println();
        System.out.println("Keys: ");
        question.getKeys().entrySet().forEach(mu -> System.out.printf("%d: %s%n", mu.getKey(), mu.getValue()));
        System.out.println();
        System.out.println("Connections made by student: ");
        var connections =question.getSolution();
        int correct = 0;
        for(Map.Entry<Integer,Integer> entry : connections.entrySet()){
            System.out.printf("%d <-> %s  ",entry.getKey(),question.getKeys().get(entry.getValue()));
            if(entry.getKey().intValue()==entry.getValue().intValue()){
                System.out.println("✔️");
                correct++;
            }else{
                System.out.println("❌");
            }
        }


        System.out.println();


        if(correct==0){
            System.out.printf("Awared minimum points: %d%n",min);
            return min;
        }
        if(correct==connections.entrySet().size()){
            System.out.printf("Awared maximum points: %d%n",max);
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
            System.out.printf("Awared minimum points: %d%n",min);
            return min;
        }

        System.out.printf("For partial correctess (at least %d correct), awared partical points: %d%n",max.getThreshold(),max.getPoints());
        return max.getPoints();
    }

    @Override
    public long maxGrade() {
        return max;
    }
}
