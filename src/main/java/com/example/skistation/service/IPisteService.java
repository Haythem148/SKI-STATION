package com.example.skistation.service;

import com.example.skistation.Entity.Course;
import com.example.skistation.Entity.Piste;
import com.example.skistation.Entity.Skieur;

import java.util.List;

public interface IPisteService {
    Piste addPiste(Piste p);
    Piste updatePiste(Piste p);
    List<Piste> getAll();
    Piste getId(long id);
    Boolean deleteById(long id);

}
