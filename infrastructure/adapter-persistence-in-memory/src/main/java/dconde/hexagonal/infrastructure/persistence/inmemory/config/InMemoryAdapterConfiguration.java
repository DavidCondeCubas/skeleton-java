package dconde.hexagonal.infrastructure.persistence.inmemory.config;

import dconde.hexagonal.domain.spi.ProductPersistencePort;
import dconde.hexagonal.infrastructure.persistence.inmemory.adapter.ProductInMemoryAdapter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InMemoryAdapterConfiguration {

    @Bean
    public ProductPersistencePort getProductPersistencePort() {
        return new ProductInMemoryAdapter();
    }
}
