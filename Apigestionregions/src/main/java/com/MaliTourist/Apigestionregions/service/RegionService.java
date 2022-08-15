package com.MaliTourist.Apigestionregions.service;

import com.MaliTourist.Apigestionregions.modele.Region;

import java.util.List;

public interface RegionService {

    Region creer(Region region);

    List<Region> lire();

    Region modifier(Integer id, Region region);

    String supprimer(Integer id);
}
