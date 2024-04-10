package com.example.oustadi.Service;

import com.example.oustadi.Dto.*;
import com.example.oustadi.Entity.Professeur;
import com.example.oustadi.Entity.Review;
import com.example.oustadi.Repository.ReviewRepo;
import com.example.oustadi.ServiceInterface.InterEtudiant;
import com.example.oustadi.ServiceInterface.InterProfesseur;
import com.example.oustadi.ServiceInterface.InterReview;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ReviewImpl implements InterReview {
    private final ReviewRepo reviewRepo;
    private final ReviewMapper reviewMapper;
    private final InterProfesseur interProfesseur;
    private final InterEtudiant interEtudiant;
    private final EtudiantMapper etudiantMapper;
    private final ProfeseurMapper profeseurMapper;


    @Override
    public ReviewDto addReview(Long  idEtu,  Long idProf ,ReviewDto reviewDto) {
                EtudiantDto etudiantDto = interEtudiant.getEtudiantById(idEtu);
                ProfesseurDto professeurDto = interProfesseur.getProfesseur(idProf);
                reviewDto.setEtudiant(etudiantDto);
                reviewDto.setProfesseurs(professeurDto);
                return reviewMapper.toReviewDto(reviewRepo.save(reviewMapper.toReview(reviewDto)));


    }

    @Override
    public ReviewDto updateReview(Long id, ReviewDto reviewDto) {
          Review review =reviewMapper.toReview(reviewDto);
          review.setId(id);
          ReviewDto reviewDto1 = reviewMapper.toReviewDto(reviewRepo.save(review));
          return reviewDto1;
    }

    @Override
    public ReviewDto getReviewById(Long id) {

        return reviewMapper.toReviewDto(reviewRepo.findById(id).get());
    }

    @Override
    public List<ReviewDto> getAllReview() {
        return reviewMapper.toReviewDto(reviewRepo.findAll());

    }

    @Override
    public List<ReviewDto> getReviewByProfesseurId(Long id) {
       List<Review> reviews = reviewRepo.findByProfesseursId(id);

              return reviewMapper.toReviewDto(reviews);
    }

    @Override
    public void deleteReview(Long id) {
            reviewRepo.deleteById(id);
    }
}
