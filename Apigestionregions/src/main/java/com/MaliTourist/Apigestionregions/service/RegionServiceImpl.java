package com.MaliTourist.Apigestionregions.service;

import com.MaliTourist.Apigestionregions.modele.Region;
import com.MaliTourist.Apigestionregions.repository.RegionRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class RegionServiceImpl implements RegionService{

    private final RegionRepository regionRepository;
    @Override
    public Region creer(Region region) {
        return regionRepository.save(region);
    }

    @Override
    public List<Region> lire() {
        return regionRepository.findAll();
    }

    @Override
    public Region modifier(Integer id_rg, Region region) {
        return regionRepository.findById(id_rg)
                .map(r-> {
                        r.setCode_rg(region.getCode_rg());
                        r.setNom_rg(region.getNom_rg());
                        r.setD_act(region.getD_act());
                        r.setSuperficie(region.getSuperficie());
                    return regionRepository.save(region);
                }).orElseThrow(() -> new RuntimeException("Region introuvable !"));
    }

    @Override
    public String supprimer(Integer id) {
        regionRepository.deleteById(id);
        return "Region supprimer avec succes !";
    }
}
