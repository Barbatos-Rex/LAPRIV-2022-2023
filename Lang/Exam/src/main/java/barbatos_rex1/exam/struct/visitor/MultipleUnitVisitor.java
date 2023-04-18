package barbatos_rex1.exam.struct.visitor;

import barbatos_rex1.exam.antlr4.lang.ExamGrammarBaseVisitor;
import barbatos_rex1.exam.antlr4.lang.ExamGrammarParser;
import barbatos_rex1.exam.primitive.questions.MultipleChoice;

import java.util.ArrayList;
import java.util.List;

public class MultipleUnitVisitor extends ExamGrammarBaseVisitor<List<MultipleChoice.MultipleUnit>> {

    @Override
    public List<MultipleChoice.MultipleUnit> visitMultiple_choice_options(ExamGrammarParser.Multiple_choice_optionsContext ctx) {

        List<MultipleChoice.MultipleUnit> merge = new ArrayList<>();
        merge.addAll(visit(ctx.opt1));
        merge.addAll(visit(ctx.opt2));
        merge.addAll(visit(ctx.opt3));
        merge.addAll(visit(ctx.opt4));
        return merge;
    }

    @Override
    public List<MultipleChoice.MultipleUnit> visitMultiple_choice_options_body(ExamGrammarParser.Multiple_choice_options_bodyContext ctx) {
        String prompt = ctx.STRING().getText().replace("\"","");
        boolean b;
        try {
            b = Boolean.parseBoolean(ctx.true_false_option().getText());
        } catch (Exception e) {
            //TODO EXCEPTION
            throw new RuntimeException(e);
        }
        return List.of(new MultipleChoice.MultipleUnit(prompt, b));
    }
}
