package com.example.skistation.Entity;

import com.example.skistation.Entity.Skieur;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //rend les attributs private

public class Inscription {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numInscription;
    int numSemaine;
    @ManyToOne
    //@JoinColumn(name="Skieur_id")

    private Skieur skieur;
    @ManyToOne
    private Course courses;


}
