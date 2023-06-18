package barbatos_rex1.grading.primitive.rules;

import barbatos_rex1.grading.primitive.GradingRules;
import barbatos_rex1.grading.primitive.questions.GradableShortAwnserQuestion;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.List;

@AllArgsConstructor
@Getter
public class GradingShortRule implements GradingRules<GradableShortAwnserQuestion> {

    private String id;
    private List<String> acceptedAwnsers;
    private String overrideRegex;
    private int allCorrect;
    private int defaultValue;


    @Override
    public String id() {
        return id;
    }

    @Override
    public long grade(GradableShortAwnserQuestion question) {

        System.out.println();
        System.out.println();
        System.out.println("Question: "+question.getIdCode());
        System.out.println("Prompt: "+question.getPrompt());

        System.out.println();
        System.out.print("Answer: ");

        if (overrideRegex != null) {
            if (question.getAwnser().matches(overrideRegex)) {
                System.out.print(question.getAwnser());
                System.out.println("✔️");
                System.out.printf("Awared maximum points: %d%n", allCorrect);
                return allCorrect;
            }
            if (acceptedAwnsers.contains(question.getAwnser())) {
                System.out.print(question.getAwnser());
                System.out.println("❓");
                System.out.printf("Awared partial points: %d%n", (allCorrect + defaultValue) / 2);
                return (allCorrect + defaultValue) / 2;
            }
            return defaultValue;
        }

        if (acceptedAwnsers.contains(question.getAwnser())) {
            System.out.print(question.getAwnser());
            System.out.println("✔️");
            System.out.printf("Awared maximum points: %d%n", allCorrect);
            return allCorrect;
        }
        System.out.print(question.getAwnser());
        System.out.println("❌");
        System.out.printf("Awared minimum points: %d%n", defaultValue);
        return defaultValue;
    }

    @Override
    public long maxGrade() {
        return allCorrect;
    }


}
