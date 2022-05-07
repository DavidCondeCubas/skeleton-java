package dconde.hexagonal.application.rest;

import application.rest.api.PetApi;
import application.rest.model.PetDto;
import dconde.hexagonal.domain.api.PetService;
import dconde.hexagonal.domain.spi.ProductPersistencePort;
import lombok.var;
import org.springframework.http.ResponseEntity;

public class PetController implements PetApi {

    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    public ResponseEntity<PetDto> getPetById(Long petId) {
        var f= new PetDto();
        var g =  petService.findPetById(1);
        f.setId(g.getId());
        f.setName(g.getName());
        return ResponseEntity.ok(f);
    }
}
