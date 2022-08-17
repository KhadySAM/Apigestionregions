package com.MaliTourist.Apigestionregions.modele;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Table(name = "pays")
@Getter
@Setter
@NoArgsConstructor
public class Pays {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_pays;
    @Column(unique = true)
    private String nom;
}
