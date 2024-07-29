package esprit.tn.revexamenpthologies.services;

import esprit.tn.revexamenpthologies.entities.Pathologie;
import esprit.tn.revexamenpthologies.entities.Patient;
import esprit.tn.revexamenpthologies.repository.PathologieRepository;
import esprit.tn.revexamenpthologies.repository.PatientRepository;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@AllArgsConstructor
@NoArgsConstructor
@Service
public class PatientService implements IpatientService {

    @Autowired
    PatientRepository patientRepository;
    @Autowired
    PathologieRepository pathologieRepository;
    @Override
    public Patient ajouterPatientEtAffecterAPathologie (Patient patient, String codePath) {
        Pathologie pathologie=pathologieRepository.findByCodePath(codePath);
        patient.getPathologies().add(pathologie);
        return patientRepository.save(patient);
    }
}
