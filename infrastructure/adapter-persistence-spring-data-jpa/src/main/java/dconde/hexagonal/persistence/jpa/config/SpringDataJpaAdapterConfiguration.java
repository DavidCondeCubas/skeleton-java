package dconde.hexagonal.persistence.jpa.config;

import dconde.hexagonal.domain.spi.ProductPersistencePort;
import dconde.hexagonal.persistence.jpa.adapter.ProductSpringJpaAdapter;
import dconde.hexagonal.persistence.jpa.repository.ProductRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringDataJpaAdapterConfiguration {

    @Bean
    public ProductPersistencePort getProductPersistencPort(ProductRepository productRepository) {
        return new ProductSpringJpaAdapter(productRepository);
    }
}
