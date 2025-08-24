package com.mycompany.zoo_animals.model;

import java.time.LocalDate;

public class Aquatic extends Animal {
    private String finType;
    private double swimSpeedKmh;
    
    public Aquatic(String id, String name, double weightKg, LocalDate birthDate, String finType, double swimSpeedKmh) {
        super(id, name, weightKg, birthDate);
        this.finType = finType;
        this.swimSpeedKmh = swimSpeedKmh;
    }

    public String getFinType() {
        return finType;
    }

    public void setFinType(String finType) {
        this.finType = finType;
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
        return "Aquatic [name=" + getName() + ", weight=" + getWeightKg() + "kg, finType=" + finType + ", swimSpeed=" + swimSpeedKmh + "km/h]";
    }
}