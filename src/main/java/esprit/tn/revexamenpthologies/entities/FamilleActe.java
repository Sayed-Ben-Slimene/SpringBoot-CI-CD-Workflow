package esprit.tn.revexamenpthologies.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class FamilleActe implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idFA;
    private String codeFA;
    private String libelle;
    private String description;

    @OneToMany(mappedBy = "familleActe",cascade = CascadeType.ALL,fetch=FetchType.EAGER)
    List<Acte> actes;

}