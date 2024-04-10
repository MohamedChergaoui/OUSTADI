package com.example.oustadi.Repository;

import com.example.oustadi.Entity.Review;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ReviewRepo extends JpaRepository<Review, Long> {
     public List<Review> findByProfesseursId(Long id);

}
