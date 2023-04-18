package barbatos_rex1.exam.primitive.questions;

import barbatos_rex1.exam.primitive.Question;
import barbatos_rex1.exam.primitive.QuestionType;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;


@ToString
@Getter
@EqualsAndHashCode
public class Matching extends Question {

    @AllArgsConstructor
    @ToString
    @Getter
    @EqualsAndHashCode
    public final static class MatchingUnit{
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
