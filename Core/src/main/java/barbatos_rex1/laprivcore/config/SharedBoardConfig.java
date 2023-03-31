package barbatos_rex1.laprivcore.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationProperties(prefix = "sharedboard")
@ConfigurationPropertiesScan
@Data
public class SharedBoardConfig {


    private int maxStoredStatesPerBoard = 10;


}
