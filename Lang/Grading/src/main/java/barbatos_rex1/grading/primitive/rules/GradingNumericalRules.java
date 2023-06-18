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
        System.out.println();
        System.out.println();
        System.out.println("Question: " + question.getIdCode());
        System.out.println("Prompt: " + question.getPrompt());

        System.out.println();
        System.out.print("Answer: ");
        if (lv != null) {
            if (question.getAwnser() >= lv && question.getAwnser() <= hv) {
                System.out.print(question.getAwnser());
                System.out.println("✔️");
                System.out.printf("Awared maximum points: %d%n", allPoints);
                return allPoints;
            }
            if (acceptedValues.contains(question.getAwnser())) {
                System.out.print(question.getAwnser());
                System.out.println("❓");
                System.out.printf("Awared partial points: %d%n", (allPoints + minPoints) / 2);
                return (allPoints + minPoints) / 2;
            }
            return minPoints;
        }


        if (acceptedValues.contains(question.getAwnser())) {
            System.out.print(question.getAwnser());
            System.out.println("✔️");
            System.out.printf("Awared maximum points: %d%n", allPoints);
            return allPoints;
        }
        System.out.print(question.getAwnser());
        System.out.println("❌");
        System.out.printf("Awared minimum points: %d%n", minPoints);
        return minPoints;
    }

    @Override
    public long maxGrade() {
        return allPoints;
    }
}
