package com.example.oustadi.Dto;

import com.example.oustadi.Entity.Etudiant;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import java.util.List;

@Mapper(componentModel = "spring")
public interface EtudiantMapper {
    EtudiantMapper INSTANCE = Mappers.getMapper(EtudiantMapper.class);
    Etudiant toEtudiant(EtudiantDto dto);
    EtudiantDto toEtudiantDto(Etudiant entity);
    List<Etudiant> toEtudiant(List<EtudiantDto> dtos);
    List<EtudiantDto> toEtudiantDto(List<Etudiant> entities);
}
