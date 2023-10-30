package com.example.skistation.Controllers;

import com.example.skistation.Entity.Moniteur;
import com.example.skistation.service.IMoniteurService;
import com.example.skistation.service.ISkieurService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("moniteur")
@RequiredArgsConstructor

public class MoniteurController {
    private  final IMoniteurService iMoniteurService;
    @PostMapping
    Moniteur addMoniteur(@RequestBody Moniteur m){
        return iMoniteurService.addMoniteur(m);
    }
    @PutMapping
    Moniteur updateMoniteur(@RequestBody Moniteur m){
        return iMoniteurService.updateMoniteur(m);
    }
    @GetMapping
    List<Moniteur> getAll(){
        return iMoniteurService.getAll();
    }
    @GetMapping("{id}")
    Moniteur getId(@PathVariable long id){
        return iMoniteurService.getId(id);
    }
    @DeleteMapping("{id}")
    Boolean deleteById(@PathVariable long id){
        return iMoniteurService.deleteById(id);

    }
    @PostMapping("{numCourse}")
    public Moniteur addInstructorAndAssignToCourse(@RequestBody Moniteur moniteur, @PathVariable Long numCourse){
        return iMoniteurService.addInstructorAndAssignToCourse(moniteur, numCourse);
    }

}
