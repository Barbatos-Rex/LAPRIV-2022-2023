package barbatos_rex1.exam.struct.first.visitor;

import barbatos_rex1.exam.antlr4.lang.first.ExamGrammarBaseVisitor;
import barbatos_rex1.exam.antlr4.lang.first.ExamGrammarParser;
import barbatos_rex1.exam.exception.CompilerException;
import barbatos_rex1.exam.primitive.ExamPrototype;
import barbatos_rex1.exam.primitive.Header;
import barbatos_rex1.exam.primitive.PrototypeSection;
import lombok.Getter;
import lombok.SneakyThrows;

import java.util.ArrayList;
import java.util.List;

@Getter
public class ExamVisitor extends ExamGrammarBaseVisitor<Object> {
    private final PoolVisitor poolVisitor;
    private ExamPrototype exam;

    public ExamVisitor(PoolVisitor poolVisitor) {
        this.poolVisitor = poolVisitor;
    }

    @Override
    public Object visitExam_body(ExamGrammarParser.Exam_bodyContext ctx) {
        String id = ctx.exam_id.getText().replace("\"","");
        String title = ctx.exam_title.getText().replace("\"","");
        Header h = ((Header) visit(ctx.header()));
        List<PrototypeSection> secs = ((List<PrototypeSection>) visit(ctx.sections()));
        exam = new ExamPrototype(id, title, h, secs);
        return exam;
    }

    @Override
    public Object visitSections(ExamGrammarParser.SectionsContext ctx) {
        return visitSections_body(ctx.sections_body());
    }

    @Override
    public Object visitSections_body(ExamGrammarParser.Sections_bodyContext ctx) {
        PrototypeSection ps = ((PrototypeSection) visitSection_object(ctx.section_object()));
        List<PrototypeSection> sections;
        if (ctx.sections_body() == null) {
            sections = new ArrayList<>();
        } else {
            sections = ((List<PrototypeSection>) this.visitSections_body(ctx.sections_body()));
        }
        var l = new ArrayList<>();
        l.add(ps);
        l.addAll(sections);
        return l;
    }

    @SneakyThrows
    @Override
    public Object visitSection_object(ExamGrammarParser.Section_objectContext ctx) {
        int dif = 0;
        int lim = 0;
        try {
            dif = Integer.parseInt(ctx.dif.getText());
        } catch (NumberFormatException e) {
            throw new CompilerException("Not a valid integer",ctx.dif.getLine(),ctx.dif.getStartIndex());
        }
        try {
            lim = Integer.parseInt(ctx.limit.getText());
        } catch (NumberFormatException e) {
            throw new CompilerException("Not a valid integer",ctx.limit.getLine(),ctx.limit.getStartIndex());
        }
        try {
            if (!poolVisitor.getPools().containsKey(ctx.pol_name.getText().replace("\"",""))) {
                throw new CompilerException("Not a pool name that is registered",ctx.pol_name.getLine(),ctx.pol_name.getStartIndex());
            }
        } catch (RuntimeException e) {
            throw new CompilerException("Strange error, realy",ctx.pol_name.getLine(),ctx.pol_name.getStartIndex());
        }
        return new PrototypeSection(ctx.sec_id.getText().replace("\"",""), ctx.sec_des.getText().replace("\"",""), dif, lim, poolVisitor.getPools().get(ctx.pol_name.getText().replace("\"","")));
    }

    @Override
    public Object visitHeader(ExamGrammarParser.HeaderContext ctx) {
        return visitHeader_body(ctx.header_body());
    }

    @SneakyThrows
    @Override
    public Object visitHeader_body(ExamGrammarParser.Header_bodyContext ctx) {
        Header.HeaderType grading = switch (ctx.grad.getText().toLowerCase()) {
            case "none" -> Header.HeaderType.NONE;
            case "on-submission" -> Header.HeaderType.ON_SUBMISSION;
            case "after-closing" -> Header.HeaderType.AFTER_CLOSING;
            default -> throw new CompilerException("Not a valid grading option, should either be none, on-submission or after-closing",ctx.grad.getLine(),ctx.grad.getStartIndex());
        };
        Header.HeaderType feedback = switch (ctx.feed.getText().toLowerCase()) {
            case "none" -> Header.HeaderType.NONE;
            case "on-submission" -> Header.HeaderType.ON_SUBMISSION;
            case "after-closing" -> Header.HeaderType.AFTER_CLOSING;
            default -> throw new CompilerException("Not a valid grading option, should either be none, on-submission or after-closing",ctx.feed.getLine(),ctx.feed.getStartIndex());
        };
        return new Header(ctx.des.getText().replace("\"",""), grading, feedback);
    }
    public ExamPrototype exam() {
        return exam;
    }
}
