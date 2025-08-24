/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoo_animals.model;

import java.time.LocalDate;

public class Aerial extends Animal implements IFlyable {
    private double wingspan; // en metros
    private Habitat habitat;

    // Constructor
    public Aerial(String id, String name, double weightKg, LocalDate birthDate, double wingspan, Habitat habitat) {
        super(id, name, weightKg, birthDate);
        this.wingspan = wingspan;
        this.habitat = habitat;
    }

    // Getters y Setters
    public double getWingspan() {
        return wingspan;
    }

    public void setWingspan(double wingspan) {
        this.wingspan = wingspan;
    }

    public Habitat getHabitat() {
        return habitat;
    }

    public void setHabitat(Habitat habitat) {
        this.habitat = habitat;
    }

    // Implementación de IFlyable
    @Override
    public void fly() {
        System.out.println(getName() + " is flying in " + habitat.getName());
    }

    @Override
    public double getMaxAltitude() {
        return wingspan * 100; // Ejemplo: un ala de 2m → 200m de altura máxima
    }

    // Implementación del método abstracto de Animal
    @Override
    public double calculateCareIndex() {
        // Ejemplo de cálculo: peso * 0.3 + wingspan * 5
        return (getWeightKg() * 0.3) + (wingspan * 5);
    }

    @Override
    public String toString() {
        return "Aerial [name=" + getName() + ", wingspan=" + wingspan + "m, habitat=" + habitat + "]";
    }
}
