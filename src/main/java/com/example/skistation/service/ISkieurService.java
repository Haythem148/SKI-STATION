package com.example.skistation.service;

import com.example.skistation.Entity.Abonnement;
import com.example.skistation.Entity.Skieur;
import com.example.skistation.Entity.TypeAbonnement;

import java.util.List;

public interface ISkieurService {

    Skieur addSkieur(Skieur s,Abonnement abonnement); // Changed 'Piste' to 'Skieur'

    Skieur updateSkieur(Skieur s); // Changed 'Piste' to 'Skieur'

    List<Skieur> getAll(); // Changed 'Piste' to 'Skieur'

    Skieur getId(long id); // Changed 'Piste' to 'Skieur'
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste);

    Boolean deleteById(long id); // Changed 'Piste' to 'Skieur'
    public Skieur addSkierAndAssignToCourse(Skieur skier, Long numCourse);
    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);


}