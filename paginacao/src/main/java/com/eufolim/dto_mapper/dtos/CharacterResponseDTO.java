package com.eufolim.dto_mapper.dtos;

import java.util.UUID;

public record CharacterResponseDTO(
    UUID id,
    String name,
    String franchise
) {

}
