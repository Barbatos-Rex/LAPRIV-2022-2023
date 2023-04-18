package barbatos_rex1.exam.factory;

import barbatos_rex1.exam.primitive.Header;
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
public class Exam {

    private String title;
    private Header header;

    private List<Section> sections;



    public String compile(){
        JSONObject obj = new JSONObject(this);
        return obj.toString(2);
    }


}
