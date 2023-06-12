package barbatos_rex1.exam.primitive;

import lombok.*;

import java.io.Serializable;
import java.util.Random;


@ToString
@Getter
@EqualsAndHashCode
public abstract class Question implements Serializable {
    private String idCode;
    private String prompt;
    private QuestionType code;
    private int difficulty;

    public Question(String idCode,QuestionType code) {
        this.idCode=idCode;
        this.code = code;
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }

    public abstract void validate();

    protected String formatedPromptToId(){
        return prompt.trim().toLowerCase().replaceAll("[aeiou :,.;\\r\\n\\t?!()]","");
    }


}
