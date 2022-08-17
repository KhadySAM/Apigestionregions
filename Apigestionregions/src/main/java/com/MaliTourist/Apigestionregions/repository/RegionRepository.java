package com.MaliTourist.Apigestionregions.repository;

import com.MaliTourist.Apigestionregions.modele.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface RegionRepository extends JpaRepository<Region, Integer> {

        //  Avec pays
        @Query(value = "SELECT region.nom_rg , pays.nom_pays as pays FROM region, pays where region.id_pays = pays.id_pays", nativeQuery = true )
        public Iterable<Object[]> FIND_ALLREGION_WITH_PAYS();


        // Sans pays
        @Query(value = "SELECT region.nom_rg FROM region", nativeQuery = true )
        public Iterable<Object[]> FIND_REGION_SANS_Pays();

        Region findByIdrg (int idrg);
}

