package com.MaliTourist.Apigestionregions.controller;

import com.MaliTourist.Apigestionregions.modele.Message;
import com.MaliTourist.Apigestionregions.modele.Pays;
import com.MaliTourist.Apigestionregions.service.PaysService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pays")
@AllArgsConstructor
@Api(value = "PAYS", description = "ENSEMBLE DES FONCTIONNALITES CONCERNANT PAYS")

public class PaysController {

    private final PaysService paysService;

    @ApiOperation(value = "FONCTIONNALITE D'AJOUT D'UN PAYS")
    @PostMapping("/create_pays")
    public Object create(@RequestBody Pays pays) {

        try {

            return paysService.creer(pays);
        }catch (Exception e){
            return Message.Erreur("ce pays existe déjà", HttpStatus.OK,null);
        }

    }

    @ApiOperation(value = "FONCTIONNALITE D'AFFICHAGE D'UN PAYS")
    @GetMapping("/read_pays")
    public List<Pays> read(){
        return paysService.lire();
    }

    @ApiOperation(value = "FONCTIONNALITE DE SUPPRESSION D'UN PAYS")
    @DeleteMapping("/delete_pays/{id_pays}")
    public String delete(@PathVariable Integer id_pays) {


        return paysService.supprimer(id_pays);
    }
}
