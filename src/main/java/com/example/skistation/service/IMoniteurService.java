package com.example.skistation.service;


import com.example.skistation.Entity.Moniteur;

import java.util.List;

public interface IMoniteurService {
    Moniteur addMoniteur(Moniteur m);
    Moniteur updateMoniteur(Moniteur m);
    List<Moniteur> getAll();
    Moniteur getId(long id);
    Boolean deleteById(long id);
    public Moniteur addInstructorAndAssignToCourse(Moniteur moniteur, Long numCourse);
}
