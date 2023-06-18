package barbatos_rex1.grading.primitive.rules;

import barbatos_rex1.grading.primitive.GradingRules;
import barbatos_rex1.grading.primitive.questions.GradableMatchingQuestion;
import lombok.AllArgsConstructor;

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
        System.out.println();
        System.out.println();
        System.out.println("Question: "+question.getIdCode());
        System.out.println("Prompt: "+question.getPrompt());

        System.out.println();
        System.out.println("Questions: ");
        question.getQuestions().forEach(mu -> System.out.printf("%d: %s%n", mu.getIid(), mu.getCode()));
        System.out.println();
        System.out.println("Answers: ");
        question.getAwnsers().forEach(mu -> System.out.printf("%d: %s%n", mu.getIid(), mu.getCode()));
        System.out.println();
        System.out.println("Connections made by studen: ");
        question.getConnections().entrySet().stream().forEach(e -> {
            String response = "";
            if (e.getKey().getIid() == e.getValue().getIid()) {
                response = "✔️";
            } else {
                response = "❌";
            }
            System.out.printf("%s <-> %s   %s%n", e.getKey().getCode(), e.getValue().getCode(), response);
        });
        System.out.println();


        var connections = question.getConnections();
        int correct = 0;
        for (Map.Entry<GradableMatchingQuestion.MatchingUnit, GradableMatchingQuestion.MatchingUnit> entry : connections.entrySet()) {
            if (entry.getKey().getIid() == entry.getValue().getIid()) {
                correct++;
            }
        }
        if (correct == 0) {
            System.out.printf("Awared minimum points: %d%n",defaultAward);
            return defaultAward;
        }
        if (correct == connections.entrySet().size()) {
            System.out.printf("Awared maximum points: %d%n",allCorrect);
            return allCorrect;
        }
        final int CORRECT = correct;
        ParcialAward max = null;
        for (ParcialAward p : parcialAwards.stream().filter(p -> p.getThreshold() <= CORRECT).toList()) {
            if (max == null) {
                max = p;
                continue;
            }
            if (p.getThreshold() > max.getThreshold()) {
                max = p;
            }
        }
        if (max == null) {
            System.out.printf("Awared minimum points: %d%n",defaultAward);
            return defaultAward;
        }
        System.out.printf("For partial correctess (at least %d correct), awared partical points: %d%n",max.getThreshold(),max.getPoints());
        return max.getPoints();
    }

    @Override
    public long maxGrade() {
        return allCorrect;
    }
}
