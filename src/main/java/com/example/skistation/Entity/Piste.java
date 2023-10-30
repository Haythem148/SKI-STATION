package com.example.skistation.Entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
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

public class Piste {
 @Id
 @Setter(AccessLevel.NONE)
    @GeneratedValue(strategy = GenerationType.IDENTITY)

   private long numPiste;
   private String nomPiste;
   private int longeur;
   private int pente;
   @Enumerated(EnumType.STRING)
   Couleur couleur;
    @ManyToMany(mappedBy = "pistes")
    @JsonIgnore
    Set<Skieur> skieurs;


}
