package com.example.oustadi.Controller;

import com.example.oustadi.Dto.AnnonceDto;
import com.example.oustadi.Service.AnnonceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Annonce")
@AllArgsConstructor
public class AnnonceController {
    private final AnnonceImpl annonceImpl;
    @GetMapping("")
    public ResponseEntity<List<AnnonceDto>> getAnnonces(){
        return ResponseEntity.ok(annonceImpl.findAllAnnonce());
    }
    @PostMapping("/Create")
    public ResponseEntity<AnnonceDto> createAnnonce( @RequestBody  AnnonceDto annonceDto){

        return ResponseEntity.ok(annonceImpl.saveAnnonce( annonceDto.getEtudiant().getId(),annonceDto)) ;
    }
    @GetMapping("/Postuler/{idAnnonce}/{idProfesseur}")
    public ResponseEntity<AnnonceDto> postulerAnnonce(@PathVariable Long idAnnonce, @PathVariable Long idProfesseur){

        return ResponseEntity.ok(annonceImpl.postulerAnnonce(idAnnonce,idProfesseur));
    }
    @GetMapping("/Get/{id}")
    public ResponseEntity<AnnonceDto> getAnnonceById(Long id){
        return ResponseEntity.ok(annonceImpl.findById(id));}
    @PutMapping("/Update/{id}")
    public ResponseEntity<AnnonceDto> updateAnnonce(@PathVariable Long id, @RequestBody AnnonceDto annonceDto){
        return ResponseEntity.ok(annonceImpl.updateAnnonce(id,annonceDto));
    }

    @DeleteMapping("/Delete/{id}")
    public void deleteAnnonce(@PathVariable Long id){
        annonceImpl.deleteAnnonce(id);
    }

}
