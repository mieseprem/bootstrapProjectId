package mieseprem;

import javax.annotation.PostConstruct;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@EnableConfigurationProperties(MiesepremProperty.class)
@RequiredArgsConstructor
@Slf4j
public class MiesepremPropertyLogger {
  final MiesepremProperty miesepremProperty;

  @PostConstruct
  void logValues() {
    log.info("Mieseprem property: {}", miesepremProperty);
  }
}
