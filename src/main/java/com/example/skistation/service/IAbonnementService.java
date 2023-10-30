package com.example.skistation.service;

import com.example.skistation.Entity.Abonnement;
import org.springframework.stereotype.Service;

import java.util.List;


public interface IAbonnementService {
    Abonnement addAbonnement(Abonnement abonnement);
    Abonnement updateAbonnement(Abonnement abonnement);
    List<Abonnement> getAll();
    Abonnement getAbonnementById(long id);
    Boolean deleteAbonnementById(long id);
}
