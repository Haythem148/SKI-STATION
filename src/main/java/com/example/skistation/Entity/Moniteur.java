package com.example.skistation.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;
import java.util.Set;

@Entity
@Getter
@Setter

public class Moniteur {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numMoniteur;
    String nomM;
    String prenomM;
    LocalDate dateRecru;
    @OneToMany
    Set<Course>courses;
}
