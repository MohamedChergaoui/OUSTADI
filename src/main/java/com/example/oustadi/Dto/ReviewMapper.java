package com.example.oustadi.Dto;

import com.example.oustadi.Entity.Review;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ReviewMapper {
    ReviewMapper INSTANCE = org.mapstruct.factory.Mappers.getMapper(ReviewMapper.class);
    Review toReview(ReviewDto dto);
    ReviewDto toReviewDto(Review entity);
    List<Review> toReview(List<ReviewDto> dtos);
    List<ReviewDto> toReviewDto(List<Review> entities);

}
