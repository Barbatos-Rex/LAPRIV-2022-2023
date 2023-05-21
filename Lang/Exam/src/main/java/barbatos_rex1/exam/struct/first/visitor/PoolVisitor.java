package barbatos_rex1.exam.struct.first.visitor;

import barbatos_rex1.exam.antlr4.lang.first.ExamGrammarBaseVisitor;
import barbatos_rex1.exam.antlr4.lang.first.ExamGrammarParser;
import barbatos_rex1.exam.primitive.Pool;
import lombok.Getter;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Getter
public class PoolVisitor extends ExamGrammarBaseVisitor<Object> {

    private Map<String, Pool> pools = new HashMap<>();
    @Override
    public Object visitPool(ExamGrammarParser.PoolContext ctx) {
        String poolName = ctx.STRING().getText().replace("\"","");
        var qv = new QuestionParser();
        qv.visit(ctx.questions());
        var p = new Pool(poolName, qv.getQuestions());
        pools.put(poolName,p);
        return List.of(p);
    }
}
