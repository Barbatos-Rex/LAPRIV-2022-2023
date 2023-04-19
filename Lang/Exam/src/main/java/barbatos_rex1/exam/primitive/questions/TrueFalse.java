package barbatos_rex1.exam.primitive.questions;

import barbatos_rex1.exam.primitive.Question;
import barbatos_rex1.exam.primitive.QuestionType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@EqualsAndHashCode
public class TrueFalse extends Question {
    private boolean awnser;

    public TrueFalse( boolean awnser) {
        super(QuestionType.TRUE_FALSE);
        this.awnser = awnser;
    }

    @Override
    public void validate() {
        //No need. Done at parser level
    }
}
