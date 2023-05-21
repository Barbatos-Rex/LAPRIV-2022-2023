package barbatos_rex1.exam.struct.simple.visitor;

import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarBaseVisitor;
import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarParser;
import barbatos_rex1.exam.primitive.Pool;
import barbatos_rex1.exam.primitive.Question;
import barbatos_rex1.exam.primitive.questions.*;
import lombok.Getter;

import java.util.*;

public class QuestionVisitor extends SimpleExamGrammarBaseVisitor<String> {
    private List<Question> questions;
    @Getter
    private Pool pool;

    private Set<Matching.MatchingUnit> matchingQuestions = new HashSet<>();
    private Set<Matching.MatchingUnit> matchingAnswers = new HashSet<>();

    private Set<MultipleChoice.MultipleUnit> multipleQuestions = new HashSet<>();
    private boolean flag = false;

    private Map<Integer, String> keys = new HashMap<>();

    @Override
    public String visitPool(SimpleExamGrammarParser.PoolContext ctx) {
        questions = new ArrayList<>();
        String poolName = ctx.STRING().getText().replace("\"", "");
        visit(ctx.pool_body());
        pool = new Pool(poolName, questions);
        return "";
    }

    @Override
    public String visitMatching(SimpleExamGrammarParser.MatchingContext ctx) {
        flag = false;
        matchingQuestions = new HashSet<>();
        visit(ctx.ques);
        flag = true;
        matchingAnswers = new HashSet<>();
        visit(ctx.asnw);
        Matching m = new Matching(matchingQuestions.stream().toList(), matchingAnswers.stream().toList());
        m.setDifficulty(Integer.parseInt(ctx.INT().getText().replace("\"", "")));
        m.setPrompt(ctx.STRING().getText());
        questions.add(m);
        return "";
    }

    @Override
    public String visitMatching_map_atomic(SimpleExamGrammarParser.Matching_map_atomicContext ctx) {
        if (flag) {
            matchingAnswers.add(new Matching.MatchingUnit(Integer.parseInt(ctx.INT().getText()), ctx.STRING().getText().replace("\"", "")));
            return "";
        }
        matchingQuestions.add(new Matching.MatchingUnit(Integer.parseInt(ctx.INT().getText()), ctx.STRING().getText().replace("\"", "")));
        return "";
    }

    @Override
    public String visitMultiple(SimpleExamGrammarParser.MultipleContext ctx) {
        multipleQuestions=new HashSet<>();
        visit(ctx.multiple_map());
        MultipleChoice m = new MultipleChoice(multipleQuestions.stream().toList());
        m.setDifficulty(Integer.parseInt(ctx.INT().getText()));
        m.setPrompt(ctx.STRING().getText().replace("\"",""));
        questions.add(m);
        return "";
    }
    @Override
    public String visitMultiple_map_atomic(SimpleExamGrammarParser.Multiple_map_atomicContext ctx) {
        multipleQuestions.add(new MultipleChoice.MultipleUnit(ctx.STRING().getText().replace("\"",""),Boolean.parseBoolean(ctx.BOOLEAN().getText())));
        return "";
    }

    @Override
    public String visitShort(SimpleExamGrammarParser.ShortContext ctx) {
        ShortAwnser s = new ShortAwnser(ctx.answer.getText().replace("\"",""));
        s.setDifficulty(Integer.parseInt(ctx.INT().getText()));
        s.setPrompt(ctx.prompt.getText().replace("\"",""));
        questions.add(s);
        return "";
    }

    @Override
    public String visitMissing(SimpleExamGrammarParser.MissingContext ctx) {
        keys=new HashMap<>();
        visit(ctx.key_map());
        MissingWords mw = new MissingWords(keys,ctx.text.getText().replace("\"",""));
        mw.setDifficulty(Integer.parseInt(ctx.INT().getText()));
        mw.setPrompt(ctx.prompt.getText().replace("\"",""));
        questions.add(mw);
        return "";
    }

    @Override
    public String visitKey_map_atomic(SimpleExamGrammarParser.Key_map_atomicContext ctx) {
        keys.put(Integer.parseInt(ctx.INT().getText()),ctx.STRING().getText());
        return "";
    }

    @Override
    public String visitNum(SimpleExamGrammarParser.NumContext ctx) {
        Numerical n = new Numerical(Double.parseDouble(ctx.REAL().getText()));
        n.setDifficulty(Integer.parseInt(ctx.INT().getText()));
        n.setPrompt(ctx.STRING().getText().replace("\"",""));
        questions.add(n);
        return "";
    }

    @Override
    public String visitTrue_false(SimpleExamGrammarParser.True_falseContext ctx) {
        TrueFalse tf = new TrueFalse(Boolean.parseBoolean(ctx.BOOLEAN().getText()));
        tf.setDifficulty(Integer.parseInt(ctx.INT().getText()));
        tf.setPrompt(ctx.STRING().getText().replace("\"",""));
        questions.add(tf);
        return "";
    }
}
