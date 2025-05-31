package com.eufolim.dto_mapper.controllers;

import java.util.List;
import java.util.UUID;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eufolim.dto_mapper.dtos.CharacterRequestDTO;
import com.eufolim.dto_mapper.dtos.CharacterResponseDTO;
import com.eufolim.dto_mapper.services.CharacterService;

@RestController
@RequestMapping("/character")
public class CharacterController {

    private final CharacterService characterService;

    public CharacterController(CharacterService characterService) {
        this.characterService = characterService;
    }

    @GetMapping
    public List<CharacterResponseDTO> getAllCharacter(){
        return characterService.getAllCharacter();
    }

    @GetMapping("/{id}")
    public CharacterResponseDTO getCharacterById(@PathVariable UUID id){
        return characterService.getCharacterById(id);
    }

    @PostMapping
    public CharacterResponseDTO createCharacter(@RequestBody CharacterRequestDTO characterRequestDTO){
        return createCharacter(characterRequestDTO);
    }

    @PutMapping("/{id}")
    public CharacterResponseDTO updateCharacter(@PathVariable UUID id, @RequestBody CharacterRequestDTO characterRequestDTO){
        return characterService.updateCharacter(id, characterRequestDTO);
    }

    @DeleteMapping("/{id}")
    public CharacterResponseDTO deleteCharacter(@PathVariable UUID id){
        return characterService.deleteCharacter(id);
    }
}
