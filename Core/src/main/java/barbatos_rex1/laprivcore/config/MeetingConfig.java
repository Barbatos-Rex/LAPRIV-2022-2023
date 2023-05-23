package barbatos_rex1.laprivcore.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;

@ConfigurationProperties(prefix = "meeting")
@ConfigurationPropertiesScan
@Data
public class MeetingConfig {

    private int defaultCourseDuration;



}
