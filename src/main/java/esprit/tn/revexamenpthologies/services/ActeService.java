package esprit.tn.revexamenpthologies.services;

import esprit.tn.revexamenpthologies.entities.Acte;
import esprit.tn.revexamenpthologies.entities.Pathologie;
import esprit.tn.revexamenpthologies.repository.ActeRepository;
import esprit.tn.revexamenpthologies.repository.PathologieRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Service
@Slf4j
public class ActeService implements IActeService {

    @Autowired
    ActeRepository acteRepository;
//Merge commit
    @Autowired
    PathologieRepository pathologieRepository;
    @Override
    public float calculerFacture (String identifiant) {
            return acteRepository.getActeFacture2 (identifiant);
    }

    @Override
    @Scheduled(fixedDelay = 30000)
    public void calculerNombreActesParPathologie () {
        ArrayList<Pathologie> pathologies =(ArrayList<Pathologie>) pathologieRepository.findAll ();

        for (Pathologie pathologie : pathologies) {
            log.info ("Pathologie "+pathologie.getCodePath ()+"Nb Actes = "+acteRepository.countByIdActe(pathologie.getCodePath ()) );
        }
    }


}
