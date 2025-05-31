package com.eufolim.dto_mapper.models;

import java.util.UUID;

public class CharacterEntity {
    private UUID id;
    private String name;
    private String franchise;
    private String role;
    
    public CharacterEntity(UUID id, String name, String franchise, String role) {
        this.id = id;
        this.name = name;
        this.franchise = franchise;
        this.role = role;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFranchise() {
        return franchise;
    }

    public void setFranchise(String franchise) {
        this.franchise = franchise;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
