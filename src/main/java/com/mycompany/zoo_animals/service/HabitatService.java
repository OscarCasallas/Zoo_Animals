package com.mycompany.zoo_animals.service;

import com.mycompany.zoo_animals.model.Habitat;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class HabitatService implements IHabitatService {
    private final List<Habitat> habitats = new ArrayList<>();


    @Override
    public void add(Habitat habitat) {
        habitats.add(habitat);
    }

    @Override
    public List<Habitat> getAll() {
        return new ArrayList<>(habitats);
    }

    @Override
    public Optional<Habitat> getByName(String name) {
        return habitats.stream().filter(h -> h.getName().equalsIgnoreCase(name)).findFirst();
    }

    @Override
    public void update(Habitat habitat) {
        getByName(habitat.getName()).ifPresent(h -> {
            h.setAreaM2(habitat.getAreaM2());
            h.setClimate(habitat.getClimate());
        });
    }

    @Override
    public void updateByOriginalName(String originalName, Habitat updated) {
        getByName(originalName).ifPresent(h -> {
            h.setName(updated.getName());
            h.setAreaM2(updated.getAreaM2());
            h.setClimate(updated.getClimate());
        });
    }

    @Override
    public void deleteByName(String name) {
        habitats.removeIf(h -> h.getName().equalsIgnoreCase(name));
    }

    public void clearAll() {
        habitats.clear();
    }
}
