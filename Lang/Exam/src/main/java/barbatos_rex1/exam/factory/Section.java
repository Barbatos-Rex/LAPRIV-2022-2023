package barbatos_rex1.exam.factory;

import barbatos_rex1.exam.primitive.Question;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;

import java.util.List;

@AllArgsConstructor
@ToString
@Getter
@EqualsAndHashCode
public class Section {
    private String description;
    private List<Question> questions;
    private int dificulty;
}
