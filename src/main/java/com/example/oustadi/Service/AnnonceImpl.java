package com.example.oustadi.Service;

import com.example.oustadi.Dto.AnnonceDto;
import com.example.oustadi.Dto.AnnonceMaper;
import com.example.oustadi.Dto.EtudiantMapper;
import com.example.oustadi.Dto.ProfeseurMapper;
import com.example.oustadi.Entity.Annonce;
import com.example.oustadi.Entity.Professeur;
import com.example.oustadi.Repository.AnnonceRepo;
import com.example.oustadi.ServiceInterface.InterAnnonce;
import com.example.oustadi.ServiceInterface.InterEtudiant;
import com.example.oustadi.ServiceInterface.InterProfesseur;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class AnnonceImpl implements InterAnnonce {
    private final AnnonceRepo annonceRepo;
    private final AnnonceMaper annonceMapper;
    private final InterEtudiant etudiantImpl;
    private final EtudiantMapper etudiantMapper;
    private final InterProfesseur professeurImpl;
    private final ProfeseurMapper professeurMapper;
    @Override
    public AnnonceDto saveAnnonce( Long IdEtudiant ,AnnonceDto annonceDto) {
        Annonce annonce = annonceMapper.toAnnonce(annonceDto);
        annonce.setEtudiant(etudiantMapper.toEtudiant(etudiantImpl.getEtudiantById(IdEtudiant)));
        System.out.println("raja");
        System.out.println(annonce.getEtudiant());
        return annonceMapper.toAnnonceDto(annonceRepo.save(annonce));

    }
    @Override
    public AnnonceDto updateAnnonce(Long id, AnnonceDto annonceDto) {
        Annonce annonce = annonceMapper.toAnnonce(annonceDto);
        annonce.setId(id);
        AnnonceDto annonceDto1 = annonceMapper.toAnnonceDto(annonceRepo.save(annonce));
        return annonceDto1;

    }
    @Override
    public AnnonceDto findById(Long id) {
        return annonceMapper.toAnnonceDto(annonceRepo.findById(id).get());
    }
    @Override
    public List<AnnonceDto> findAllAnnonce() {
        return annonceMapper.toAnnonceDto(annonceRepo.findAll());
    }
    @Override
    public void deleteAnnonce(Long id) {
        annonceRepo.deleteById(id);
    }

    @Override
    public AnnonceDto postulerAnnonce(Long idAnnonce, Long idProfesseur) {
        Annonce annonce = annonceRepo.findById(idAnnonce).get();
        Professeur professeur = professeurMapper.toProfeseur(professeurImpl.getProfesseur(idProfesseur));
        annonce.getProfesseurs().add(professeur);

        return annonceMapper.toAnnonceDto(annonceRepo.save(annonce));
    }


}
