package net.tihnun.petclinic.services.map;

import net.tihnun.petclinic.model.Owner;
import net.tihnun.petclinic.services.CrudService;

import java.util.Set;

public class OwnerMapService extends AbstructMapService<Owner,Long> implements CrudService<Owner,Long> {


    @Override
    public Set<Owner> findAll() {
        return super.findALl();
    }

    @Override
    public void deleteById(Long id) {
        super.deleteById(id);
    }

    @Override
    public void delete(Owner object) {
        super.delete(object);
    }

    @Override
    public Owner findByID(Long id) {
        return super.findById(id);
    }

    @Override
    public Owner save(Owner object) {
        return super.save(object.getId(),object);
    }
}
