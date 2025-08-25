package com.mycompany.zoo_animals.service;

import com.mycompany.zoo_animals.model.Habitat;
import java.util.List;
import java.util.Optional;

public interface IHabitatService {
    void add(Habitat habitat);
    List<Habitat> getAll();
    Optional<Habitat> getByName(String name);
    void update(Habitat habitat);
    void updateByOriginalName(String originalName, Habitat updated);
    void deleteByName(String name);
}
