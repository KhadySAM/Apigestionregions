package com.MaliTourist.Apigestionregions.controller;

import com.MaliTourist.Apigestionregions.modele.Region;
import com.MaliTourist.Apigestionregions.service.RegionService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.AllArgsConstructor;

import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/region")
@AllArgsConstructor
@Api(value = "hello", description = "Sample hello world application")

public class RegionController {

    private final RegionService regionService;

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PostMapping("/create_rg")
    public Region create(@RequestBody Region region) {
        return regionService.creer(region);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @GetMapping("/read_rg")
    public List<Region> read(){

        return regionService.lire();
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @PutMapping("/update_rg/{id}")
    public Region update(@PathVariable Integer id, @RequestBody Region region) {
        return regionService.modifier(id,region);
    }

    @ApiOperation(value = "Just to test the sample test api of My App Service")
    @DeleteMapping("/delete_rg/{id}")
    public String delete(@PathVariable Integer id) {
        return regionService.supprimer(id);
    }
}
