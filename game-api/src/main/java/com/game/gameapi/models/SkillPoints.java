package com.game.gameapi.models;

import lombok.Builder;

import javax.persistence.*;

@Entity
@Builder
public class SkillPoints {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private int health;
    @Column(nullable = false)
    private int magic;
    @Column(nullable = false)
    private int stamina;
    @Column(nullable = false)
    private int health_regeneration;
    @Column(nullable = false)
    private int magic_regeneration;
    @Column(nullable = false)
    private int stamina_regeneration;
    @Column(nullable = false)
    private int physical_attack;
    @Column(nullable = false)
    private int magic_attack;
    @Column(nullable = false)
    private int physical_defense;
    @Column(nullable = false)
    private int magic_defense;
    @Column(nullable = false)
    private int ability;

    @OneToOne(cascade = CascadeType.ALL, mappedBy = "skill_points", fetch = FetchType.LAZY)
    private Race race;

    /*---------------------------------------------------------------------*/

    public SkillPoints() {
    }

    public SkillPoints(int health, int magic, int stamina, int health_regeneration, int magic_regeneration, int stamina_regeneration, int physical_attack, int magic_attack, int physical_defense, int magic_defense, int ability) {
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

    public SkillPoints(Long id, int health, int magic, int stamina, int health_regeneration, int magic_regeneration, int stamina_regeneration, int physical_attack, int magic_attack, int physical_defense, int magic_defense, int ability) {
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

    public SkillPoints(int health, int magic, int stamina, int health_regeneration, int magic_regeneration, int stamina_regeneration, int physical_attack, int magic_attack, int physical_defense, int magic_defense, int ability, Race race) {
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
        this.race = race;
    }

    public SkillPoints(Long id, int health, int magic, int stamina, int health_regeneration, int magic_regeneration, int stamina_regeneration, int physical_attack, int magic_attack, int physical_defense, int magic_defense, int ability, Race race) {
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
        this.race = race;
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

    public Race getRace() {
        return race;
    }

    public void setRace(Race race) {
        this.race = race;
    }
}
