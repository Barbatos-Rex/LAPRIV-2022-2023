package barbatos_rex1.exam.primitive;

import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.json.JSONObject;

import java.util.List;

@AllArgsConstructor
@ToString
@Getter
@EqualsAndHashCode
public final class ExamPrototype {
    private String id;
    private String title;
    private Header header;

    private List<PrototypeSection> sections;
}
