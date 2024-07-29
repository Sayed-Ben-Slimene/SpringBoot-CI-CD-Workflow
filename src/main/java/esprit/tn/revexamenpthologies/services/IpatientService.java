package esprit.tn.revexamenpthologies.services;


import esprit.tn.revexamenpthologies.entities.Patient;

public interface IpatientService {
       public Patient ajouterPatientEtAffecterAPathologie(Patient p, String codePath);
}
