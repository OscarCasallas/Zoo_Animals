/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.mycompany.zoo_animals.service;

import com.mycompany.zoo_animals.model.Aerial;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author santiagomanchola
 */
public interface IAerialService {

    void add(Aerial aerial);

    List<Aerial> getAll();

    Optional<Aerial> getById(String id);

    void deleteById(String id);

    void update(Aerial aerial);

    boolean existsById(String id);
}
