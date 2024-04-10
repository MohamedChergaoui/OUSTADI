package com.example.oustadi.ServiceInterface;

import com.example.oustadi.Dto.AnnonceDto;

import java.util.List;

public interface InterAnnonce {
    public AnnonceDto saveAnnonce( Long IdEtudiant ,AnnonceDto annonceDto);
    public AnnonceDto updateAnnonce(Long id ,AnnonceDto annonceDto);
    public AnnonceDto findById(Long id);
    public List<AnnonceDto> findAllAnnonce();
    public void deleteAnnonce(Long id);
    public AnnonceDto postulerAnnonce(Long idAnnonce, Long idProfesseur);
}
