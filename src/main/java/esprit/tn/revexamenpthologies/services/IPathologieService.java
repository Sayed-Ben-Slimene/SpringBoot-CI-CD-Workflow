package esprit.tn.revexamenpthologies.services;


import esprit.tn.revexamenpthologies.entities.Pathologie;

public interface IPathologieService {
       Pathologie AjouterPathologie(Pathologie pathologie);

       public void affecterActeAPathologie(String codeActe , String codePathologie);


}
