package barbatos_rex1.exam.struct.simple.listener;

import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarBaseListener;
import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarParser;
import barbatos_rex1.exam.primitive.Pool;
import barbatos_rex1.exam.primitive.Question;
import barbatos_rex1.exam.primitive.questions.Matching;
import lombok.Getter;

import java.util.*;
import java.util.stream.Collectors;

public class QuestionListener extends SimpleExamGrammarBaseListener {

    private List<Question> questions;
    @Getter
    private Pool pool;

    private Set<Matching.MatchingUnit> matchingQuestions = new HashSet<>();
    private Set<Matching.MatchingUnit> matchingAnswers = new HashSet<>();

    @Override
    public void enterPool(SimpleExamGrammarParser.PoolContext ctx) {
        String poolName = ctx.STRING().getText();
        enterPool_body(ctx.pool_body());
        pool = new Pool(poolName, questions);
    }

    @Override
    public void exitMatching(SimpleExamGrammarParser.MatchingContext ctx) {
        Matching m = new Matching(matchingQuestions.stream().toList(), matchingAnswers.stream().toList());
        m.setDifficulty(Integer.parseInt(ctx.DIFFICULTY().getText()));
        m.setPrompt(ctx.STRING().getText());
        questions.add(m);
        super.exitMatching(ctx);
    }

    @Override
    public void enterMatching_map(SimpleExamGrammarParser.Matching_mapContext ctx) {
        super.enterMatching_map(ctx);
    }

    @Override
    public void exitMatching_map(SimpleExamGrammarParser.Matching_mapContext ctx) {
        super.exitMatching_map(ctx);
    }

    @Override
    public void enterMatching_map_atomic(SimpleExamGrammarParser.Matching_map_atomicContext ctx) {
        super.enterMatching_map_atomic(ctx);
    }

    @Override
    public void exitMatching_map_atomic(SimpleExamGrammarParser.Matching_map_atomicContext ctx) {
        super.exitMatching_map_atomic(ctx);
    }

    @Override
    public void enterMultiple(SimpleExamGrammarParser.MultipleContext ctx) {
        super.enterMultiple(ctx);
    }

    @Override
    public void exitMultiple(SimpleExamGrammarParser.MultipleContext ctx) {
        super.exitMultiple(ctx);
    }

    @Override
    public void enterMultiple_map(SimpleExamGrammarParser.Multiple_mapContext ctx) {
        super.enterMultiple_map(ctx);
    }

    @Override
    public void exitMultiple_map(SimpleExamGrammarParser.Multiple_mapContext ctx) {
        super.exitMultiple_map(ctx);
    }

    @Override
    public void enterMultiple_map_atomic(SimpleExamGrammarParser.Multiple_map_atomicContext ctx) {
        super.enterMultiple_map_atomic(ctx);
    }

    @Override
    public void exitMultiple_map_atomic(SimpleExamGrammarParser.Multiple_map_atomicContext ctx) {
        super.exitMultiple_map_atomic(ctx);
    }

    @Override
    public void enterShort(SimpleExamGrammarParser.ShortContext ctx) {
        super.enterShort(ctx);
    }

    @Override
    public void exitShort(SimpleExamGrammarParser.ShortContext ctx) {
        super.exitShort(ctx);
    }

    @Override
    public void enterMissing(SimpleExamGrammarParser.MissingContext ctx) {
        super.enterMissing(ctx);
    }

    @Override
    public void exitMissing(SimpleExamGrammarParser.MissingContext ctx) {
        super.exitMissing(ctx);
    }

    @Override
    public void enterKey_map(SimpleExamGrammarParser.Key_mapContext ctx) {
        super.enterKey_map(ctx);
    }

    @Override
    public void exitKey_map(SimpleExamGrammarParser.Key_mapContext ctx) {
        super.exitKey_map(ctx);
    }

    @Override
    public void enterKey_map_atomic(SimpleExamGrammarParser.Key_map_atomicContext ctx) {
        super.enterKey_map_atomic(ctx);
    }

    @Override
    public void exitKey_map_atomic(SimpleExamGrammarParser.Key_map_atomicContext ctx) {
        super.exitKey_map_atomic(ctx);
    }

    @Override
    public void enterNum(SimpleExamGrammarParser.NumContext ctx) {
        super.enterNum(ctx);
    }

    @Override
    public void exitNum(SimpleExamGrammarParser.NumContext ctx) {
        super.exitNum(ctx);
    }

    @Override
    public void enterTrue_false(SimpleExamGrammarParser.True_falseContext ctx) {
        super.enterTrue_false(ctx);
    }

    @Override
    public void exitTrue_false(SimpleExamGrammarParser.True_falseContext ctx) {
        super.exitTrue_false(ctx);
    }
}
