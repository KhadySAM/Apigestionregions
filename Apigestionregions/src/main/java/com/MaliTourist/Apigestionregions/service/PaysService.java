package com.MaliTourist.Apigestionregions.service;

import com.MaliTourist.Apigestionregions.modele.Pays;

import java.util.List;

public interface PaysService {

    Pays creer (Pays pays);

    List<Pays> lire();

    String supprimer(Integer id_pays);

    Pays ChercherPays(String nom_pays);
}
