package barbatos_rex1.exam.primitive.questions;

import barbatos_rex1.exam.exception.RuleViolationException;
import barbatos_rex1.exam.primitive.Question;
import barbatos_rex1.exam.primitive.QuestionType;
import lombok.*;

import java.util.HashSet;
import java.util.List;
import java.util.Set;


@ToString
@Getter
@EqualsAndHashCode
public class Matching extends Question {

    @Override
    public void validate() {
        ensureDistinctIids(questions, awnsers);
        ensureBijectivity(questions, awnsers);
    }

    @SneakyThrows
    private void ensureBijectivity(List<MatchingUnit> questions, List<MatchingUnit> awnsers) {
        Set<Integer> set = new HashSet<>(questions.stream().mapToInt(q -> q.iid).boxed().toList());
        var v = awnsers.stream().filter(a -> !set.contains(a.getIid())).toList();
        if (!v.isEmpty()) {
            throw new RuleViolationException(String.format("Iid missmatch for iids %s", v));
        }
    }

    @SneakyThrows
    private void ensureDistinctIids(List<MatchingUnit> questions, List<MatchingUnit> awnsers) {
        if (questions.size() != awnsers.size()) {
            throw new RuleViolationException("Number of questions is different than the number of awnsers!");
        }
        if (questions.stream().distinct().toList().size() != questions.size()) {
            throw new RuleViolationException("Matching question are invalid! There are repeated iids.");
        }
        if (awnsers.stream().distinct().toList().size() != awnsers.size()) {
            throw new RuleViolationException("Matching awnsers are invalid! There are repeated iids.");
        }
    }

    @AllArgsConstructor
    @ToString
    @Getter
    @EqualsAndHashCode
    public final static class MatchingUnit {
        private int iid;
        private String prompt;
    }

    private List<MatchingUnit> questions;
    private List<MatchingUnit> awnsers;

    public Matching(List<MatchingUnit> questions, List<MatchingUnit> awnsers) {
        super(QuestionType.MATCHING);
        this.questions = questions;
        this.awnsers = awnsers;
    }
}
