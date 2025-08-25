package com.mycompany.zoo_animals.service;

import com.mycompany.zoo_animals.model.Aquatic;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AquaticService implements IAquaticService {
    
    private final List<Aquatic> aquaticAnimals = new ArrayList<>();

    @Override
    public void add(Aquatic aquatic) throws IllegalArgumentException {
        if (existsById(aquatic.getId())) {
            throw new IllegalArgumentException(
                "Ya existe un animal acuático con el ID: " + aquatic.getId() + 
                ". Por favor usa un identificador diferente."
            );
        }
        aquaticAnimals.add(aquatic);
    }

    @Override
    public List<Aquatic> getAll() {
        return new ArrayList<>(aquaticAnimals);
    }

    @Override
    public Optional<Aquatic> getById(String id) {
        return aquaticAnimals.stream()
                .filter(a -> a.getId().equalsIgnoreCase(id))
                .findFirst();
    }

    @Override
    public void deleteById(String id) {
        aquaticAnimals.removeIf(a -> a.getId().equalsIgnoreCase(id));
    }

    @Override
    public void update(Aquatic updatedAquatic) throws IllegalArgumentException {
        Optional<Aquatic> existingOpt = getById(updatedAquatic.getId());
        
        if (existingOpt.isEmpty()) {
            throw new IllegalArgumentException(
                "No se encontró un animal acuático con el ID: " + updatedAquatic.getId()
            );
        }
        
        Aquatic existing = existingOpt.get();
        existing.setName(updatedAquatic.getName());
        existing.setWeightKg(updatedAquatic.getWeightKg());
        existing.setBirthDate(updatedAquatic.getBirthDate());
    }

    @Override
    public boolean existsById(String id) {
        return aquaticAnimals.stream()
                .anyMatch(a -> a.getId().equalsIgnoreCase(id));
    }
}