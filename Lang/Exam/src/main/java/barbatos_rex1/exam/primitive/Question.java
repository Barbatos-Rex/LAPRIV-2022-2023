package barbatos_rex1.exam.primitive;

import lombok.*;

import java.util.Random;


@ToString
@Getter
@EqualsAndHashCode
public abstract class Question {
    private String idCode;
    private String prompt;
    private QuestionType code;
    private int difficulty;

    public Question(QuestionType code) {
        this.code = code;
    }

    public void stampId() {
        idCode = generateId();
    }

    private String generateId() {
        Random r = new Random();
        final String CHARS = "0123456789abcdef";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < 16; i++) {
            sb.append(CHARS.charAt(r.nextInt(0, CHARS.length() - 1)));
        }
        return sb.toString();
    }

    public void setDifficulty(int difficulty) {
        this.difficulty = difficulty;
    }

    public void setPrompt(String prompt) {
        this.prompt = prompt;
    }
}
