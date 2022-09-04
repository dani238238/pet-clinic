package net.tihnun.petclinic.services;

import net.tihnun.petclinic.model.Owner;
import net.tihnun.petclinic.model.Pet;

import java.util.Set;

public interface PetService {

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
