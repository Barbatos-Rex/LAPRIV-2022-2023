package barbatos_rex1.exam;

import barbatos_rex1.exam.antlr4.lang.first.ExamGrammarLexer;
import barbatos_rex1.exam.antlr4.lang.first.ExamGrammarParser;
import barbatos_rex1.exam.factory.Exam;
import barbatos_rex1.exam.factory.ExamFactory;
import barbatos_rex1.exam.primitive.ExamPrototype;
import barbatos_rex1.exam.struct.first.visitor.StartVisitor;
import lombok.AllArgsConstructor;
import lombok.Getter;
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

@AllArgsConstructor
@Getter
public class ExamVisitorCompiler implements ExamCompiler {
    private String examProtoString;


    private ExamGrammarParser generateParser() {
        CharStream stream = CharStreams.fromString(examProtoString);
        ExamGrammarLexer lexer = new ExamGrammarLexer(stream);
        TokenStream ts = new CommonTokenStream(lexer);
        return new ExamGrammarParser(ts);
    }
    @SneakyThrows
    @Override
    public void compile(String dirPath, String courseCode) {
        ExamGrammarParser parser = generateParser();
        StartVisitor visitor = new StartVisitor();
        ExamPrototype protoExam = visitor.visitStart(parser.start());
        System.out.println(new JSONObject(protoExam).toString(2));
        Exam exam = new ExamFactory(protoExam).generateNewExam();
        exam.validate();
        new File(dirPath).mkdirs();
        File f =new File(dirPath+"/"+courseCode+".exm");
        PrintWriter pw = new PrintWriter(f);
        pw.println(exam.compile());
        pw.flush();
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("./exams/Into-Java-Sem02.bin"));
        oos.writeObject(exam);
        System.out.println(f.getAbsolutePath());
    }
}
