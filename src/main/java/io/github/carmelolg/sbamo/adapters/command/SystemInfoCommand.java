package io.github.carmelolg.sbamo.adapters.command;

import io.github.carmelolg.sbamo.core.domain.model.SystemOutputModel;
import io.github.carmelolg.sbamo.core.facade.CoreServiceFacade;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@AllArgsConstructor
@Component
@Slf4j
public class SystemInfoCommand implements ICommand<SystemOutputModel> {

    private final CoreServiceFacade componentServiceFacade;

    @Override
    public SystemOutputModel execute() {
        log.debug("Executing command to retrieve system information");
        return componentServiceFacade.getSystemInfo();
    }
}
