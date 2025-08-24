/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoo_animals.model;

import java.time.LocalDate;

public class Aquatic extends Animal {
    private Habitat habitat; 


    public Aquatic(String id, String name, double weightKg, LocalDate birthDate, Habitat habitat) {
        super(id, name, weightKg, birthDate);
        this.habitat = habitat;
    }

    // Getter and Setter
    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }


    @Override
    public double calculateCareIndex() {
        // Ejemplo: peso * 0.2 + tamaño del hábitat (m2 / 10)
        return (getWeightKg() * 0.2) + (habitat.getAreaM2() / 10);
    }
    
    
    @Override
    public String toString() {
        return "Aquatic [name=" + getName() + ", weight=" + getWeightKg() + "kg, habitat=" + habitat + "]";
    }
}
