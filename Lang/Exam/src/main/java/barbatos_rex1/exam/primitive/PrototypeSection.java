package barbatos_rex1.exam.primitive;

import barbatos_rex1.exam.factory.Section;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.Collections;
import java.util.List;

@AllArgsConstructor
@ToString
@Getter
@EqualsAndHashCode
public class PrototypeSection {
    private String id;
    private String description;
    private int difficulty;
    private int limitQuestions;
    private Pool pool;

    public Section generateSection() {
        List<Question> questions = pool.genQuestionsUsing(difficulty,limitQuestions);
        Collections.shuffle(questions);
        return new Section(description,questions,questions.stream().mapToInt(Question::getDifficulty).sum());
    }
}
