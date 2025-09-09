package com.mycompany.zoo_animals.service;

import com.mycompany.zoo_animals.model.Aerial;
import com.mycompany.zoo_animals.view.IActualizable;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class AerialService implements IAerialService {
    
    // Singleton Pattern Implementation
    private static AerialService instance;
    private final List<Aerial> aerialAnimals = new ArrayList<>();
    
    private final List<IActualizable> observers = new ArrayList<>();

    
    // Constructor privado para evitar instanciación directa
    private AerialService() {
        // Constructor privado
    }
    
    // Método para obtener la única instancia (Thread-safe)
    public static synchronized AerialService getInstance() {
        if (instance == null) {
            instance = new AerialService();
        }
        return instance;
    }

    
    // 👀 Métodos para manejar observadores
    public void addObserver(IActualizable observer) {
        observers.add(observer);
    }

    public void removeObserver(IActualizable observer) {
        observers.remove(observer);
    }

    private void notificar() {
        observers.forEach(IActualizable::actualizar);
    }
    
    
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