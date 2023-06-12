package barbatos_rex1.exam.primitive.questions;

import barbatos_rex1.exam.exception.RuleViolationException;
import barbatos_rex1.exam.primitive.Question;
import barbatos_rex1.exam.primitive.QuestionType;
import lombok.*;

import java.io.Serializable;
import java.util.List;

@ToString
@Getter
@EqualsAndHashCode
public class MultipleChoice extends Question implements Serializable {

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
    public final static class MultipleUnit implements Serializable{
        private String prompt;
        private boolean valid;
    }

    private List<MultipleUnit> options;

    public MultipleChoice(String id,List<MultipleUnit> options) {
        super(id,QuestionType.MULTIPLE_CHOICE);
        this.options = options;
    }
}
