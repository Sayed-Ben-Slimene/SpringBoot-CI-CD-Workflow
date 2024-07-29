package esprit.tn.revexamenpthologies.controllers;

import esprit.tn.revexamenpthologies.entities.Patient;
import esprit.tn.revexamenpthologies.services.IpatientService;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.websocket.server.PathParam;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Tag(name = "patient Management")
@AllArgsConstructor
@RequestMapping("/patient")
@RestController
public class patientController {

     @Autowired
     IpatientService iPatientService;

     @PostMapping("/ajouterPatientEtAffecterAPathologie/{code-path}")
     public Patient ajouterPatientEtAffecterAPathologie(@RequestBody Patient patient,@PathVariable("code-path") String codePath){
         return iPatientService.ajouterPatientEtAffecterAPathologie(patient,codePath);
     }

}
