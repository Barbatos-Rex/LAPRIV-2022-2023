package barbatos_rex1.laprivbootstrap.boot;

import org.springframework.boot.CommandLineRunner;

public interface Bootstrapper extends CommandLineRunner {

    void boot();

    @Override
    default void run(String... args) throws Exception{
        boot();
    }
}
