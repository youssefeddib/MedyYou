package com.medyyou.backend.controller;

import com.medyyou.backend.entity.Medicament;
import com.medyyou.backend.service.MedicamentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/medicaments")
public class MedicamentController {

    @Autowired
    private MedicamentService medicamentService;

    @PostMapping
    public Medicament ajouter(@RequestBody Medicament medicament) {
        return medicamentService.ajouterMedicament(medicament);
    }

    @PutMapping("/{id}")
    public Medicament modifier(@PathVariable Long id, @RequestBody Medicament medicament) {
        return medicamentService.modifierMedicament(id, medicament);
    }

    @DeleteMapping("/{id}")
    public void supprimer(@PathVariable Long id) {
        medicamentService.supprimerMedicament(id);
    }

    @GetMapping("/pharmacie/{idPharmacie}")
    public List<Medicament> listerParPharmacie(@PathVariable Long idPharmacie) {
        return medicamentService.getMedicamentsParPharmacie(idPharmacie);
    }
}
