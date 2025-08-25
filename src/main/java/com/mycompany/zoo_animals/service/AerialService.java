package com.mycompany.zoo_animals.service;

import com.mycompany.zoo_animals.model.Aerial;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AerialService implements IAerialService {
    
    private final List<Aerial> aerialAnimals = new ArrayList<>();

    @Override
    public void add(Aerial aerial) throws IllegalArgumentException {
        if (existsById(aerial.getId())) {
            throw new IllegalArgumentException(
                "Ya existe un animal aéreo con el ID: " + aerial.getId() + 
                ". Por favor usa un identificador diferente."
            );
        }
        aerialAnimals.add(aerial);
    }

    @Override
    public List<Aerial> getAll() {
        return new ArrayList<>(aerialAnimals);
    }

    @Override
    public Optional<Aerial> getById(String id) {
        return aerialAnimals.stream()
                .filter(a -> a.getId().equalsIgnoreCase(id))
                .findFirst();
    }

    @Override
    public void deleteById(String id) {
        aerialAnimals.removeIf(a -> a.getId().equalsIgnoreCase(id));
    }

    @Override
    public void update(Aerial updatedAerial) throws IllegalArgumentException {
        Optional<Aerial> existingOpt = getById(updatedAerial.getId());
        
        if (existingOpt.isEmpty()) {
            throw new IllegalArgumentException(
                "No se encontró un animal aéreo con el ID: " + updatedAerial.getId()
            );
        }
        
        Aerial existing = existingOpt.get();
        existing.setName(updatedAerial.getName());
        existing.setWeightKg(updatedAerial.getWeightKg());
        existing.setBirthDate(updatedAerial.getBirthDate());
        existing.setWingspan(updatedAerial.getWingspan());
        existing.setHabitat(updatedAerial.getHabitat());
    }

    @Override
    public boolean existsById(String id) {
        return aerialAnimals.stream()
                .anyMatch(a -> a.getId().equalsIgnoreCase(id));
    }
}