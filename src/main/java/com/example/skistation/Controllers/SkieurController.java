package com.example.skistation.Controllers;

import com.example.skistation.Entity.Abonnement;
import com.example.skistation.Entity.Skieur;
import com.example.skistation.service.ISkieurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("skieur")
@RequiredArgsConstructor
public class SkieurController {
    private  final  ISkieurService iSkieurService;
    @GetMapping
    public List<Skieur>  getAll(){return  iSkieurService.getAll();};
    @GetMapping("{id}")
    public Skieur getSkieurById(@PathVariable long id) {
        return iSkieurService.getId(id);
    }
    @PostMapping
    public Skieur addSkieur(@RequestBody Skieur skieur,Abonnement abonnement) {
        // Call the SkieurService's method to add the Skieur and its associated Abonnement
        return iSkieurService.addSkieur(skieur,abonnement);
    }



    @PutMapping
    public Skieur updateSkieur(@RequestBody Skieur s) {
        return iSkieurService.updateSkieur(s);
    }
    @PutMapping ("{numSkieur}/{numPiste}")
    public Skieur assignSkierToPiste(@PathVariable Long numSkieur,@PathVariable Long numPiste){
        return iSkieurService.assignSkierToPiste(numSkieur,numPiste);
    }
    @PutMapping("{numCourse}")
    public Skieur addSkierAndAssignToCourse(@RequestBody Skieur skier, @PathVariable Long numCourse){
        return  iSkieurService.addSkierAndAssignToCourse(skier,numCourse);
    }
}
