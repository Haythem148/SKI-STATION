package com.example.skistation.Controllers;

import com.example.skistation.Entity.Inscription;
import com.example.skistation.service.IInscriptionService;
import com.example.skistation.service.ISkieurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("inscription")
public class InscriptionController {
    private final IInscriptionService iInscriptionService;


    @PostMapping
    public Inscription addInscription(@RequestBody Inscription i) {
        return iInscriptionService.addInscription(i);
    }

    @PutMapping
    public Inscription updateInscription(@RequestBody Inscription i) {
        return iInscriptionService.updateInscription(i);
    }

    @GetMapping
    public List<Inscription> getAllInscriptions() {
        return iInscriptionService.getAll();
    }

    @GetMapping("{id}")
    public Inscription getInscriptionById(@PathVariable long id) {
        return iInscriptionService.getInscriptionById(id);
    }

    @DeleteMapping("{id}")
    public Boolean deleteInscriptionById(@PathVariable long id) {
        return iInscriptionService.deleteInscriptionById(id);
    }

    @PostMapping("{idSk}")
    public Inscription addRegistrationAssignToSkieur(@PathVariable Long idSk,Inscription inscription){
        return iInscriptionService.addRegistrationAssignToSkieur(idSk,inscription);

    }
    @PostMapping("{numInscription}/{numCourse}")
    public Inscription assignRegistrationToCourse(@PathVariable Long numInscription, @PathVariable Long numCourse){
        return iInscriptionService.assignRegistrationToCourse(numInscription,numCourse);
    }
}