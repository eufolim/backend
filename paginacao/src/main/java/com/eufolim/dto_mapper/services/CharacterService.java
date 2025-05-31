package com.eufolim.dto_mapper.services;

import java.util.List;
import java.util.UUID;

import org.springframework.stereotype.Service;

import com.eufolim.dto_mapper.dtos.CharacterRequestDTO;
import com.eufolim.dto_mapper.dtos.CharacterResponseDTO;
import com.eufolim.dto_mapper.mappers.CharacterMapper;
import com.eufolim.dto_mapper.models.CharacterEntity;
import com.eufolim.dto_mapper.repositories.CharacterRepository;

@Service
public class CharacterService {

    private CharacterRepository characterRepository;
    private final CharacterMapper characterMapper;

    public CharacterService(CharacterMapper characterMapper, CharacterRepository characterRepository) {
        this.characterRepository = characterRepository;
        this.characterMapper = characterMapper;
    }

    public List<CharacterResponseDTO> getAllCharacter(){
        List<CharacterEntity> characterList = characterRepository.findAll();
        return characterList.stream().map(characterMapper::toDto).toList();
    }

    public CharacterResponseDTO getCharacterById(UUID id){
        CharacterEntity characterEntity = characterRepository.findById(id).orElseThrow(
            () -> new RuntimeException("não encomtrado")
        );
        return characterMapper.toDto(characterEntity);
    }

    public CharacterResponseDTO createCharacter(CharacterRequestDTO characterRequestDTO){
        CharacterEntity character = characterMapper.toEntity(characterRequestDTO);
        characterRepository.save(character);
        return characterMapper.toDto(character);
    }
    
    public CharacterResponseDTO updateCharacter(UUID id, CharacterRequestDTO characterRequestDTO){
        CharacterEntity characterEntity = characterRepository.findById(id).orElseThrow(
            () -> new RuntimeException("não encomtrado")
        );
        characterEntity.setName(characterRequestDTO.name());
        characterEntity.setFranchise(characterRequestDTO.franchise());
        characterEntity.setRole(characterRequestDTO.role());
        characterRepository.save(characterEntity);
        return characterMapper.toDto(characterEntity);
    }

    public CharacterResponseDTO deleteCharacter(UUID id){
        CharacterEntity characterEntity = characterRepository.findById(id).orElseThrow(
            () -> new RuntimeException("não encomtrado")
        );
        characterRepository.delete(characterEntity);
        return characterMapper.toDto(characterEntity);
    }


}
