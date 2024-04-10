package com.example.oustadi.ServiceInterface;

import com.example.oustadi.Dto.AnnonceDto;
import com.example.oustadi.Dto.EtudiantDto;

import java.util.List;

public interface InterEtudiant {
    public EtudiantDto createEtudiant(EtudiantDto etudiantDto);
    public EtudiantDto updateEtudiant(Long id ,EtudiantDto etudiantDto);
    public List<EtudiantDto> getAllEtudiant();
    public EtudiantDto getEtudiantById(Long id);
    public List<AnnonceDto> getAnnonceByEtudiant(Long id);
    public void deleteEtudiant(Long id);


}
