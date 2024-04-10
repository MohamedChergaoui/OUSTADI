package com.example.oustadi.ServiceInterface;

import com.example.oustadi.Dto.ReviewDto;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

public interface InterReview {
    public ReviewDto addReview(Long  idEtu,  Long idProf ,ReviewDto reviewDto);
    public ReviewDto updateReview( Long id ,ReviewDto reviewDto);
    public ReviewDto getReviewById(Long id);
    public List<ReviewDto> getAllReview();
    public List<ReviewDto> getReviewByProfesseurId(Long id);
    public void deleteReview(Long id);
}
