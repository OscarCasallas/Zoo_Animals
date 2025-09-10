package com.mycompany.zoo_animals.model;

import java.time.LocalDate;

public class Aquatic extends Animal implements ISwimmable {

    private String preferredFood;
    private double swimSpeedKmh;

    public Aquatic(String id, String name, double weightKg, LocalDate birthDate, String preferredFood, double swimSpeedKmh) {
        super(id, name, weightKg, birthDate);
        this.preferredFood = preferredFood;
        this.swimSpeedKmh = swimSpeedKmh;
    }

    public String getPreferredFood() {
        return preferredFood;
    }

    public void setPreferredFood(String preferredFood) {
        this.preferredFood = preferredFood;
    }

    public double getSwimSpeedKmh() {
        return swimSpeedKmh;
    }

    public void setSwimSpeedKmh(double swimSpeedKmh) {
        this.swimSpeedKmh = swimSpeedKmh;
    }

    // Implementación de ISwimmable
    @Override
    public void swim() {
        System.out.println(getName() + " is swimming at " + swimSpeedKmh + " km/h.");
    }

    @Override
    public double getMaxDepth() {
        // Ejemplo: cuanto mayor velocidad, mayor capacidad de buceo
        return swimSpeedKmh * 10;
    }

    @Override
    public double calculateCareIndex() {
        return (getWeightKg() * 0.2) + (swimSpeedKmh * 0.1);
    }

    @Override
    public String toString() {
        return "Aquatic [name=" + getName() + ", weight=" + getWeightKg() + "kg, preferredFood=" + preferredFood + ", swimSpeed=" + swimSpeedKmh + "km/h]";
    }
}
