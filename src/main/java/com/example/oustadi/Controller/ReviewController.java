package com.example.oustadi.Controller;

import com.example.oustadi.Dto.ReviewDto;
import com.example.oustadi.Entity.Professeur;
import com.example.oustadi.Service.ReviewImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/Review")
@AllArgsConstructor
public class ReviewController {
    private final ReviewImpl reviewImpl;
    @GetMapping("")
    public ResponseEntity<List<ReviewDto>> getAllReview(){
        return ResponseEntity.ok(reviewImpl.getAllReview());
    }
    @PostMapping("/add/{idEtu}/{idProf}")
    public ResponseEntity<ReviewDto> addReview(@PathVariable Long  idEtu, @PathVariable Long idProf , @RequestBody ReviewDto reviewDto){
        return ResponseEntity.ok(reviewImpl.addReview( idEtu ,idProf,reviewDto));
    }
    @PutMapping("/update/{id}")
    public ResponseEntity<ReviewDto> updateReview(@PathVariable Long id, @RequestBody ReviewDto reviewDto){
        return ResponseEntity.ok(reviewImpl.updateReview(id,reviewDto));
    }
    @GetMapping("/{id}")
    public ResponseEntity<ReviewDto> getReviewById(@PathVariable Long id){
        return ResponseEntity.ok(reviewImpl.getReviewById(id));
    }
    @GetMapping("/getReviewByProfesseurId/{id}")
    public ResponseEntity<List<ReviewDto>> getReviewByProfesseurId(@PathVariable Long id){
        return ResponseEntity.ok(reviewImpl.getReviewByProfesseurId(id));
    }
    @DeleteMapping("/delete/{id}")
    public void deleteReview(@PathVariable Long id){
        reviewImpl.deleteReview(id);
    }

}
