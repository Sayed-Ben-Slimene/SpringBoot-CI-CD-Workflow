package esprit.tn.revexamenpthologies.controllers;

import esprit.tn.revexamenpthologies.entities.FamilleActe;
import esprit.tn.revexamenpthologies.services.IFamilleActeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "familleActe Management")
@AllArgsConstructor
@RequestMapping("/familleActe")
@RestController
public class FamilleActeController {

     @Autowired
     IFamilleActeService iFamilleActeService;

     @PostMapping("/AjoutFamilleActe")
     public FamilleActe AjouterFamilleActe(@RequestBody FamilleActe facte){
        return iFamilleActeService.ajouterFamilleActeEtActeAssocie(facte);
     }
     
}
