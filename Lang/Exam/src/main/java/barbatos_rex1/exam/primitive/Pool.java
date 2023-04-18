package barbatos_rex1.exam.primitive;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.paukov.combinatorics3.Generator;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@AllArgsConstructor
@ToString
@Getter
@EqualsAndHashCode
public class Pool {
    private String name;
    private List<Question> questions;

    public List<Question> genQuestionsUsing(int difficulty, int limitQuestions) {
        Random random=new Random();
        if (random.nextBoolean()) {
            //Big to Small
            List<Question> max = new ArrayList<>();
            for (int i = limitQuestions; i >= 0; i--) {
                var combinations = Generator.combination(questions).simple(i).stream().filter(l -> l.stream().mapToInt(Question::getDifficulty).sum() <= difficulty).toList();
                for (List<Question> l : combinations) {
                    int dif = l.stream().mapToInt(Question::getDifficulty).sum();
                    if (dif == difficulty) {
                        return l;
                    }
                    if (dif > difficulty) {
                        continue;
                    }
                    if (max.stream().mapToInt(Question::getDifficulty).sum() < dif) {
                        max = l;
                    }
                }
            }
            return max;
        } else {
            //Small to Big
            List<Question> max = new ArrayList<>();
            for (int i = 0; i <= limitQuestions; i++) {
                var combinations = Generator.combination(questions).simple(i).stream().filter(l -> l.stream().mapToInt(Question::getDifficulty).sum() <= difficulty).toList();
                for (List<Question> l : combinations) {
                    int dif = l.stream().mapToInt(Question::getDifficulty).sum();
                    if (dif == difficulty) {
                        return l;
                    }
                    if (dif > difficulty) {
                        continue;
                    }
                    if (max.stream().mapToInt(Question::getDifficulty).sum() < dif) {
                        max = l;
                    }
                }
            }
            return max;
        }
    }


}
