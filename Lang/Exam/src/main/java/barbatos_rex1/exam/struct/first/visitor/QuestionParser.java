package barbatos_rex1.exam.struct.first.visitor;

import barbatos_rex1.exam.antlr4.lang.first.ExamGrammarBaseVisitor;
import barbatos_rex1.exam.antlr4.lang.first.ExamGrammarParser;
import barbatos_rex1.exam.primitive.Question;
import barbatos_rex1.exam.primitive.questions.*;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@NoArgsConstructor
@Getter
public class QuestionParser extends ExamGrammarBaseVisitor<Question> {
    private List<Question> questions = new ArrayList<>();

    @Override
    public Question visitQuestion_body(ExamGrammarParser.Question_bodyContext ctx) {
        int dif = Integer.parseInt(ctx.INT().getText());
        parse(ctx.body(), ctx.prompt_string.getText().replace("\"",""), dif);
        return null;
    }

    public void parse(ExamGrammarParser.BodyContext body, String prompt, int difficulty) {
        Question q = visit(body);
        q.setDifficulty(difficulty);
        q.setPrompt(prompt);
        questions.add(q);
    }

    @Override
    public Question visitTrue_false(ExamGrammarParser.True_falseContext ctx) {
        boolean b = false;
        try {
            b = Boolean.parseBoolean(ctx.true_false_option().getText());
        } catch (Exception e) {
            //TODO Costume Exceptions
            throw new RuntimeException(e);
        }
        return new TrueFalse(b);
    }

    @Override
    public Question visitMissing_words(ExamGrammarParser.Missing_wordsContext ctx) {
        Map<Integer, String> keys = new KeyVisitor().visitKey_map(ctx.key_map());
        String text = ctx.text_string.getText().replace("\"","");
        return new MissingWords(keys, text);
    }

    @Override
    public Question visitNumerical(ExamGrammarParser.NumericalContext ctx) {

        double d = 0;
        try {
            d = Double.parseDouble(ctx.REAL().getText());
        } catch (NumberFormatException | NullPointerException e) {
            //TODO Exception
            try {
                d= Double.parseDouble(ctx.INT().getText());
            } catch (NumberFormatException ex) {
                throw new RuntimeException(ex);
            }
        }
        return new Numerical(d);
    }

    @Override
    public Question visitShort_awnser(ExamGrammarParser.Short_awnserContext ctx) {
        return new ShortAwnser(ctx.STRING().getText().replace("\"",""));
    }

    @Override
    public Question visitMultiple_choice(ExamGrammarParser.Multiple_choiceContext ctx) {
        return new MultipleChoice(new MultipleUnitVisitor().visit(ctx.multiple_choice_options()));
    }

    @Override
    public Question visitMatching(ExamGrammarParser.MatchingContext ctx) {
        List<Matching.MatchingUnit> questions = new MatchingVisitor().visit(ctx.matching_questions());
        List<Matching.MatchingUnit> awnsers = new MatchingVisitor().visit(ctx.matching_awnsers());
        return new Matching(questions, awnsers);
    }

    @Override
    public Question visitMatching_awnsers(ExamGrammarParser.Matching_awnsersContext ctx) {
        return super.visitMatching_awnsers(ctx);
    }

    @Override
    public Question visitMatching_token(ExamGrammarParser.Matching_tokenContext ctx) {
        return super.visitMatching_token(ctx);
    }

    @Override
    public Question visitMatching_questions(ExamGrammarParser.Matching_questionsContext ctx) {
        return super.visitMatching_questions(ctx);
    }
}
