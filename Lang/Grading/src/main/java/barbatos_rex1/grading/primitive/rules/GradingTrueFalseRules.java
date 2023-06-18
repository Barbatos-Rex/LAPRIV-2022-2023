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
        System.out.println();
        System.out.println();
        System.out.println("Question: "+question.getIdCode());
        System.out.println("Prompt: "+question.getPrompt());

        System.out.println();
        System.out.println();
        System.out.println("Answer: ");
        if (question.isAwnser()==question.isSolution()){
            System.out.print(question.isAwnser()+"  ");
            System.out.println("✔️");
            System.out.printf("Awared maximum points: %d%n",max);
            return max;
        }else{
            System.out.print(question.isAwnser()+"  ");
            System.out.println("❌");
            System.out.printf("Awared minimum points: %d%n",min);
            return min;
        }
    }

    @Override
    public long maxGrade() {
        return max;
    }
}
