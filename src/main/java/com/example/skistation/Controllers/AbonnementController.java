package com.example.skistation.Controllers;

import com.example.skistation.Entity.Abonnement;
import com.example.skistation.service.IAbonnementService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("abonnement")
@RequiredArgsConstructor
public class AbonnementController {
    private final IAbonnementService iAbonnementService;

    @PostMapping
    Abonnement addAbonnement(@RequestBody Abonnement abonnement) {
        return iAbonnementService.addAbonnement(abonnement);
    }

    @PutMapping
    Abonnement updateAbonnement(@RequestBody Abonnement abonnement) {
        return iAbonnementService.updateAbonnement(abonnement);
    }

    @GetMapping
    List<Abonnement> getAll() {
        return iAbonnementService.getAll();
    }

    @GetMapping("{id}")
    Abonnement getAbonnementById(@PathVariable long id) {
        return iAbonnementService.getAbonnementById(id);
    }

    @DeleteMapping("{id}")
    Boolean deleteAbonnementById(@PathVariable long id) {
        return iAbonnementService.deleteAbonnementById(id);
    }
}
