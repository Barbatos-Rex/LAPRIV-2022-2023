package barbatos_rex1.exam;

import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarLexer;
import barbatos_rex1.exam.antlr4.lang.simple.SimpleExamGrammarParser;
import lombok.AllArgsConstructor;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.TokenStream;

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
    public void compile(String dirPath, String courseCode) {
        SimpleExamGrammarParser parser = genParser();







    }
}
