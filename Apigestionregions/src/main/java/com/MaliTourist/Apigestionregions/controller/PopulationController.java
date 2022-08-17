package com.MaliTourist.Apigestionregions.controller;


import com.MaliTourist.Apigestionregions.modele.Population;
import com.MaliTourist.Apigestionregions.service.PopulationService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/population")
@AllArgsConstructor
@Api(value = "POPULATION", description = "ENSEMBLE DES FONCTIONNALITES CONCERNANT POPULATION")


public class PopulationController {

    private final PopulationService populationService;

    @ApiOperation(value = "FONCTIONNALITE D'AJOUT D'UNE POPULATION")
    @PostMapping("/create_population")
    public Population create(@RequestBody Population population) {

        return populationService.creer(population);
    }

    @ApiOperation(value = "FONCTIONNALITE D'AFFICHAGE D'UNE POPULATION")
    @GetMapping("/read_population")
    public List<Population> read() {

        return populationService.lire();
    }

    @ApiOperation(value = "FONCTIONNALITE DE SUPPRESSION D'UNE POPULATION")
    @DeleteMapping("/delete_population/{id_population}")
    public String delete(@PathVariable Integer id_population) {

        return populationService.supprimer(id_population);
    }

    @ApiOperation(value = "FONCTIONNALITE D'AFFICHAGE DES POPULATIONS D'UNE ANNEE DONNEE")
    @GetMapping("/population/annee")
    public Object readrgps() {
        return populationService.popFINDALLREGIONWITH_NONMBRE_HABITANT_AND_ANNEE();

    }
}
