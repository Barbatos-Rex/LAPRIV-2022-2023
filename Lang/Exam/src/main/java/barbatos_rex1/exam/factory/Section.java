package barbatos_rex1.exam.factory;

import barbatos_rex1.exam.exception.RuleViolationException;
import barbatos_rex1.exam.primitive.Question;
import lombok.*;

import java.util.List;

@AllArgsConstructor
@ToString
@Getter
@EqualsAndHashCode
public class Section {
    private String description;
    private List<Question> questions;
    private int dificulty;

    @SneakyThrows
    public void validate() {
        questions.forEach(Question::validate);
        int realDifficulty =questions.stream().mapToInt(Question::getDifficulty).sum();
        if(realDifficulty != dificulty){
            throw new RuleViolationException(String.format("Difficulty Missmatch! There should be %d but in reality was %d",dificulty,realDifficulty ));
        }
    }
}
