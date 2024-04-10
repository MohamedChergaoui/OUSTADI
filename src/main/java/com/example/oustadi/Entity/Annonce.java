package com.example.oustadi.Entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Annonce {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id ;
    private String nomCoure;
    private String description;
    private Date dateCreatin;
    @ManyToOne
    private Etudiant etudiant;
    @ManyToMany(fetch = FetchType.EAGER)
    private List<Professeur> professeurs=new ArrayList<>();


}
