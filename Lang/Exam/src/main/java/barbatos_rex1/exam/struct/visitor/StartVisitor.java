package barbatos_rex1.exam.struct.visitor;

import barbatos_rex1.exam.antlr4.lang.ExamGrammarBaseVisitor;
import barbatos_rex1.exam.antlr4.lang.ExamGrammarParser;
import barbatos_rex1.exam.primitive.ExamPrototype;
import barbatos_rex1.exam.primitive.Pool;
import lombok.NoArgsConstructor;

import java.util.Random;


@NoArgsConstructor
public class StartVisitor extends ExamGrammarBaseVisitor<ExamPrototype> {

    private QuestionParser questionParser = new QuestionParser();
    private PoolVisitor poolVisitor = new PoolVisitor();

    private ExamVisitor examVisitor = new ExamVisitor(poolVisitor);


    @Override
    public ExamPrototype visitStart(ExamGrammarParser.StartContext ctx) {
        poolVisitor.visit(ctx.pools());
        examVisitor.visit(ctx.exam());
        return examVisitor.exam();
    }
}
