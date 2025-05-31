package com.eufolim.dto_mapper.mappers;

import java.util.UUID;

import org.springframework.stereotype.Component;


import com.eufolim.dto_mapper.dtos.CharacterRequestDTO;
import com.eufolim.dto_mapper.dtos.CharacterResponseDTO;
import com.eufolim.dto_mapper.models.CharacterEntity;

@Component
public class CharacterMapper {

    public CharacterResponseDTO toDto(CharacterEntity character){
        return new CharacterResponseDTO(
            character.getId(),
            character.getName(),
            character.getFranchise()
        );
    }

    public CharacterEntity toEntity(CharacterRequestDTO characterRequestDTO){
        CharacterEntity character = new CharacterEntity(
            UUID.randomUUID(), 
            characterRequestDTO.name(), 
            characterRequestDTO.franchise(), 
            characterRequestDTO.role()
            );
        return character;
    }
}
