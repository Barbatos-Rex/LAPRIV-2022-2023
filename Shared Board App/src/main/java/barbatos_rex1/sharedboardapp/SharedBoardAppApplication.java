package barbatos_rex1.sharedboardapp;

import barbatos_rex1.sharedboardapp.config.BoardServerConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan(basePackages = {"barbatos_rex1.laprivcore", "barbatos_rex1.sharedboardapp"})
@EnableJpaRepositories("barbatos_rex1.laprivcore")
@EnableConfigurationProperties(BoardServerConfig.class)
@SpringBootApplication
public class SharedBoardAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(SharedBoardAppApplication.class, args);
    }

}
