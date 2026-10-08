package tn.esprit.nourmbarki4cce10.service.impls;

import lombok.AllArgsConstructor;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import tn.esprit.nourmbarki4cce10.domain.Vehicule;
import tn.esprit.nourmbarki4cce10.repository.IVehiculeRepository;
import tn.esprit.nourmbarki4cce10.service.IVehiculeService;

import java.util.List;
@RequiredArgsConstructor
@Service

public class VehiculeServicesImlp implements IVehiculeService {

    private final IVehiculeRepository vehiculeRepository;


    @Override
    public Vehicule create(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }

    @Override
    public Vehicule findById(long id) {
        return vehiculeRepository.findById(id).orElseThrow();
    }

    @Override
    public List<Vehicule> findAll() {
        return List.of();
    }

    @Override
    public void deleteById(long id) {

    }

    @Override
    public Vehicule update(Vehicule vehicule) {
        return vehiculeRepository.save(vehicule);
    }
}
