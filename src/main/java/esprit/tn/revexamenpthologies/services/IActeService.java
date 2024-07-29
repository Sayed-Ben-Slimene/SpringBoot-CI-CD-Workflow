package esprit.tn.revexamenpthologies.services;


import esprit.tn.revexamenpthologies.entities.Acte;

public interface IActeService {
       public float calculerFacture(String identifiant);
       public void calculerNombreActesParPathologie();

}

