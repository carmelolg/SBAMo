package io.github.carmelolg.sbamo.adapters.resource.assembler;

import io.github.carmelolg.sbamo.core.domain.model.SystemOutputModel;
import io.github.carmelolg.sbamo.adapters.resource.SystemResource;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

class SystemResourceAssemblerTest {

    private final SystemResourceAssembler assembler = new SystemResourceAssembler();

    @Nested
    @DisplayName("fromDto method")
    class FromDto {

        @Test
        @DisplayName("Converts valid SystemDTO to SystemResource")
        void convertsValidSystemDTOToSystemResource() {
            SystemOutputModel dto = new SystemOutputModel("prod", "Production environment", 8080);

            SystemResource resource = assembler.fromModel(dto);

            assertEquals("prod", resource.environment());
            assertEquals("Production environment", resource.description());
            assertEquals(8080, resource.port());
        }

        @Test
        @DisplayName("Throws exception when SystemDTO is null")
        void throwsExceptionWhenSystemDTOIsNull() {
            assertThrows(NullPointerException.class, () -> assembler.fromModel(null));
        }
    }

}