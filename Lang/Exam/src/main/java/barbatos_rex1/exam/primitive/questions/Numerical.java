package barbatos_rex1.exam.primitive.questions;

import barbatos_rex1.exam.primitive.Question;
import barbatos_rex1.exam.primitive.QuestionType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

@ToString
@Getter
@EqualsAndHashCode
public class Numerical extends Question {
    private double awnser;

    public Numerical(double awnser) {
        super(QuestionType.NUMERICAL);
        this.awnser = awnser;
    }
}
