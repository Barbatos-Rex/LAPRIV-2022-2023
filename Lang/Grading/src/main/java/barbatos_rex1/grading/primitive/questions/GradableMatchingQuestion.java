package barbatos_rex1.grading.primitive.questions;

import barbatos_rex1.grading.primitive.GradableQuestion;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;

import java.util.Map;
import java.util.Set;

@Getter
public class GradableMatchingQuestion extends GradableQuestion {

    @AllArgsConstructor
    @Getter
    @EqualsAndHashCode(onlyExplicitlyIncluded = true)
    public static class MatchingUnit {
        @EqualsAndHashCode.Include
        private int iid;
        private String code;
    }


    private Set<MatchingUnit> questions;
    private Set<MatchingUnit> awnsers;

    private Map<MatchingUnit,MatchingUnit> connections;


    public GradableMatchingQuestion(String idCode, String prompt, int question, long awardedPoints, long maxPoints, Set<MatchingUnit> questions, Set<MatchingUnit> awnsers, Map<MatchingUnit, MatchingUnit> connections) {
        super(idCode, prompt, question, awardedPoints, maxPoints);
        this.questions = questions;
        this.awnsers = awnsers;
        this.connections = connections;
    }
}
