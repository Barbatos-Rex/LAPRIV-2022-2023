package barbatos_rex1.exam.struct.first.visitor;

import barbatos_rex1.exam.antlr4.lang.first.ExamGrammarBaseVisitor;
import barbatos_rex1.exam.antlr4.lang.first.ExamGrammarParser;
import barbatos_rex1.exam.exception.CompilerException;
import lombok.SneakyThrows;

import java.util.Map;

public class KeyVisitor extends ExamGrammarBaseVisitor<Map<Integer, String>> {


    @SneakyThrows
    @Override
    public Map<Integer, String> visitKey_map(ExamGrammarParser.Key_mapContext ctx) {
        Map<Integer, String> map = visitKey_map(ctx.key_map());
        int i = 0;
        try {
            i = Integer.parseInt(ctx.INT().getText());
        } catch (NumberFormatException e) {
            throw new CompilerException("Not a valid key",0,0);
        }
        String text = ctx.STRING().getText().replace("\"","");
        map.put(i, text);
        return map;
    }
}
