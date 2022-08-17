package com.MaliTourist.Apigestionregions.repository;

import com.MaliTourist.Apigestionregions.modele.Population;
import com.MaliTourist.Apigestionregions.modele.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface PopulationRepository extends JpaRepository<Population, Integer> {


    @Query(value = "SELECT region.nom_rg ,population.nbre_population, population.annee FROM population, population where region.id_population = region.id_rg", nativeQuery = true )
    public Iterable<Object[]> FINDALLREGIONWITH_NONMBRE_HABITANT_AND_ANNEE();

    Population findByIdpop (int idpop);

}
