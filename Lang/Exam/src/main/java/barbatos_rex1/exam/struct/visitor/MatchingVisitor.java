package barbatos_rex1.exam.struct.visitor;

import barbatos_rex1.exam.antlr4.lang.ExamGrammarBaseVisitor;
import barbatos_rex1.exam.antlr4.lang.ExamGrammarParser;
import barbatos_rex1.exam.primitive.questions.Matching;

import java.util.List;

public class MatchingVisitor extends ExamGrammarBaseVisitor<List<Matching.MatchingUnit>> {

    @Override
    public List<Matching.MatchingUnit> visitMatching_awnsers(ExamGrammarParser.Matching_awnsersContext ctx) {
        List<Matching.MatchingUnit> result = visit(ctx.matching_awnsers());
        result.addAll(visit(ctx.matching_token()));
        return result;
    }

    @Override
    public List<Matching.MatchingUnit> visitMatching_token(ExamGrammarParser.Matching_tokenContext ctx) {
        try {
            int iid = Integer.parseInt(ctx.INT().getText());
            return List.of(new Matching.MatchingUnit(iid,ctx.STRING().getText().replace("\"","")));
        } catch (NumberFormatException e) {
            //TODO EXCEPTIONS
            throw new RuntimeException(e);
        }
    }

    @Override
    public List<Matching.MatchingUnit> visitMatching_questions(ExamGrammarParser.Matching_questionsContext ctx) {
        List<Matching.MatchingUnit> result = visit(ctx.matching_questions());
        result.addAll(visit(ctx.matching_token()));
        return result;
    }
}
