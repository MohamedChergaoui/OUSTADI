package com.example.oustadi.Dto;

import com.example.oustadi.Entity.Annonce;
import com.example.oustadi.Entity.Review;
import jakarta.persistence.FetchType;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ProfesseurDto {
    private Long id;
    private String nom;
    private String prenom;
    private String tele;
    private String email;
    private String adresse;
    private String photoProfil;
    private String role;
    private String Diplome;
    private String Specialite;


}
