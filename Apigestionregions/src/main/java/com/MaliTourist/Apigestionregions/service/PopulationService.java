package com.MaliTourist.Apigestionregions.service;

import com.MaliTourist.Apigestionregions.modele.Population;


import java.util.List;

public interface PopulationService {

    Population creer (Population population);

    List<Population> lire();

    String supprimer (Integer id_population);
}
