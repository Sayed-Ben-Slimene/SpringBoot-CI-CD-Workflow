package esprit.tn.revexamenpthologies.controllers;

import esprit.tn.revexamenpthologies.entities.Pathologie;
import esprit.tn.revexamenpthologies.services.IPathologieService;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "pathologie Management")
@AllArgsConstructor
@RequestMapping("/pathologie")
@RestController
public class PathologieController {

     @Autowired
     IPathologieService iPathologieService;

     @PostMapping("/AjoutPathologie")
     public void AjouterPathologie(@RequestBody Pathologie pathologie){
          iPathologieService.AjouterPathologie(pathologie);
     }

     @PutMapping("/affecterActeAPathologie/{codeActe}/{codePathologie}")
     public void affecterActeAPathologie(@PathVariable("codeActe")String codeActe,@PathVariable("codePathologie") String codePathologie){
          iPathologieService.affecterActeAPathologie (codeActe, codePathologie);
     }

}
