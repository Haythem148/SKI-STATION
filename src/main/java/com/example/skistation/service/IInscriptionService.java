package com.example.skistation.service;

import com.example.skistation.Entity.Inscription;
import com.example.skistation.Entity.TypeAbonnement;
import jakarta.persistence.criteria.CriteriaBuilder;

import java.util.List;
import java.util.Set;

public interface IInscriptionService {
    Inscription addInscription(Inscription i);
    Inscription updateInscription(Inscription i);
    List<Inscription> getAll();
    Inscription getInscriptionById(long id);
    Boolean deleteInscriptionById(long id);
    public Inscription addRegistrationAssignToSkieur(Long idSk,Inscription inscription);
    public Inscription assignRegistrationToCourse(Long numInscription, Long numCourse);

}