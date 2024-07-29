package esprit.tn.revexamenpthologies.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Patient implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idPatient;

    @Enumerated(EnumType.STRING)
    private TypePieceIdentite typePieceIdentite;

    private String identifiantPieceIdentite;
    private Date dateEmission;
    private String nomP;
    private String prenomP;

    @ManyToMany
    private Set<Pathologie> pathologies =new HashSet<Pathologie> ();

}