package com.mycompany.zoo_animals.model;

import java.time.LocalDate;

public class Aquatic extends Animal {
    private String preferredFood;
    private double swimSpeedKmh;
    
    public Aquatic(String id, String name, double weightKg, LocalDate birthDate, String finType, double swimSpeedKmh) {
        super(id, name, weightKg, birthDate);
        this.preferredFood = finType;
        this.swimSpeedKmh = swimSpeedKmh;
    }

    public String getPreferredFood() {
        return preferredFood;
    }

    public void setPreferredFood(String finType) {
        this.preferredFood = preferredFood;
    }

    public double getSwimSpeedKmh() {
        return swimSpeedKmh;
    }

    public void setSwimSpeedKmh(double swimSpeedKmh) {
        this.swimSpeedKmh = swimSpeedKmh;
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