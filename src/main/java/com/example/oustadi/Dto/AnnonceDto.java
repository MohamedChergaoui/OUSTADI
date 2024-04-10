package com.example.oustadi.Dto;

import com.example.oustadi.Entity.Etudiant;
import com.example.oustadi.Entity.Professeur;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
@Data
@AllArgsConstructor
@NoArgsConstructor
public class AnnonceDto {

    private Long id ;
    private String nomCoure;
    private String description;
    private Date dateCreatin;

    private EtudiantDto etudiant;
    private List<ProfesseurDto> professeurs=new ArrayList<>();
}
