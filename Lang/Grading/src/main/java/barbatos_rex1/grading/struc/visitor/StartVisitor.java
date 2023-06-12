package barbatos_rex1.grading.struc.visitor;

import barbatos_rex1.grading.antlr4.lang.SimpleGradingGrammarBaseVisitor;
import barbatos_rex1.grading.antlr4.lang.SimpleGradingGrammarParser;
import barbatos_rex1.grading.primitive.GradingRules;
import barbatos_rex1.grading.primitive.rules.*;
import lombok.Getter;

import java.util.*;


@Getter
public class StartVisitor extends SimpleGradingGrammarBaseVisitor<GradingRules> {
    private Map<String, GradingRules> rulesMap = new HashMap<>();
    private Set<ParcialAward> tmp = new HashSet<>();
    private List<String> tmpText = new ArrayList<>();
    private List<Double> tmpDouble = new ArrayList<>();

    @Override
    public GradingRules visitQuestions(SimpleGradingGrammarParser.QuestionsContext ctx) {
        rulesMap = new HashMap<>();
        return super.visitQuestions(ctx);
    }

    @Override
    public GradingRules visitMatching(SimpleGradingGrammarParser.MatchingContext ctx) {
        String id = ctx.STRING().toString().replace("\"", "");
        int max = Integer.parseInt(ctx.maxPoints.getText());
        int defaultVal = ctx.minPoints == null ? 0 : Integer.parseInt(ctx.minPoints.getText());
        visitParcial_awardal(ctx.parcial_awardal());
        rulesMap.put(id, new GradingMatchingRules(id, max, tmp, defaultVal));
        return null;
    }

    @Override
    public GradingRules visitParcial_awardal(SimpleGradingGrammarParser.Parcial_awardalContext ctx) {
        tmp = new HashSet<>();
        return super.visitParcial_awardal(ctx);
    }

    @Override
    public GradingRules visitParcial_awardal_atomic(SimpleGradingGrammarParser.Parcial_awardal_atomicContext ctx) {
        tmp.add(new ParcialAwardVisitor().visitParcial_awardal_atomic(ctx));
        return null;
    }

    @Override
    public GradingRules visitMultiple(SimpleGradingGrammarParser.MultipleContext ctx) {
        String id = ctx.STRING().toString().replace("\"", "");
        int max = Integer.parseInt(ctx.maxPoints.getText());
        int defaultVal = ctx.minPoints == null ? 0 : Integer.parseInt(ctx.minPoints.getText());
        visitParcial_awardal(ctx.parcial_awardal());
        rulesMap.put(id, new GradingMultipleRules(id, max, tmp, defaultVal));
        return null;
    }

    @Override
    public GradingRules visitShort(SimpleGradingGrammarParser.ShortContext ctx) {
        String id = ctx.STRING().toString().replace("\"", "");
        int max = Integer.parseInt(ctx.maxPoints.getText());
        int defaultVal = ctx.minPoints == null ? 0 : Integer.parseInt(ctx.minPoints.getText());
        visitAttach_text_options(ctx.attach_text_options());
        rulesMap.put(id, new GradingMultipleRules(id, max, tmp, defaultVal));
        return null;
    }

    @Override
    public GradingRules visitAttach_text_options(SimpleGradingGrammarParser.Attach_text_optionsContext ctx) {
        tmpText = new ArrayList<>();
        return super.visitAttach_text_options(ctx);
    }

    @Override
    public GradingRules visitAttach_text_options_atomic(SimpleGradingGrammarParser.Attach_text_options_atomicContext ctx) {
        tmpText.add(ctx.STRING().getText().replace("\"", ""));
        return null;
    }

    @Override
    public GradingRules visitNumerical(SimpleGradingGrammarParser.NumericalContext ctx) {
        String id = ctx.STRING().getText().replace("\"", "");
        visit(ctx.attach_real_options());
        int max = Integer.parseInt(ctx.maxPoints.getText());
        if (ctx.lv != null) {
            double lv = Double.parseDouble(ctx.lv.getText());
            double hv = Double.parseDouble(ctx.hV.getText());
            rulesMap.put(id, new GradingNumericalRules(id, tmpDouble, lv, hv, max, ctx.minPoints != null ? Integer.parseInt(ctx.minPoints.getText()) : 0));
            return null;
        }
        rulesMap.put(id, new GradingNumericalRules(id, tmpDouble, null, null, max, ctx.minPoints != null ? Integer.parseInt(ctx.minPoints.getText()) : 0));
        return null;
    }

    @Override
    public GradingRules visitAttach_real_options(SimpleGradingGrammarParser.Attach_real_optionsContext ctx) {
        tmpDouble = new ArrayList<>();
        return super.visitAttach_real_options(ctx);
    }

    @Override
    public GradingRules visitAttach_real_options_atomic(SimpleGradingGrammarParser.Attach_real_options_atomicContext ctx) {
        tmpDouble.add(Double.parseDouble(ctx.REAL().getText()));
        return null;
    }

    @Override
    public GradingRules visitMissing(SimpleGradingGrammarParser.MissingContext ctx) {
        String id = ctx.STRING().toString().replace("\"", "");
        int max = Integer.parseInt(ctx.max.getText());
        int defaultVal = ctx.min == null ? 0 : Integer.parseInt(ctx.min.getText());
        visitParcial_awardal(ctx.parcial_awardal());
        rulesMap.put(id, new GradingMissingRules(id, tmp.stream().toList(), max, defaultVal));
        return null;
    }

    @Override
    public GradingRules visitTrue_false(SimpleGradingGrammarParser.True_falseContext ctx) {
        String id = ctx.STRING().getText().replace("\"", "");
        int points = Integer.parseInt(ctx.max.getText());
        int min = ctx.min == null ? 0 : Integer.parseInt(ctx.min.getText());
        rulesMap.put(id, new GradingTrueFalseRules(id, points, min));
        return null;
    }
}
