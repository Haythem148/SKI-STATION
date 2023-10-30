package com.example.skistation.repository;

import com.example.skistation.Entity.Inscription;
import org.springframework.data.repository.CrudRepository;

public interface InscriptionRep extends CrudRepository<Inscription, Long> {
}
