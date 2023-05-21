package barbatos_rex1.exam.struct.first.visitor;

import barbatos_rex1.exam.antlr4.lang.first.ExamGrammarBaseVisitor;
import barbatos_rex1.exam.antlr4.lang.first.ExamGrammarParser;
import barbatos_rex1.exam.primitive.ExamPrototype;
import lombok.NoArgsConstructor;


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
