package barbatos_rex1.exam.struct.visitor;

import barbatos_rex1.exam.antlr4.lang.ExamGrammarBaseVisitor;
import barbatos_rex1.exam.antlr4.lang.ExamGrammarParser;

import java.util.Map;

public class KeyVisitor extends ExamGrammarBaseVisitor<Map<Integer, String>> {


    @Override
    public Map<Integer, String> visitKey_map(ExamGrammarParser.Key_mapContext ctx) {
        Map<Integer, String> map = visitKey_map(ctx.key_map());
        int i = 0;
        try {
            i = Integer.parseInt(ctx.INT().getText());
        } catch (NumberFormatException e) {
            //TODO Exception
            throw new RuntimeException(e);
        }
        String text = ctx.STRING().getText().replace("\"","");
        map.put(i, text);
        return map;
    }
}
