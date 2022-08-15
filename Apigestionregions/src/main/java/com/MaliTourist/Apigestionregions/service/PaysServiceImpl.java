package com.MaliTourist.Apigestionregions.service;

import com.MaliTourist.Apigestionregions.modele.Pays;
import com.MaliTourist.Apigestionregions.repository.PaysRepository;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PaysServiceImpl implements PaysService{
    private final PaysRepository paysRepository;
    @Override
    public Pays creer(Pays pays) {
        return paysRepository.save(pays);
    }

    @Override
    public List<Pays> lire() {
        return paysRepository.findAll();
    }

    @Override
    public String supprimer(Integer id_pays) {
        paysRepository.deleteById(id_pays);
        return "Pays supprimer avec succes !";
    }
}
