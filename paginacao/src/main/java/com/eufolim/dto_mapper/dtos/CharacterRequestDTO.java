package com.eufolim.dto_mapper.dtos;

import java.util.UUID;

public record CharacterRequestDTO(
    UUID id,
    String name,
    String franchise,
    String role
) {}
