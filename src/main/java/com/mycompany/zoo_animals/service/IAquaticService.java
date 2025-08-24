/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.zoo_animals.service;

import com.mycompany.zoo_animals.model.Aquatic;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author santiagomanchola
 */
public interface IAquaticService {
    void add(Aquatic aquatic);
    List<Aquatic> getAll();
    Optional<Aquatic> getById(String id);
    void deleteById(String id);
    void update(Aquatic aquatic);
}