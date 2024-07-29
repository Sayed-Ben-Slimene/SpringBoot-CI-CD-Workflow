package esprit.tn.revexamenpthologies.repository;

import esprit.tn.revexamenpthologies.entities.Acte;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface ActeRepository extends JpaRepository<Acte, Long> {
    Acte findByCodeActe (String codeActe);

    @Query("select sum((a.cotationActe)* (a.prixUnitaireActe)) from Acte a where a.prixUnitaireActe = ?1 and a.cotationActe = ?2")
    long getActeFacture (float prixUnitaireActe, int cotationActe);

    @Query("""
            select sum(a.cotationActe * a.prixUnitaireActe) from Acte a join a.pathologies pathologies
            where pathologies.archive =false And pathologies.codePath like ?1 or pathologies.libelle like ?1 """)
    long getActeFacture2 (String id);

    @Query("select count(a) from Acte a inner join a.pathologies p where p.codePath = ?1")
    long countByIdActe(String codePath);




}