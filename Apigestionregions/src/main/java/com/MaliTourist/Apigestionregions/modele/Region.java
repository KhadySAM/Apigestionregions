package com.MaliTourist.Apigestionregions.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "region")
@Getter
@Setter
@NoArgsConstructor
public class Region {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_rg;
    private String code_rg;
    private String nom_rg;
    private String d_act;
    private String superficie;
    private String langue;


    @ManyToOne
    @JoinColumn(name = "id_pays")
    private Pays id_pays;

}
