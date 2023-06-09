package barbatos_rex1.exam.factory;

import barbatos_rex1.exam.primitive.Header;
import lombok.AllArgsConstructor;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.ToString;
import org.json.JSONObject;

import java.io.Serializable;
import java.util.List;

@AllArgsConstructor
@ToString
@Getter
@EqualsAndHashCode
public class Exam implements Serializable {

    private String title;
    private Header header;

    private List<Section> sections;



    public String compile(){
        JSONObject obj = new JSONObject(this);
        return obj.toString(2);
    }


    public void validate() {
        sections.forEach(Section::validate);
    }
}
