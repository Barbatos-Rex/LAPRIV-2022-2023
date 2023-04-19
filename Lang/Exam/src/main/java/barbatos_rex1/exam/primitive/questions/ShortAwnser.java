package barbatos_rex1.exam.primitive.questions;

import barbatos_rex1.exam.primitive.Question;
import barbatos_rex1.exam.primitive.QuestionType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@EqualsAndHashCode
public class ShortAwnser extends Question {
    private String awnser;

    public ShortAwnser(String awnser) {
        super(QuestionType.SHORT_AWNSER);
        this.awnser = awnser;
    }

    @Override
    public void validate() {
        //No need. Done at parser level
    }
}
