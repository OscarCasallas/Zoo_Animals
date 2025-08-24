/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoo_animals.service;

import com.mycompany.zoo_animals.model.Aquatic;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author santiagomanchola
 */
public class AquaticService implements IAquaticService {
    private final List<Aquatic> aquaticAnimals = new ArrayList<>();

    @Override
    public void add(Aquatic aquatic) {
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
    public void update(Aquatic updatedAquatic) {
        getById(updatedAquatic.getId()).ifPresent(existing -> {
            existing.setName(updatedAquatic.getName());
            existing.setWeightKg(updatedAquatic.getWeightKg());
            existing.setBirthDate(updatedAquatic.getBirthDate());
            existing.setHabitat(updatedAquatic.getHabitat());
        });
    }
}