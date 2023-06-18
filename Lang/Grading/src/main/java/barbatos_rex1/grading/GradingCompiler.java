package barbatos_rex1.grading;

import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarLexer;
import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarParser;
import barbatos_rex1.exam.factory.Exam;
import barbatos_rex1.exam.factory.ExamFactory;
import barbatos_rex1.exam.primitive.ExamPrototype;
import barbatos_rex1.grading.antlr4.lang.SimpleGradingGrammarLexer;
import barbatos_rex1.grading.antlr4.lang.SimpleGradingGrammarParser;
import barbatos_rex1.grading.primitive.GradableQuestion;
import barbatos_rex1.grading.primitive.GradingRules;
import barbatos_rex1.grading.struc.visitor.StartVisitor;
import barbatos_rex1.grading.utils.Computation;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.json.JSONObject;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.util.List;

@AllArgsConstructor
public class GradingCompiler {

    private String examProtoString;

    public SimpleGradingGrammarParser genParser(){
        CharStream stream = CharStreams.fromString(examProtoString);
        SimpleGradingGrammarLexer lexer = new SimpleGradingGrammarLexer(stream);
        TokenStream ts = new CommonTokenStream(lexer);
        return new SimpleGradingGrammarParser(ts);
    }

    @SneakyThrows
    public String correct(List<GradableQuestion> questions) {
        SimpleGradingGrammarParser parser = genParser();
        StartVisitor listener = new StartVisitor();
        listener.visit(parser.start());
        var results = listener.getRulesMap();
        long gradeSum = 0;
        long maxGradeSum=0;
        for (GradableQuestion question : questions) {
            GradingRules rule = results.get(question.getIdCode());
            gradeSum+=rule.grade(question);
            maxGradeSum+=rule.maxGrade();
        }
        Computation.Fraction grade = new Computation.Fraction(gradeSum,maxGradeSum);
        return listener.getPresentation().present(grade);
    }
}
