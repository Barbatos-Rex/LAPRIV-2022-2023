package barbatos_rex1.laprivcore;

import barbatos_rex1.laprivcore.config.SharedBoardConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties({SharedBoardConfig.class})
@ConfigurationPropertiesScan("barbatos_rex1.laprivcore.config")
public class CoreApplication {

    public static void main(String[] args) {
        SpringApplication.run(CoreApplication.class, args);
    }

}
