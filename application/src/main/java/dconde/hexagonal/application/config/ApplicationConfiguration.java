package dconde.hexagonal.application.config;

import dconde.hexagonal.domain.api.PetService;
import dconde.hexagonal.domain.api.PetServiceImp;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
    public PetService getOrderService() {
        return new PetServiceImp();
    }


}
