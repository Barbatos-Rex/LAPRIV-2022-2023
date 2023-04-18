package barbatos_rex1;

import barbatos_rex1.exam.antlr4.lang.ExamGrammarBaseVisitor;
import barbatos_rex1.exam.antlr4.lang.ExamGrammarLexer;
import barbatos_rex1.exam.antlr4.lang.ExamGrammarParser;
import barbatos_rex1.exam.factory.Exam;
import barbatos_rex1.exam.factory.ExamFactory;
import barbatos_rex1.exam.primitive.ExamPrototype;
import barbatos_rex1.exam.primitive.Header;
import barbatos_rex1.exam.struct.visitor.StartVisitor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Main {


    static String str = """
            // Comment
                                    \s
                                    \s
                         pools: [
                             {
                                 name: "Pool 1",
                                 questions:[
                                     {
                                         prompt: "Witch course in LEI ISEP that evaluates about creating grammars and solutions to problems using costume languages?",
                                         body: {
                                             code: short-awnser,
                                             awnser: "LPROG"
                                         },
                                         difficulty: 3
                                     },
                                     {
                                         prompt: "What is the result of the following expression?\\\\n (1 | 0 ) & (~ 1 v 0)",
                                         body:{
                                             code : numerical,
                                             awnser: 0
                                         },
                                         difficulty: 5
                                     },
                                     {
                                         prompt: "What is the result of the following expression?\\\\n (1 | 0 ) & (~ 1 v 0)",
                                         body:{
                                             code : numerical,
                                             awnser: 0
                                         },
                                         difficulty: 5
                                     },
                                     {
                                         prompt: "What is the result of the following expression?\\\\n (1 | 0 ) & (~ 1 v 0)",
                                         body:{
                                             code : numerical,
                                             awnser: 0
                                         },
                                         difficulty: 5
                                     },
                                     {
                                         prompt: "What is the result of the following expression?\\\\n (1 | 0 ) & (~ 1 v 0)",
                                         body:{
                                             code : numerical,
                                             awnser: 0
                                         },
                                         difficulty: 5
                                     },
                                     {
                                         prompt: "What is the result of the following expression?\\\\n (1 | 0 ) & (~ 1 v 0)",
                                         body:{
                                             code : numerical,
                                             awnser: 0
                                         },
                                         difficulty: 5
                                     }
                                  \s
                                 ]
                             }
                         ]
                                    \s
                                    \s
                                    \s
                                    \s
                         exam{
                             id: "cbckjhasbc",
                             title: "chbkjabckja",
                             header: {
                                 description: "aacaca",
                                 grading: after-closing,
                                 feedback: after-closing
                             },
                             sections: [{
                                 id: "wbekcjbwds",
                                 description: "Some Knoladge",
                                 difficulty: 15,
                                 limitQuestion: 5,
                                 pool: "Pool 1"
                             }]
                         }
                        
            """;


    public static void main(String[] args) throws FileNotFoundException {

        CharStream stream = CharStreams.fromString(str);
        ExamGrammarLexer lexer = new ExamGrammarLexer(stream);
        TokenStream ts = new CommonTokenStream(lexer);
        ExamGrammarParser parser = new ExamGrammarParser(ts);


        StartVisitor vis = new StartVisitor();
        ExamPrototype exam = vis.visitStart(parser.start());
        ExamFactory factory = new ExamFactory(exam);

        File f = new File("./exams/exam.exm");
        f.getParentFile().mkdirs();
        PrintWriter pw = new PrintWriter(f);
        pw.println(factory.generateNewExam().compile());
        System.out.println(f.getAbsolutePath());
        pw.flush();
    }
}