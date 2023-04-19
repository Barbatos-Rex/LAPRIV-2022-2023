package barbatos_rex1.exam.primitive.questions;

import barbatos_rex1.exam.exception.RuleViolationException;
import barbatos_rex1.exam.primitive.Question;
import barbatos_rex1.exam.primitive.QuestionType;
import lombok.*;

import java.util.List;

@ToString
@Getter
@EqualsAndHashCode
public class MultipleChoice extends Question {

    @SneakyThrows
    @Override
    public void validate() {
        List<MultipleUnit> l = options.stream().filter(MultipleUnit::isValid).toList();
        if (l.size()!=1){
            throw new RuleViolationException("There must be 1 and only 1 correct option!");
        }
    }

    @AllArgsConstructor
    @ToString
    @Getter
    @EqualsAndHashCode
    public final static class MultipleUnit{
        private String prompt;
        private boolean valid;
    }

    private List<MultipleUnit> options;

    public MultipleChoice(List<MultipleUnit> options) {
        super(QuestionType.MULTIPLE_CHOICE);
        this.options = options;
    }
}
