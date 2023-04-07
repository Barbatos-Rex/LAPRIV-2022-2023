package barbatos_rex1.laprivstudentapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"barbatos_rex1.laprivcore", "barbatos_rex1.laprivstudentapp"})
@EnableJpaRepositories("barbatos_rex1.laprivcore")
public class StudentAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(StudentAppApplication.class, args);
    }

}
