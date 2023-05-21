package barbatos_rex1.exam;

import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarLexer;
import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarParser;
import barbatos_rex1.exam.factory.Exam;
import barbatos_rex1.exam.factory.ExamFactory;
import barbatos_rex1.exam.primitive.ExamPrototype;
import barbatos_rex1.exam.struct.simple.listener.StartListener;
import barbatos_rex1.exam.struct.simple.visitor.StartVisitor;
import lombok.AllArgsConstructor;
import lombok.SneakyThrows;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;
import org.json.JSONObject;

import java.io.File;
import java.io.PrintWriter;

@AllArgsConstructor
public class ExamListenerCompiler implements ExamCompiler{
    private String examProtoString;

    public SimpleExamGrammarParser genParser(){
        CharStream stream = CharStreams.fromString(examProtoString);
        SimpleExamGrammarLexer lexer = new SimpleExamGrammarLexer(stream);
        TokenStream ts = new CommonTokenStream(lexer);
        return new SimpleExamGrammarParser(ts);
    }



    @Override
    @SneakyThrows
    public void compile(String dirPath, String courseCode) {
        SimpleExamGrammarParser parser = genParser();
        StartVisitor listener = new StartVisitor();
        listener.visit(parser.start());
        ExamPrototype examPrototype = listener.getExam();
        System.out.println(new JSONObject(examPrototype).toString(2));
        Exam exam = new ExamFactory(examPrototype).generateNewExam();
        exam.validate();
        new File(dirPath).mkdirs();
        File f =new File(dirPath+"/"+courseCode+".exm");
        PrintWriter pw = new PrintWriter(f);
        pw.println(exam.compile());
        pw.flush();
        System.out.println(f.getAbsolutePath());
    }
}
