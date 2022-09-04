package net.tihnun.petclinic.services;

import net.tihnun.petclinic.model.Pet;
import net.tihnun.petclinic.model.Vet;

import java.util.Set;

public interface VetService {

    Vet findById(Long id);

    Vet save(Vet vet);

    Set<Vet> findAll();
}
