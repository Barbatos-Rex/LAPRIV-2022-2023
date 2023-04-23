package barbatos_rex1.sharedboardapp.config;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ConfigurationProperties(prefix = "listener")
@ConfigurationPropertiesScan
@NoArgsConstructor
@Data
@Primary
public class ListenerConfig {
    private List<String> handlerClasses = new ArrayList<>();
}
