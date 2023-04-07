package barbatos_rex1.adminapp.service;

import org.springframework.stereotype.Service;

import java.io.PrintStream;

@Service
public class ConsoleService {
    private final PrintStream out = System.out;

    public void write(String msg, String... args) {
        this.out.print("> ");
        this.out.printf(msg, (Object[]) args);
        this.out.println();
    }


}
