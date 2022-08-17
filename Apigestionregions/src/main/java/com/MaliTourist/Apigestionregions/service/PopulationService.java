package com.MaliTourist.Apigestionregions.service;

import com.MaliTourist.Apigestionregions.modele.Population;
import com.MaliTourist.Apigestionregions.modele.Region;


import java.util.List;

public interface PopulationService {

    Population creer (Population population);

    List<Population> lire();

    String supprimer (Integer idpop);

    Population controlerpop(int idpop);

    // Afficher la population des regions d'une année donnée
    Iterable<Object[]> popFINDALLREGIONWITH_NONMBRE_HABITANT_AND_ANNEE();

}
