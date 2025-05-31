package com.eufolim.dto_mapper.repositories;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.eufolim.dto_mapper.models.CharacterEntity;

@Repository
public interface CharacterRepository extends JpaRepository<CharacterEntity,UUID> {

}
