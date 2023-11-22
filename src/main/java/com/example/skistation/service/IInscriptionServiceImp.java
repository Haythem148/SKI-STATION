package com.example.skistation.service;

import com.example.skistation.Entity.Course;
import com.example.skistation.Entity.Inscription;
import com.example.skistation.Entity.Skieur;
import com.example.skistation.Entity.TypeAbonnement;
import com.example.skistation.repository.CourseRep;
import com.example.skistation.repository.InscriptionRep;
import com.example.skistation.repository.SkieurRep;
import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class IInscriptionServiceImp implements IInscriptionService {

    private final InscriptionRep inscriptionRep;
    private final SkieurRep skieurRep;
    private final CourseRep courseRep;

    @Override
    public Inscription addInscription(Inscription i) {
        return inscriptionRep.save(i);
    }

    @Override
    public Inscription updateInscription(Inscription i) {
        return inscriptionRep.save(i);
    }

    @Override
    public List<Inscription> getAll() {
        return (List<Inscription>) inscriptionRep.findAll();
    }

    @Override
    public Inscription getInscriptionById(long id) {
        return inscriptionRep.findById(id).orElseThrow(() -> new IllegalArgumentException("No Inscription found with this id: " + id));
    }

    @Override
    public Boolean deleteInscriptionById(long id) {
        inscriptionRep.deleteById(id);
        return !inscriptionRep.existsById(id);
    }
    public Inscription addRegistrationAssignToSkieur(Long idSk,Inscription inscription){
        Skieur skieur=skieurRep.findById(idSk).orElse(null);
        inscription.setSkieur(skieur);
        return inscriptionRep.save(inscription);
    }
    @Transactional

    @Override
    public Inscription assignRegistrationToCourse(Long numInscription, Long numCourse) {
        Inscription inscription=inscriptionRep.findById(numInscription).orElseThrow(() -> new IllegalArgumentException("No inscription found with this id: " + numInscription));;
        Course course=courseRep.findById(numCourse).orElseThrow(() -> new IllegalArgumentException("No course found with this id: " + numCourse));;
            inscription.setCourses(course);
        return inscription;
    }

}