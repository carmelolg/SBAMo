package io.github.carmelolg.sbamo.adapters.resource.assembler;

import io.github.carmelolg.sbamo.core.domain.model.SystemOutputModel;
import io.github.carmelolg.sbamo.adapters.resource.SystemResource;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class SystemResourceAssembler implements IAssembler<SystemResource, SystemOutputModel> {

    /**
     * Converts a Data Transfer Object (DTO) to a resource object.
     *
     * @param dto the DTO to convert
     * @return the converted resource object
     */
    @Override
    public SystemResource fromModel(SystemOutputModel dto) {
        log.debug("Converting SystemOutputModel to SystemResource: {}", dto);
        return new SystemResource(dto.environment(), dto.description(), dto.port());
    }
}
