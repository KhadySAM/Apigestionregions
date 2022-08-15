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
@Api(value = "hello", description = "Sample hello world application")


public class PopulationController {

    private final PopulationService populationService;

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/create_population")
    public Population create(@RequestBody Population population) {

        return populationService.creer(population);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/read_population")
    public List<Population> read(){

        return populationService.lire();
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/delete_population/{id_population}")
    public String delete(@PathVariable Integer id_population) {
        return populationService.supprimer(id_population);
    }

}
