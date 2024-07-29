package esprit.tn.revexamenpthologies.services;

import esprit.tn.revexamenpthologies.entities.Acte;
import esprit.tn.revexamenpthologies.entities.Pathologie;
import esprit.tn.revexamenpthologies.repository.ActeRepository;
import esprit.tn.revexamenpthologies.repository.PathologieRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class PathologieService implements IPathologieService {

    @Autowired
    PathologieRepository pathologieRepository;

    @Autowired
    ActeRepository acteRepository;

    @Override
    public Pathologie AjouterPathologie(Pathologie pathologie) {
        return pathologieRepository.save(pathologie);
    }

    @Override
    public void affecterActeAPathologie (String codeActe, String codePathologie) {
        Pathologie pathologie=pathologieRepository.findByArchiveFalse(codePathologie);
        Acte acte= acteRepository.findByCodeActe(codeActe);

        pathologie.getActes ().add (acte);
        pathologieRepository.save (pathologie);
    }

}
