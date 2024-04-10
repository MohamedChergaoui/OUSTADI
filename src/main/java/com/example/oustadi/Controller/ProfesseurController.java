package com.example.oustadi.Controller;

import com.example.oustadi.Dto.ProfesseurDto;
import com.example.oustadi.Service.ProfesseurImpl;
import com.example.oustadi.ServiceInterface.InterProfesseur;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Professeur")
public class ProfesseurController {
    private final ProfesseurImpl interProfesseur;
    @GetMapping("")
    public ResponseEntity<List<ProfesseurDto>> getProfesseurs(){
        return ResponseEntity.ok(interProfesseur.GetAllProfesseur());
    }
    @PostMapping("/Create")
    public ProfesseurDto createProfesseur(@RequestBody ProfesseurDto professeurDto){
        return interProfesseur.saveProfesseur(professeurDto) ;
    }
    @PutMapping("/Update/{id}")
    public ResponseEntity<ProfesseurDto> updateProfesseur(@PathVariable Long id, @RequestBody ProfesseurDto professeurDto){
        return ResponseEntity.ok(interProfesseur.updateProfesseur(id,professeurDto));
    }
    @DeleteMapping("/Delete/{id}")
    public void deleteProfesseur(@PathVariable Long id){
        interProfesseur.deleteProfesseur(id);
    }

}
