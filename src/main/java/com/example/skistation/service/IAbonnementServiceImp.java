package com.example.skistation.service;

import com.example.skistation.Entity.Abonnement;
import com.example.skistation.repository.AbonnementRep;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IAbonnementServiceImp implements IAbonnementService {
    @Autowired
    private AbonnementRep abonnementRep;

    @Override
    public Abonnement addAbonnement(Abonnement abonnement) {
        return abonnementRep.save(abonnement);
    }

    @Override
    public Abonnement updateAbonnement(Abonnement abonnement) {
        return abonnementRep.save(abonnement);
    }

    @Override
    public List<Abonnement> getAll() {
        return (List<Abonnement>) abonnementRep.findAll();
    }

    @Override
    public Abonnement getAbonnementById(long id) {
        return abonnementRep.findById(id).orElseThrow(() -> new IllegalArgumentException("No Abonnement found with this id: " + id));
    }

    @Override
    public Boolean deleteAbonnementById(long id) {
        abonnementRep.deleteById(id);
        return !abonnementRep.existsById(id);
    }
}
