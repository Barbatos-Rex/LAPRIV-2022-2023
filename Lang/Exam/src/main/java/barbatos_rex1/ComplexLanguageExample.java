package barbatos_rex1;

import barbatos_rex1.exam.ExamCompiler;
import barbatos_rex1.exam.ExamVisitorCompiler;

public class ComplexLanguageExample {


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
                                         prompt: "What is the result of the following expression?\n (1 | 0 ) & (~ 1 v 0)",
                                         body:{
                                             code : numerical,
                                             awnser: 0
                                         },
                                         difficulty: 5
                                     },
                                     {
                                         prompt: "What is the result of the following expression?\n (1 | 0 ) & (~ 1 v 0)",
                                         body:{
                                             code : numerical,
                                             awnser: 0
                                         },
                                         difficulty: 1
                                     },
                                     {
                                         prompt: "What is the result of the following expression?\n (1 | 0 ) & (~ 1 v 0)",
                                         body:{
                                             code : numerical,
                                             awnser: 0
                                         },
                                         difficulty: 2
                                     },
                                     {
                                         prompt: "What is the result of the following expression?\n (1 | 0 ) & (~ 1 v 0)",
                                         body:{
                                             code : numerical,
                                             awnser: 0
                                         },
                                         difficulty: 5
                                     },
                                     {
                                         prompt: "What is the result of the following expression?\n (1 | 0 ) & (~ 1 v 0)",
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


    public static void main(String[] args){
        ExamCompiler compiler = new ExamVisitorCompiler(str);
        compiler.compile("./exams","Intro-Java-Sem01");
    }
}