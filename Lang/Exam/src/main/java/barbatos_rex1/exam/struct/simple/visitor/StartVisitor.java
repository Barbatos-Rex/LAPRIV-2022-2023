package barbatos_rex1.exam.struct.simple.visitor;

import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarBaseVisitor;
import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarParser;
import barbatos_rex1.exam.exception.CompilerException;
import barbatos_rex1.exam.primitive.ExamPrototype;
import barbatos_rex1.exam.primitive.Header;
import barbatos_rex1.exam.primitive.Pool;
import barbatos_rex1.exam.primitive.PrototypeSection;
import lombok.Getter;
import lombok.SneakyThrows;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

@Getter
public class StartVisitor extends SimpleExamGrammarBaseVisitor<String> {
    private ExamPrototype exam;
    private Map<String, Pool> pools = new HashMap<>();
    private Map<String, PrototypeSection> sections = new HashMap<>();
    private Set<String> usedSectionIds = new HashSet<>();

    @Override
    public String visitPool(SimpleExamGrammarParser.PoolContext ctx) {
        QuestionVisitor v = new QuestionVisitor();
        v.visitPool(ctx);
        pools.put(v.getPool().getName(), v.getPool());
        return "";
    }

    @Override
    @SneakyThrows
    public String visitSection(SimpleExamGrammarParser.SectionContext ctx) {
        String id = ctx.id.getText().replace("\"", "");
        String desc = ctx.desc.getText().replace("\"", "");
        int maxDifficulty = Integer.parseInt(ctx.mDif.getText());
        String poolName = ctx.npool.getText().replace("\"", "");

        String max = "-1";
        if (ctx.section_maximum_number_of_questions() != null) {
            max = visit(ctx.section_maximum_number_of_questions());
        }
        if (!pools.containsKey(poolName)) {
            throw new CompilerException("No pool with such id!", ctx.npool.getLine(), ctx.npool.getCharPositionInLine());
        }


        PrototypeSection ps = new PrototypeSection(id, desc, maxDifficulty, Integer.parseInt(max), pools.get(poolName));
        if (sections.containsKey(id)) {
            throw new CompilerException("Section with such id already registered!", ctx.id.getLine(), ctx.id.getStartIndex());
        }
        sections.put(id, ps);
        return "";
    }

    @Override
    public String visitSection_maximum_number_of_questions(SimpleExamGrammarParser.Section_maximum_number_of_questionsContext ctx) {
        if (ctx == null) {
            return "-1";
        }
        return ctx.INT().getText();
    }

    @Override
    @SneakyThrows
    public String visitExam(SimpleExamGrammarParser.ExamContext ctx) {
        String title = ctx.titl.getText().replace("\"", "");
        String description = ctx.desc.getText().replace("\"", "");
        String grading = ctx.g.getText().replace("\"", "");
        String feedback = ctx.f.getText().replace("\"", "");
        String id = ctx.fname.getText().replace("\"", "");

        var optGrading = Header.HeaderType.fromString(grading);
        var optFeedback = Header.HeaderType.fromString(feedback);

        if (optGrading.isEmpty()) {
            throw new CompilerException("Not a valid grading!", ctx.g.getLine(), ctx.g.getCharPositionInLine());
        }
        if (optFeedback.isEmpty()) {
            throw new CompilerException("Not a valid grading!", ctx.f.getLine(), ctx.f.getCharPositionInLine());
        }
        visit(ctx.sections_arr());
        sections = sections.entrySet().stream().filter(e -> this.usedSectionIds.contains(e.getValue().getId())).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        this.exam = new ExamPrototype(id, title, new Header(description, optGrading.get(), optFeedback.get()), sections.values().stream().toList());
        return "";
    }

    @Override
    public String visitSections_arr(SimpleExamGrammarParser.Sections_arrContext ctx) {
        usedSectionIds.add(ctx.STRING().getText().replace("\"", ""));
        return "";
    }
}
