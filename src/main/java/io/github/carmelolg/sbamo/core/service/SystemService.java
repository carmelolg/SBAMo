package io.github.carmelolg.sbamo.core.service;

import io.github.carmelolg.sbamo.common.config.ApplicationProperties;
import io.github.carmelolg.sbamo.common.config.EnvironmentProperties;
import io.github.carmelolg.sbamo.core.domain.model.SystemOutputModel;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@Service
@Slf4j
public class SystemService {

    private final EnvironmentProperties environmentProperties;
    private final ApplicationProperties applicationProperties;

     public SystemOutputModel getSystemInfo() {
         log.debug("Get system information from environment and application properties");
         return new SystemOutputModel(environmentProperties.getName(), environmentProperties.getDescription(), applicationProperties.getPort());
     }
}
