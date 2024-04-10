package com.example.oustadi.Dto;

import com.example.oustadi.Entity.Professeur;
import org.mapstruct.Mapper;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProfeseurMapper {
    ProfeseurMapper INSTANCE = org.mapstruct.factory.Mappers.getMapper(ProfeseurMapper.class);
    Professeur toProfeseur(ProfesseurDto dto);
    ProfesseurDto toProfeseurDto(Professeur entity);
    List<Professeur> toProfeseur(List<ProfesseurDto> dtos);
    List<ProfesseurDto> toProfeseurDto(List<Professeur> entities);
}
