package esprit.tn.revexamenpthologies.controllers;

import esprit.tn.revexamenpthologies.entities.Acte;
import esprit.tn.revexamenpthologies.services.IActeService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "acte Management")
@AllArgsConstructor
@RequestMapping("/acte")
@RestController
public class ActeController {

     @Autowired
     IActeService iActeService;

     @GetMapping("/AjoutActe/{Id}")
     public float calculerFacture(@PathVariable("Id") String Id){
        return iActeService.calculerFacture(Id);
     }
     
}
