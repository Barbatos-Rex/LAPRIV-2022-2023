package barbatos_rex1.adminapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"barbatos_rex1.laprivcore", "barbatos_rex1.adminapp"})
@EnableJpaRepositories("barbatos_rex1.laprivcore")
public class AdminAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdminAppApplication.class, args);
    }

}
