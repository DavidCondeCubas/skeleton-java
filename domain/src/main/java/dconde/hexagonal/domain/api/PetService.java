package dconde.hexagonal.domain.api;

import dconde.hexagonal.domain.model.Pet;

public interface PetService {

    public Pet findPetById(Integer id);

}
