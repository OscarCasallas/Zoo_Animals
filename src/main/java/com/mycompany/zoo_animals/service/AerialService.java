/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoo_animals.service;

import com.mycompany.zoo_animals.model.Aerial;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author santiagomanchola
 */
public class AerialService implements IAerialService {
    private final List<Aerial> aerialAnimals = new ArrayList<>();

    @Override
    public void add(Aerial aerial) {
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
    public void update(Aerial updatedAerial) {
        getById(updatedAerial.getId()).ifPresent(existing -> {
            existing.setName(updatedAerial.getName());
            existing.setWeightKg(updatedAerial.getWeightKg());
            existing.setBirthDate(updatedAerial.getBirthDate());
            existing.setWingspan(updatedAerial.getWingspan());
            existing.setHabitat(updatedAerial.getHabitat());
        });
    }
}