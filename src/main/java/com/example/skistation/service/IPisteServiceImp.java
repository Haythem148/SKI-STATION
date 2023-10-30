package com.example.skistation.service;

import com.example.skistation.Entity.Moniteur;
import com.example.skistation.Entity.Piste;
import com.example.skistation.Entity.Skieur;
import com.example.skistation.repository.PisteRep;
import com.example.skistation.repository.SkieurRep;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class IPisteServiceImp implements IPisteService{
    private final PisteRep pisteRep;
    private final SkieurRep skieurRep;
    @Override
    public Piste addPiste(Piste p) {
        return pisteRep.save(p);
    }

    @Override
    public Piste updatePiste(Piste p) {
        return pisteRep.save(p);
    }

    @Override
    public List<Piste> getAll() {
        return (List<Piste>) pisteRep.findAll();
    }

    @Override
    public Piste getId(long id) {
        return pisteRep.findById(id).orElseThrow(() -> new IllegalArgumentException("No Course found with this id"+id));
    }

    @Override
    public Boolean deleteById(long id) {
        pisteRep.deleteById(id);
        return !pisteRep.existsById(id);
    }

}
