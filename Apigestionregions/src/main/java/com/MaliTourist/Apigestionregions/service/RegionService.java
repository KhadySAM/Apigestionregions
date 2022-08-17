package com.MaliTourist.Apigestionregions.service;

import com.MaliTourist.Apigestionregions.modele.Region;

import java.util.List;

public interface RegionService {

    Region creer(Region region);

    List<Region> lire();

    Region modifier(Integer id, Region region);

    String supprimer(Integer id);

    Region controlerregion(int idrg);
// Afficher les regions d'un pays donnée

    Iterable<Object[]> lireFIND_ALLREGION_WITH_PAYS();

    // AFFICHER TOUTES LES REGIONS SANS CONSIDERATION DU PAYS
    Iterable<Object[]> afFIND_REGION_SANS_Pays();
}
