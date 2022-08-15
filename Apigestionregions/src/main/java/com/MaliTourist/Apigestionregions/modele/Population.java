package com.MaliTourist.Apigestionregions.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "population")
@Getter
@Setter
@NoArgsConstructor
public class Population {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_population;
    private Long nbre_population;
    private Date annee;

    @ManyToOne
    @JoinColumn(name = "id_rg")
    private Population id_rg;

}
