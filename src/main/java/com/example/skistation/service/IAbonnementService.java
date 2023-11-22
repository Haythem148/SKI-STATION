package com.example.skistation.service;

import com.example.skistation.Entity.Abonnement;
import com.example.skistation.Entity.Inscription;
import com.example.skistation.Entity.TypeAbonnement;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;


public interface IAbonnementService {
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement(Abonnement abonnement);
    List<Abonnement> getAll();
    Abonnement getAbonnementById(long id);
    Boolean deleteAbonnementById(long id);
    public Set<Abonnement> getSubscriptionByType(TypeAbonnement typeAbonnement);
}
