package dconde.hexagonal.domain.api;

import dconde.hexagonal.domain.model.Pet;

public class PetServiceImp implements PetService{

    public Pet findPetById(Integer id) {
        return Pet.builder().id(1L).name("test").build();
    }
}
