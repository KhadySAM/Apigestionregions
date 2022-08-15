package com.MaliTourist.Apigestionregions.service;


import com.MaliTourist.Apigestionregions.modele.Population;
import com.MaliTourist.Apigestionregions.repository.PopulationRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;


import java.util.List;

@Service
@AllArgsConstructor
public class PopulationServiceImpl implements PopulationService{

    private final PopulationRepository populationRepository;

    @Override
    public Population creer(Population pays) {
        return populationRepository.save(pays);
    }

    @Override
    public List<Population> lire() { return populationRepository.findAll();}

    @Override
    public String supprimer(Integer id_population) {
        populationRepository.deleteById(id_population);
        return "Population supprimer avec succes !";
    }
}
