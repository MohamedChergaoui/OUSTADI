package com.example.oustadi.Dto;

import com.example.oustadi.Entity.Etudiant;
import com.example.oustadi.Entity.Professeur;
import jakarta.persistence.ManyToOne;
import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ReviewDto {
    private Long id ;
    private String description;
    private int etoile;
    private EtudiantDto etudiant;
    private ProfesseurDto professeurs;

}
