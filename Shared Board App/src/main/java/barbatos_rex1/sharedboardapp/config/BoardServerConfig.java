package barbatos_rex1.sharedboardapp.config;

import lombok.Data;
import lombok.Getter;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.bind.DefaultValue;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ConfigurationProperties(prefix = "board-server")
@ConfigurationPropertiesScan
@Data
@Primary
public class BoardServerConfig {
    private boolean monitoring;


}
