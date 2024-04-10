package com.example.oustadi.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Etudiant extends Pressone {
    private String classe;
    @OneToMany(mappedBy = "etudiant")
    private List<Annonce> annonces;



}
