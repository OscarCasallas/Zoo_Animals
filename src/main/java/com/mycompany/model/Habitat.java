/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.model;

public class Habitat {
    private String name;
    private double areaM2; // superficie en metros cuadrados
    private String climate;

    // Constructor
    public Habitat(String name, double areaM2, String climate) {
        this.name = name;
        this.areaM2 = areaM2;
        this.climate = climate;
    }

    // Getters y Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAreaM2() {
        return areaM2;
    }

    public void setAreaM2(double areaM2) {
        this.areaM2 = areaM2;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }

    @Override
    public String toString() {
        return "Habitat [name=" + name + ", areaM2=" + areaM2 + ", climate=" + climate + "]";
    }
}
