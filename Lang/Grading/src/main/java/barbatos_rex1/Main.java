package barbatos_rex1;

import barbatos_rex1.exam.factory.Exam;
import barbatos_rex1.grading.GradingCompiler;
import barbatos_rex1.grading.misc.ExamTakingUI;
import barbatos_rex1.grading.primitive.GradableQuestion;
import barbatos_rex1.grading.primitive.questions.*;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;
import java.util.*;

public class Main {
    @SneakyThrows
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(new File("exams/Into-Java-Sem02.exm"));
        while (sc.hasNextLine()) {
            sb.append(sc.nextLine()).append("\n");
        }
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("exams/Into-Java-Sem02.bin"));
        Exam exam = ((Exam) ois.readObject());

        ExamTakingUI ui = new ExamTakingUI(exam);


        List<GradableQuestion> gradableQuestions = new ArrayList<>();
        gradableQuestions.add(new GradableMultipleChoiceQuestion("13", "Which is a valid main declaration in Java?",
                13, 0, 0, List.of(new GradableMultipleChoiceQuestion.MultipleUnit("public static main(String[] args)", false),
                new GradableMultipleChoiceQuestion.MultipleUnit("public void main(String[] args)", false),
                new GradableMultipleChoiceQuestion.MultipleUnit("public staic void main(String maria[])", true),
                new GradableMultipleChoiceQuestion.MultipleUnit("public static void main()", false))
                , new GradableMultipleChoiceQuestion.MultipleUnit("public staic void main(String maria[])", true)));
        Map<Integer, String> map = new HashMap<>();
        map.put(0, "Compiled");
        map.put(1, "Source Code");
        map.put(2, "Converted");
        map.put(3, "Machine Code");
        map.put(4, "Byte Code");
        map.put(5, "Interpreted");
        map.put(6, "Execute code line by line");
        map.put(7, "Strongly");
        map.put(8, "Distinguish");
        map.put(9, "Overloading");
        map.put(10, "Name");
        map.put(11, "Signature");
        map.put(12, "Compile Time");

        Map<Integer, Integer> options = new HashMap<>();
        options.put(0, 0);
        options.put(1, 1);
        options.put(2, 2);
        options.put(3, 3);
        options.put(4, 4);
        options.put(5, 6);
        options.put(6, 5);
        options.put(7, 7);
        options.put(8, 8);
        options.put(9, 9);
        options.put(10, 10);
        options.put(11, 11);
        options.put(12, 12);
        gradableQuestions.add(new GradableMissingWordsQuestion("14", "Complete the following text:", 14, 0, 0, map, options,
                "Like many languages Java is a @0@ language, which means that Java @1@ is @2@ into @3@, in Java's case, @4@.\\n                However, other languages can be @5@ languages, which means that said languages, like Python, @6@.\\n                 Having said that, Java is @7@ typed, allowing for @8@ between data types at @12@. In adition to that, Java alows the @9@ of\\n                 methods and functions, alowing multiple of them have the same @10@, as long as their @11@ is diferent."));

        gradableQuestions.add(new GradableMultipleChoiceQuestion("15", "Which of the following contain one (or more) words that are not Java keywords?", 15, 0, 0, List.of(new GradableMultipleChoiceQuestion.MultipleUnit("catch, enum, continue, transcient", false),
                new GradableMultipleChoiceQuestion.MultipleUnit("do, final, native, strictftp", false),
                new GradableMultipleChoiceQuestion.MultipleUnit("val, class, new, assert", true),
                new GradableMultipleChoiceQuestion.MultipleUnit("abstract, public, byte, volatile", false)),
                new GradableMultipleChoiceQuestion.MultipleUnit("val, class, new, assert", true)));

        gradableQuestions.add(new GradableTrueFalseQuestion("7", "The Map interface is a Collection", 2, 0, 0, false, true));
        gradableQuestions.add(new GradableNumericalQuestion("2", "What is the result printed to the standard output of the following code:\\\\n\\n           public static int mystery(int n){\\\\n\\n           \\\\tif(n==0){\\\\n\\n           \\\\t\\\\treturn 1;\\\\n\\n           \\\\t}\\\\n\\n           \\\\treturn mystery(n-1);\\\\n\\n           }\\\\n\\n           \\\\n\\n           public static void main(String[] args){\\\\n\\n           \\\\tSystem.out.println(mystery(5));\\\\n\\n           }",
                0, 0, 0, 120.0, 0, 0, 120.0));
        gradableQuestions.add(new GradableShortAwnserQuestion("4", "Replace ??? with the correct awnser (use spaces between tokens):\\\\n\\\\n\\n            public static void main(String[] args){\\\\n\\n            \\\\tList<Integer> l = new ArrayList<>();\\n            \\\\tint n = 1;\\\\n\\n            \\\\tfor(int i = 1 ; ???){\\\\n\\n            \\\\t\\\\tn*=i;\\\\n\\n\\n            \\\\t}\\n            \\\\tSystem.out.println(n);\\\\n\\n            }\\\\n\\n            Standard Output: [1,2,6,24,120,720]\\\\n", 4, 0, 0, "i < 7 ; i++", "", ""));


        map = new HashMap<>();
        map.put(1, "int");
        map.put(2, "int sum=0");
        map.put(3, "int i=0");
        map.put(4, "arr.length()");
        map.put(5, "arr[i]==elem");
        map.put(6, "sum++");
        map.put(7, "return sum");
        map.put(8, "5");

        options = new HashMap<>();
        options.put(1, 1);
        options.put(2, 2);
        options.put(3, 3);
        options.put(4, 4);
        options.put(6, 6);
        options.put(5, 5);
        options.put(7, 7);
        options.put(8, 8);
        gradableQuestions.add(new GradableMissingWordsQuestion("3", "Complete the following code in such way that the output to the standard output is correct:", 3, 0, 0, map, options, "public static @1@ countRepeatedElements(int[] arr, int elem){\\\\n\\n            \\\\t@2@;\\\\n\\n            \\\\tfor(@3@;i<@4@;i++){\\\\n\\n                \\\\t\\\\tif(@5@){\\\\n\\n                \\\\t\\\\t\\\\t@6@;\\\\n\\n            \\\\t\\\\t}\\\\n\\n            @7@;\\n            }\\\\n\\n            public static void main(String[] args){\\\\n\\n            \\\\tSystem.out.println(countRepeatedElements(new int[]{1,5,2,2,4,3,5,5,6,7,8,1},@8@));\\n            }\\\\n\\\\n\\n            Standard Output:\\\\n3"));


        List<GradableMatchingQuestion.MatchingUnit> set1 = new LinkedList<>();
        set1.add(new GradableMatchingQuestion.MatchingUnit(2, "What is the defference between static and no static members?"));
        set1.add(new GradableMatchingQuestion.MatchingUnit(3, "What is the diffference between generic algorithms and non generic algorithms?"));
        set1.add(new GradableMatchingQuestion.MatchingUnit(1, "What is polymorphism?"));
        set1.add(new GradableMatchingQuestion.MatchingUnit(0, "What is the difference between fori and foreach in Java?"));

        List<GradableMatchingQuestion.MatchingUnit> set2 = new LinkedList<>();
        set2.add(new GradableMatchingQuestion.MatchingUnit(2, "While the first is not implementation specific, the secound is implementation specific."));
        set2.add(new GradableMatchingQuestion.MatchingUnit(3, "What is the diffference between generic algorithms and non generic algorithms?"));
        set2.add(new GradableMatchingQuestion.MatchingUnit(1, "The property of replacing the implementation of a give protion of code with multiple implementation, given they have the same signature."));
        set2.add(new GradableMatchingQuestion.MatchingUnit(0, "The first uses a counter to progess the looping logic while the other iterates over a collection of elements."));


        Map<GradableMatchingQuestion.MatchingUnit, GradableMatchingQuestion.MatchingUnit> mapp = new HashMap<>();

        mapp.put(set1.get(0), set2.get(0));
        mapp.put(set1.get(3), set2.get(3));
        mapp.put(set1.get(2), set2.get(2));
        mapp.put(set1.get(1), set2.get(1));
        gradableQuestions.add(new GradableMatchingQuestion("1",
                "Match the following questions to their respective awnser", 1, 0,
                0, new HashSet<>(set1), new HashSet<>(set2), mapp));
        sc = new Scanner(new File("Lang/Grading/src/main/resources/simple.txt"));
        sb = new StringBuilder();

        while (sc.hasNextLine()) {
            sb.append(sc.nextLine()).append("\n");
        }
        GradingCompiler gc = new GradingCompiler(sb.toString());
        var result = gc.correct(gradableQuestions);
        System.out.println();
        System.out.println();
        System.out.println("Final Grade: "+result);
    }
}