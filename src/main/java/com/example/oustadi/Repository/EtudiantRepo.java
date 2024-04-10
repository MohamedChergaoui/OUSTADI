package com.example.oustadi.Repository;

import com.example.oustadi.Entity.Annonce;
import com.example.oustadi.Entity.Etudiant;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EtudiantRepo extends  JpaRepository<Etudiant, Long>{

}
