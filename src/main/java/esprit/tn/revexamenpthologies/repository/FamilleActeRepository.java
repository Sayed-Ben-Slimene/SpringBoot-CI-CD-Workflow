package esprit.tn.revexamenpthologies.repository;

import esprit.tn.revexamenpthologies.entities.FamilleActe;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FamilleActeRepository extends JpaRepository<FamilleActe, Long> {
}