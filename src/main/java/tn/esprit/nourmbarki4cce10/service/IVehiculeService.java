package tn.esprit.nourmbarki4cce10.service;

import tn.esprit.nourmbarki4cce10.domain.Vehicule;

import java.util.List;

public interface IVehiculeService {
    Vehicule create(Vehicule vehicule);
    Vehicule findById(long id);
    List<Vehicule> findAll();
    void deleteById(long id);
    Vehicule update(Vehicule vehicule);
}
