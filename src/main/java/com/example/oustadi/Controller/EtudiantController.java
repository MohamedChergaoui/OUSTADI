package com.example.oustadi.Controller;

import com.example.oustadi.Dto.AnnonceDto;
import com.example.oustadi.Dto.EtudiantDto;
import com.example.oustadi.Service.EtudiantImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("/Etudiant")
public class EtudiantController {
    private  final EtudiantImpl etudiantImpl;
    @GetMapping("")
    public ResponseEntity<List<EtudiantDto>> getEtudiant(){
        return ResponseEntity.ok(etudiantImpl.getAllEtudiant());
    }
    @PostMapping("/Create")
    public EtudiantDto createEtudiant( @RequestBody EtudiantDto etudiantDto){
        return etudiantImpl.createEtudiant(etudiantDto);
    }
    @PutMapping("/Update/{id}")
    public EtudiantDto updateEtudiant(@PathVariable Long id, @RequestBody EtudiantDto etudiantDto){
        etudiantDto.setId(id);
        return etudiantImpl.updateEtudiant(id ,etudiantDto);
    }
    @DeleteMapping("/Delete/{id}")
    public void deleteEtudiant(@PathVariable Long id){
        etudiantImpl.deleteEtudiant(id);
    }
    @GetMapping("Get/{id}")
    public ResponseEntity<EtudiantDto> getEtudiantById(@PathVariable Long id){
        return ResponseEntity.ok(etudiantImpl.getEtudiantById(id));
    }
    @GetMapping("/GetByAnnonce/{id}")
    public ResponseEntity<List<AnnonceDto>> getAnnonceByEtudiant(@PathVariable Long id){
        return ResponseEntity.ok(etudiantImpl.getAnnonceByEtudiant(id));
    }

}
