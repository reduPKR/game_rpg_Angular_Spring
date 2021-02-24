package com.game.gameapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.constraints.NotNull;

public class SkillPointsDTO {
    private Long id;

    @NotNull
    private int health;

    @NotNull
    private int magic;

    @NotNull
    private int stamina;

    @NotNull
    private int health_regeneration;

    @NotNull
    private int magic_regeneration;

    @NotNull
    private int stamina_regeneration;

    @NotNull
    private int physical_attack;

    @NotNull
    private int magic_attack;

    @NotNull
    private int physical_defense;

    @NotNull
    private int magic_defense;

    @NotNull
    private int ability;

    public SkillPointsDTO() {
    }

    public SkillPointsDTO(@NotNull int health, @NotNull int magic, @NotNull int stamina, @NotNull int health_regeneration, @NotNull int magic_regeneration, @NotNull int stamina_regeneration, @NotNull int physical_attack, @NotNull int magic_attack, @NotNull int physical_defense, @NotNull int magic_defense, @NotNull int ability) {
        this.health = health;
        this.magic = magic;
        this.stamina = stamina;
        this.health_regeneration = health_regeneration;
        this.magic_regeneration = magic_regeneration;
        this.stamina_regeneration = stamina_regeneration;
        this.physical_attack = physical_attack;
        this.magic_attack = magic_attack;
        this.physical_defense = physical_defense;
        this.magic_defense = magic_defense;
        this.ability = ability;
    }

    public SkillPointsDTO(Long id, @NotNull int health, @NotNull int magic, @NotNull int stamina, @NotNull int health_regeneration, @NotNull int magic_regeneration, @NotNull int stamina_regeneration, @NotNull int physical_attack, @NotNull int magic_attack, @NotNull int physical_defense, @NotNull int magic_defense, @NotNull int ability) {
        this.id = id;
        this.health = health;
        this.magic = magic;
        this.stamina = stamina;
        this.health_regeneration = health_regeneration;
        this.magic_regeneration = magic_regeneration;
        this.stamina_regeneration = stamina_regeneration;
        this.physical_attack = physical_attack;
        this.magic_attack = magic_attack;
        this.physical_defense = physical_defense;
        this.magic_defense = magic_defense;
        this.ability = ability;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMagic() {
        return magic;
    }

    public void setMagic(int magic) {
        this.magic = magic;
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getHealth_regeneration() {
        return health_regeneration;
    }

    public void setHealth_regeneration(int health_regeneration) {
        this.health_regeneration = health_regeneration;
    }

    public int getMagic_regeneration() {
        return magic_regeneration;
    }

    public void setMagic_regeneration(int magic_regeneration) {
        this.magic_regeneration = magic_regeneration;
    }

    public int getStamina_regeneration() {
        return stamina_regeneration;
    }

    public void setStamina_regeneration(int stamina_regeneration) {
        this.stamina_regeneration = stamina_regeneration;
    }

    public int getPhysical_attack() {
        return physical_attack;
    }

    public void setPhysical_attack(int physical_attack) {
        this.physical_attack = physical_attack;
    }

    public int getMagic_attack() {
        return magic_attack;
    }

    public void setMagic_attack(int magic_attack) {
        this.magic_attack = magic_attack;
    }

    public int getPhysical_defense() {
        return physical_defense;
    }

    public void setPhysical_defense(int physical_defense) {
        this.physical_defense = physical_defense;
    }

    public int getMagic_defense() {
        return magic_defense;
    }

    public void setMagic_defense(int magic_defense) {
        this.magic_defense = magic_defense;
    }

    public int getAbility() {
        return ability;
    }

    public void setAbility(int ability) {
        this.ability = ability;
    }
}
