package com.example.oustadi.Service;

import com.example.oustadi.Dto.ProfeseurMapper;
import com.example.oustadi.Dto.ProfesseurDto;
import com.example.oustadi.Entity.Professeur;
import com.example.oustadi.Repository.ProfesseurRepo;
import com.example.oustadi.ServiceInterface.InterProfesseur;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ProfesseurImpl implements InterProfesseur {
    private final ProfesseurRepo professeurRepo;
    private final ProfeseurMapper professeurMapper;

    @Override
    public ProfesseurDto saveProfesseur(ProfesseurDto professeurDto) {
        Professeur professeur = professeurMapper.toProfeseur(professeurDto);

        return professeurMapper.toProfeseurDto( professeurRepo.save(professeur));

    }

    @Override
    public ProfesseurDto updateProfesseur(Long id, ProfesseurDto professeurDto) {
        Professeur professeur = professeurMapper.toProfeseur(professeurDto);
        professeur.setId(id);
        ProfesseurDto professeurDto1 = professeurMapper.toProfeseurDto(professeurRepo.save(professeur));
        return professeurDto1;

    }

    @Override
    public List<ProfesseurDto> GetAllProfesseur() {

        return professeurMapper.toProfeseurDto(professeurRepo.findAll());
    }

    @Override
    public ProfesseurDto getProfesseur(Long id) {
        return professeurMapper.toProfeseurDto(professeurRepo.findById(id).get());
    }

    @Override
    public void deleteProfesseur(Long id) {
        professeurRepo.deleteById(id);

    }
}
