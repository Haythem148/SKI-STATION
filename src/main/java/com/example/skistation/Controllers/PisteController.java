package com.example.skistation.Controllers;

import com.example.skistation.Entity.Piste;
import com.example.skistation.Entity.Skieur;
import com.example.skistation.service.IPisteService;
import com.example.skistation.service.ISkieurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("piste")
@RequiredArgsConstructor
public class PisteController {
    private final IPisteService iPisteService;

    @PostMapping
    Piste addPiste(@RequestBody Piste p) {
        return iPisteService.addPiste(p);
    }


    @PutMapping
    Piste updatePiste(@RequestBody Piste p) {
        return iPisteService.updatePiste(p);
    }

    @GetMapping
    List<Piste> getAll() {
        return iPisteService.getAll();
    }

    @GetMapping("{id}")
    Piste getPisteById(@PathVariable long id) {
        return iPisteService.getId(id);
    }

    @DeleteMapping("{id}")
    Boolean deletePisteById(@PathVariable long id) {
        return iPisteService.deleteById(id);
    }

}