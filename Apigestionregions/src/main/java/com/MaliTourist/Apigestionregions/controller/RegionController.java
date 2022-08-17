package com.MaliTourist.Apigestionregions.controller;

import com.MaliTourist.Apigestionregions.modele.Message;
import com.MaliTourist.Apigestionregions.modele.Pays;
import com.MaliTourist.Apigestionregions.modele.Region;
import com.MaliTourist.Apigestionregions.service.PaysService;
import com.MaliTourist.Apigestionregions.service.RegionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/region")
@AllArgsConstructor
@Api(value = "REGION", description = "ENSEMBLE DES FONCTIONNALITES CONCERNANT REGION")

public class RegionController {

    private final RegionService regionService;

    private  final PaysService paysService;

    @ApiOperation(value = "FONCTIONNALITE DE CREATION D'UNE REGION")
    @PostMapping("/create_rg")
    public Object create(@RequestBody Region region) {

        try {
            //recuperation du pays envoyer par l'utilisateur
            Pays p1=region.getId_pays();
            System.out.println(p1);
            //verification de l'existance du pays dans la base de donnée
            Pays p2=paysService.ChercherPays(p1.getNom());
            System.out.println(p2);
            if(p2==null){
                paysService.creer(p1);
            }

            return regionService.creer(region);

        }catch (Exception e){
            return Message.Erreur("cette region existe", HttpStatus.OK,null);
        }




    }

    @ApiOperation(value = "FONCTIONNALITE D'AFFICHAGE D'UNE REGION")
    @GetMapping("/read_rg")
    public List<Region> read(){

        return regionService.lire();

    }

    @ApiOperation(value = "FONCTIONNALITE D'AFFICHAGE DES REGIONS D'UN PAYS ")
    @GetMapping("/region/pays")
    public Object readrgp() {
        return regionService.lireFIND_ALLREGION_WITH_PAYS();
    }

    @ApiOperation(value = "FONCTIONNALITE D'AFFICHAGE DES REGIONS SANS CONSIDERATION D'UN PAYS")
    @GetMapping("/region/sanspays")
    public Object readrgps(){
        return regionService.afFIND_REGION_SANS_Pays();
    }
    @ApiOperation(value = "FONCTIONNALITE DE MODIFICATION D'UNE REGION")
    @PutMapping("/update_rg/{id}")
    public Region update(@PathVariable Integer id, @RequestBody Region region) {
        return regionService.modifier(id,region);
    }

    @ApiOperation(value = "FONCTIONNALITE DE SUPPRESSION D'UNE REGION")
    @DeleteMapping("/delete_rg/{id}")
    public String delete(@PathVariable Integer id) {

        Region reg = regionService.controlerregion(id);

        if (reg==null){
            return  "Cette region n'exite pas";
        } else {
            return regionService.supprimer(id);
        }

    }
}
