package barbatos_rex1;

import barbatos_rex1.exam.factory.Exam;
import lombok.SneakyThrows;
import org.json.JSONObject;

import java.io.*;
import java.util.Scanner;

import static barbatos_rex1.grading.utils.Computation.*;

public class Main {
    @SneakyThrows
    public static void main(String[] args) throws FileNotFoundException {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(new File("exams/Into-Java-Sem02.exm"));
        while(sc.hasNextLine()){
            sb.append(sc.nextLine()).append("\n");
        }
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("exams/Into-Java-Sem02.bin"));
        Exam exam = ((Exam) ois.readObject());
        System.out.println(exam);
    }
}