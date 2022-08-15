package com.MaliTourist.Apigestionregions.controller;

import com.MaliTourist.Apigestionregions.modele.Pays;
import com.MaliTourist.Apigestionregions.service.PaysService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pays")
@AllArgsConstructor
@Api(value = "hello", description = "Sample hello world application")

public class PaysController {

    private final PaysService paysService;

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/create_pays")
    public Pays create(@RequestBody Pays pays) {
        return paysService.creer(pays);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/read_pays")
    public List<Pays> read(){
        return paysService.lire();
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/delete_pays/{id_pays}")
    public String delete(@PathVariable Integer id_pays) {
        return paysService.supprimer(id_pays);
    }
}
