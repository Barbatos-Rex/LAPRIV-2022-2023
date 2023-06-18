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
        System.out.println();
        System.out.println();
        System.out.println("Question: "+question.getIdCode());
        System.out.println("Prompt: "+question.getPrompt());

        System.out.println();
        System.out.println("Options: ");
        question.getOptions().forEach(o ->{
            System.out.print(o.getPrompt()+"  ");
            if(o.getPrompt().equals(question.getChoice().getPrompt())){
                if(question.getChoice().isValid()){
                    System.out.println("✔️");
                }else{
                    System.out.println("❌");
                }
            }else{
                System.out.println();
            }
        });
        System.out.println();
        if(question.getChoice().isValid()){
            System.out.printf("Awared maximum points: %d%n",allCorrect);
            return allCorrect;
        }else{
            System.out.printf("Awared minimum points: %d%n",defaultAward);
            return defaultAward;
        }
    }

    @Override
    public long maxGrade() {
        return allCorrect;
    }
}
