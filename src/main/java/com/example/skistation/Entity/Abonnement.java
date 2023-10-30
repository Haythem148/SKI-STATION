package com.example.skistation.Entity;

import java.time.LocalDate;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;
import org.springframework.boot.autoconfigure.web.WebProperties;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE) //rend les attributs private


public class Abonnement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long numAbon;
    LocalDate dateDebut;
    LocalDate dateFin;
    Float prixAbon;
    @Enumerated(EnumType.STRING)
    TypeAbonnement typeAbonnement;


}
