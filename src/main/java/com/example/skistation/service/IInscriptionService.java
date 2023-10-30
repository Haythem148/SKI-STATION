package com.example.skistation.service;

import com.example.skistation.Entity.Inscription;

import java.util.List;

public interface IInscriptionService {
    Inscription addInscription(Inscription i);
    Inscription updateInscription(Inscription i);
    List<Inscription> getAll();
    Inscription getInscriptionById(long id);
    Boolean deleteInscriptionById(long id);
    public Inscription addRegistrationAssignToSkieur(Long idSk,Inscription inscription);
    public Inscription assignRegistrationToCourse(Long numInscription, Long numCourse);
}