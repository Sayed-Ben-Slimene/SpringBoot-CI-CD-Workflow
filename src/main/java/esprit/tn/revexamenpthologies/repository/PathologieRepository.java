package esprit.tn.revexamenpthologies.repository;

import esprit.tn.revexamenpthologies.entities.Pathologie;
import esprit.tn.revexamenpthologies.entities.Patient;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface PathologieRepository extends JpaRepository<Pathologie, Long> {
    Pathologie findPathologieByCodePath(String codePath);

    Pathologie findByCodePath(String codePath);


    @Query("select p from Pathologie p where p.codePath =:codePath and p.archive = false")
    Pathologie findByArchiveFalse (@Param ("codePath") String codePath);


    @Query("select p from Pathologie p where p.codePath =:id or p.libelle=:id and p.archive = false")
    Pathologie findByArchiveFalseAndByCodePathOrLibelle (@Param ("id") String id);



}