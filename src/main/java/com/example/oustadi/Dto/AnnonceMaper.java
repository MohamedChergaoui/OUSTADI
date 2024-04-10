package com.example.oustadi.Dto;

import com.example.oustadi.Entity.Annonce;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface AnnonceMaper {
    AnnonceMaper INSTANCE = org.mapstruct.factory.Mappers.getMapper(AnnonceMaper.class);
    Annonce toAnnonce(AnnonceDto dto);
    AnnonceDto toAnnonceDto(Annonce entity);
    List<Annonce> toAnnonce(List<AnnonceDto> dtos);
    List<AnnonceDto> toAnnonceDto(List<Annonce> entities);
}
