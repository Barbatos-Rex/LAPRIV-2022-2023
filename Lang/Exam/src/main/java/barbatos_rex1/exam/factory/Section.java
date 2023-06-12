package barbatos_rex1.exam.factory;

import barbatos_rex1.exam.exception.RuleViolationException;
import barbatos_rex1.exam.primitive.Question;
import lombok.*;

import java.io.Serializable;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@AllArgsConstructor
@ToString
@Getter
@EqualsAndHashCode
public class Section implements Serializable {
    private String description;
    private List<Question> questions;
    private int dificulty;

    @SneakyThrows
    public void validate() {
        final Set<String> ids = new HashSet<>();
        questions.forEach(Question::validate);
        questions.forEach(q -> {
            if (ids.contains(q.getIdCode())) {
                throw new RuntimeException("Validation Failed! Repeated Questions ids!");
            }
            ids.add(q.getIdCode());
        });
        int realDifficulty = questions.stream().mapToInt(Question::getDifficulty).sum();
        if (realDifficulty != dificulty) {
            throw new RuleViolationException(String.format("Difficulty Missmatch! There should be %d but in reality was %d", dificulty, realDifficulty));
        }
    }
}
