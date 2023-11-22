package com.example.skistation.service;

import com.example.skistation.Entity.Abonnement;
import com.example.skistation.Entity.Inscription;
import com.example.skistation.Entity.Skieur;
import com.example.skistation.Entity.TypeAbonnement;
import com.example.skistation.repository.AbonnementRep;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class IAbonnementServiceImp implements IAbonnementService {

    private final AbonnementRep abonnementRep;

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

    @Override
    public Set<Abonnement> getSubscriptionByType(TypeAbonnement typeAbonnement) {

        List<Abonnement> abonnements = abonnementRep.findByTypeAbonnementOrderByDateDebut(typeAbonnement);
        return new LinkedHashSet<>(abonnements);
    }


}
