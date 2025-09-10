/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.zoo_animals.model;

import java.time.LocalDate;

public abstract class Animal {

    private String id;
    private String name;
    private double weightKg;
    private LocalDate birthDate;

    // Constructor
    public Animal(String id, String name, double weightKg, LocalDate birthDate) {
        this.id = id;
        this.name = name;
        this.weightKg = weightKg;
        this.birthDate = birthDate;
    }

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getWeightKg() {
        return weightKg;
    }

    public void setWeightKg(double weightKg) {
        this.weightKg = weightKg;
    }

    public LocalDate getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(LocalDate birthDate) {
        this.birthDate = birthDate;
    }

    // Abstract method
    public abstract double calculateCareIndex();

    @Override
    public String toString() {
        return "Animal [id=" + id + ", name=" + name + ", weightKg=" + weightKg + ", birthDate=" + birthDate + "]";
    }
}
