package barbatos_rex1.exam.primitive.questions;

import barbatos_rex1.exam.exception.RuleViolationException;
import barbatos_rex1.exam.primitive.Question;
import barbatos_rex1.exam.primitive.QuestionType;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.SneakyThrows;
import lombok.ToString;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@ToString
@Getter
@EqualsAndHashCode
public class MissingWords extends Question implements Serializable {
    private Map<Integer,String> keys;
    private String text;

    public MissingWords(String id,Map<Integer, String> keys, String text) {
        super(id,QuestionType.MISSING_WORDS);
        this.keys = keys;
        this.text = text;
    }
    @SneakyThrows
    @Override
    public void validate() {
       List<Integer> l =  extractOptions(text);
       var left = l.stream().filter(k-> !keys.containsKey(k)).toList();
       if (left.size()!=0){
           throw new RuleViolationException(String.format("There are missing words without propper keys! (%s)", left));
       }
    }

    private List<Integer> extractOptions(String text) {
        Pattern pattern = Pattern.compile("@\\d+@");
        Matcher matcher = pattern.matcher(text);
        List<String> matches = new ArrayList<>();
        while(matcher.find()){
            matches.add(matcher.group());
        }
        return matches.stream().map(str -> Integer.parseInt(str.replace("@",""))).toList();
    }
}
