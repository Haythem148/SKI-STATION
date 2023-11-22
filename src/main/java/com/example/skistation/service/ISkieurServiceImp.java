package com.example.skistation.service;

import com.example.skistation.Entity.*;
import com.example.skistation.repository.*;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class ISkieurServiceImp implements ISkieurService {

    private final PisteRep pisteRep;
    private final SkieurRep skieurRep;
    private final CourseRep courseRep;
    private final AbonnementRep abonnementRep;
    private final InscriptionRep inscriptionRep;


    public List<Skieur> getAllSkieurs() {
        return (List<Skieur>) skieurRep.findAll();
    }

    public Skieur getSkieurById(long id) {
        return skieurRep.findById(id).orElse(null);
    }

    public Skieur addSkieur(Skieur skieur, Abonnement abonnement) {

        abonnementRep.save(abonnement);
        skieur.setAbonnement(abonnement);

        return skieurRep.save(skieur);


    }


    public Skieur updateSkieur(Skieur skieur) {
        return skieurRep.save(skieur);
    }

    public List<Skieur> getAll() {
        return (List<Skieur>) skieurRep.findAll();
    }

    public Skieur getId(long id) {
        return skieurRep.findById(id).orElseThrow(() -> new IllegalArgumentException("No skieur found with this id: " + id));
    }

    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste) {
        Skieur skieur = skieurRep.findById(numSkieur).orElseThrow(() -> new IllegalArgumentException("No skieur found with this id: " + numSkieur));;
        Piste piste = pisteRep.findById(numPiste).orElseThrow(() -> new IllegalArgumentException("No piste found with this id: " + numPiste));;
        if (skieur != null && piste != null) {
            Set<Piste> pisteSet = skieur.getPistes();
            pisteSet.add(piste);
            skieur.setPistes(pisteSet);
            return skieurRep.save(skieur);
        }
        return null;
    }

    @Override
    public Boolean deleteById(long id) {
        return null;
    }

    @Override
    public Skieur addSkierAndAssignToCourse(Skieur skier, Long numCourse) {
        //1er étape recupération des objets
        //2éme étape traitements
        //3éme validation des objets null
        //save
        Course course = courseRep.findById(numCourse).orElseThrow(() -> new IllegalArgumentException("No course found with this id: " + numCourse));
        Inscription inscription = skier.getInscriptions().stream().findFirst().get();
        inscription.setSkieur(skier);
        inscription.setCourses(course);
        skieurRep.save(skier);
        inscriptionRep.save(inscription);
        return skier;
    }
    public List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement) {
        return (List<Skieur>) skieurRep.findByAbonnementTypeAbonnement(typeAbonnement);
}

}
