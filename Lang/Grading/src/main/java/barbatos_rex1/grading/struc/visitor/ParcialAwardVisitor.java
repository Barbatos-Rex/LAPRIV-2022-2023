package barbatos_rex1.grading.struc.visitor;

import barbatos_rex1.grading.antlr4.lang.SimpleGradingGrammarBaseVisitor;
import barbatos_rex1.grading.antlr4.lang.SimpleGradingGrammarParser;
import barbatos_rex1.grading.primitive.rules.ParcialAward;

public class ParcialAwardVisitor extends SimpleGradingGrammarBaseVisitor<ParcialAward> {
    @Override
    public ParcialAward visitParcial_awardal_atomic(SimpleGradingGrammarParser.Parcial_awardal_atomicContext ctx) {
        return new ParcialAward(Integer.parseInt(ctx.number.getText()),Integer.parseInt(ctx.points.getText()));
    }
}
