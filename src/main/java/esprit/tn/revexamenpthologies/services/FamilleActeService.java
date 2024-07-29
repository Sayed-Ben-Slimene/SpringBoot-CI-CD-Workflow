package esprit.tn.revexamenpthologies.services;

import esprit.tn.revexamenpthologies.entities.Acte;
import esprit.tn.revexamenpthologies.entities.Pathologie;
import esprit.tn.revexamenpthologies.entities.FamilleActe;
import esprit.tn.revexamenpthologies.repository.ActeRepository;
import esprit.tn.revexamenpthologies.repository.PathologieRepository;
import esprit.tn.revexamenpthologies.repository.FamilleActeRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class FamilleActeService implements IFamilleActeService {

    @Autowired
    FamilleActeRepository familleActeRepository;
    @Autowired
    ActeRepository acteRepository;


/*    @Override
    public FamilleActe ajouterFamilleActeEtActeAssocie (FamilleActe facte) {
        return familleActeRepository.save (facte);
    }
*/

    @Override
    public FamilleActe ajouterFamilleActeEtActeAssocie(FamilleActe facte) {
        for (Acte acte :facte.getActes())
        {
            acte.setFamilleActe(facte);
            acteRepository.save(acte) ;
        }
        return familleActeRepository.save(facte) ;
    }



}
