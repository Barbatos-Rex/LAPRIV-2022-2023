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
public class MultipleChoice extends Question {

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
