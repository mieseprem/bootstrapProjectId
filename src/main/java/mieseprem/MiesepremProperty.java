package mieseprem;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "mieseprem")
@Data
public class MiesepremProperty {
  private String secretFromXxxDefaultExplicit;
  private String secretFromXxxDefaultImplicit;
  private String secretFromXxxSecretmanagerExplicit;
}
