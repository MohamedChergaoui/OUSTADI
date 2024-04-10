package com.example.oustadi.Service;


import com.example.oustadi.Dto.AnnonceDto;
import com.example.oustadi.Dto.AnnonceMaper;
import com.example.oustadi.Dto.EtudiantDto;
import com.example.oustadi.Dto.EtudiantMapper;
import com.example.oustadi.Entity.Etudiant;
import com.example.oustadi.Repository.EtudiantRepo;
import com.example.oustadi.ServiceInterface.InterEtudiant;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class EtudiantImpl implements InterEtudiant {
    private final EtudiantRepo etudiantRepo;
    private final EtudiantMapper etudiantMapper;
    private final AnnonceMaper annonceMaper;

    public EtudiantDto createEtudiant(EtudiantDto etudiantDto) {
        Etudiant etudiant = etudiantMapper.toEtudiant(etudiantDto);
        Etudiant savedEtudiant = etudiantRepo.save(etudiant);
        System.out.println("wac");
        System.out.println(savedEtudiant);
        return etudiantMapper.toEtudiantDto(savedEtudiant);
    }

    public EtudiantDto updateEtudiant(Long id ,EtudiantDto etudiantDto) {
        Etudiant etudiant = etudiantMapper.toEtudiant(etudiantDto);
        etudiant.setId(id);
        Etudiant savedEtudiant = etudiantRepo.save(etudiant);
        return etudiantMapper.toEtudiantDto(savedEtudiant);
    }

    public List<EtudiantDto> getAllEtudiant() {

        return etudiantMapper.toEtudiantDto(etudiantRepo.findAll());

    }

    public EtudiantDto getEtudiantById(Long id) {
        Optional<Etudiant> etudiant = etudiantRepo.findById(id);

        return etudiantMapper.toEtudiantDto(etudiant.get());
    }

    @Override
    public List<AnnonceDto> getAnnonceByEtudiant(Long id) {
        Etudiant etudiant = etudiantRepo.findById(id).get();
        List<AnnonceDto> annonceDtos =  annonceMaper.toAnnonceDto(etudiant.getAnnonces());
        return annonceDtos;
    }

    public void deleteEtudiant(Long id) {
        etudiantRepo.deleteById(id);
    }
}
