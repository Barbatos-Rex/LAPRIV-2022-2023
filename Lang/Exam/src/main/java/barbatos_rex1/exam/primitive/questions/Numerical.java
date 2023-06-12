package barbatos_rex1.exam.primitive.questions;

import barbatos_rex1.exam.primitive.Question;
import barbatos_rex1.exam.primitive.QuestionType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.io.Serializable;

@ToString
@Getter
@EqualsAndHashCode
public class Numerical extends Question implements Serializable {
    private double awnser;

    public Numerical(String id,double awnser) {
        super( id,QuestionType.NUMERICAL);
        this.awnser = awnser;
    }

    @Override
    public void validate() {
        //No validation needed. Done at parser level
    }
}
