package barbatos_rex1.exam.primitive.questions;

import barbatos_rex1.exam.primitive.Question;
import barbatos_rex1.exam.primitive.QuestionType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Map;

@ToString
@Getter
@EqualsAndHashCode
public class MissingWords extends Question {
    private Map<Integer,String> keys;
    private String text;

    public MissingWords(Map<Integer, String> keys, String text) {
        super(QuestionType.MISSING_WORDS);
        this.keys = keys;
        this.text = text;
    }
}
