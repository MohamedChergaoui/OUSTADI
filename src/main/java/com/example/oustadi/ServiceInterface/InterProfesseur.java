package com.example.oustadi.ServiceInterface;

import com.example.oustadi.Dto.ProfesseurDto;

import java.util.List;

public interface InterProfesseur {
    public ProfesseurDto saveProfesseur(ProfesseurDto professeurDto);
    public ProfesseurDto updateProfesseur(Long id ,ProfesseurDto professeurDto);
    public List<ProfesseurDto> GetAllProfesseur();
    public ProfesseurDto getProfesseur(Long id);
    public void deleteProfesseur(Long id);
}
