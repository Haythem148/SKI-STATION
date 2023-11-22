package com.example.skistation.repository;

import com.example.skistation.Entity.Abonnement;
import com.example.skistation.Entity.TypeAbonnement;
import org.springframework.data.repository.CrudRepository;

import java.time.LocalDate;
import java.util.List;

public interface AbonnementRep extends CrudRepository<Abonnement,Long> {
    List<Abonnement> findByTypeAbonnementOrderByDateDebut(TypeAbonnement typeAbonnement);
    List<Abonnement>findAbonnementByDateDebutBeforeAndDateFinAfter(LocalDate dateDebut, LocalDate dateFin);
}
