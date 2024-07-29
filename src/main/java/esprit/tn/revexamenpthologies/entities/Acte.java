package esprit.tn.revexamenpthologies.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Acte implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idActe;
    private String codeActe ;
    private String designationActe ;
    private float prixUnitaireActe ;
    private int cotationActe ;

    @ManyToOne(cascade = CascadeType.ALL)
    FamilleActe familleActe;

    @ManyToMany(mappedBy = "actes")
     Set<Pathologie> pathologies ;

}