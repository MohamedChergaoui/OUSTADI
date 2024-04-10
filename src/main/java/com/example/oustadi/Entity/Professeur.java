package com.example.oustadi.Entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor

public class Professeur extends Pressone {
    private String Diplome;
    private String Specialite;
    @ManyToMany(mappedBy = "professeurs", fetch = FetchType.EAGER)
    private List<Annonce> annonces =new ArrayList<>();
    @OneToMany(mappedBy = "professeurs")
    private List<Review> reviews ;
}
