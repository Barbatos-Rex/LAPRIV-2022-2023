package barbatos_rex1;

import barbatos_rex1.exam.ExamCompiler;
import barbatos_rex1.exam.ExamListenerCompiler;
import lombok.SneakyThrows;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class SimpleLanguageExample {
    @SneakyThrows
    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(new File("Lang/Exam/src/main/resources/simple_text.txt"));
        while (sc.hasNextLine()) {
            sb.append(sc.nextLine()).append("\n");
        }
        ExamCompiler compiler = new ExamListenerCompiler(sb.toString());
        compiler.compile("./exams","Into-Java-Sem02");

    }
}
