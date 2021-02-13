package com.game.gameapi.models;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
public class Power {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String icon_name;

    @Column
    private int physical_attack;

    @Column
    private int magic_attack;

    @Column
    private int physical_defense;

    @Column
    private int magic_defense;

    @Column
    private int stamina_consumption;

    @Column
    private int magic_consumption;

    @Column
    private int duration_shifts;

    @Column
    private int shifts_off;

    /*---------------------------------------------------------------------------*/

    public Power() {
    }

    public Power(String name, String description, String icon_name, int physical_attack, int magic_attack, int physical_defense, int magic_defense, int stamina_consumption, int magic_consumption, int duration_shifts, int shifts_off) {
        this.name = name;
        this.description = description;
        this.icon_name = icon_name;
        this.physical_attack = physical_attack;
        this.magic_attack = magic_attack;
        this.physical_defense = physical_defense;
        this.magic_defense = magic_defense;
        this.stamina_consumption = stamina_consumption;
        this.magic_consumption = magic_consumption;
        this.duration_shifts = duration_shifts;
        this.shifts_off = shifts_off;
    }

    public Power(Long id, String name, String description, String icon_name, int physical_attack, int magic_attack, int physical_defense, int magic_defense, int stamina_consumption, int magic_consumption, int duration_shifts, int shifts_off) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.icon_name = icon_name;
        this.physical_attack = physical_attack;
        this.magic_attack = magic_attack;
        this.physical_defense = physical_defense;
        this.magic_defense = magic_defense;
        this.stamina_consumption = stamina_consumption;
        this.magic_consumption = magic_consumption;
        this.duration_shifts = duration_shifts;
        this.shifts_off = shifts_off;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon_name() {
        return icon_name;
    }

    public void setIcon_name(String icon_name) {
        this.icon_name = icon_name;
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

    public int getStamina_consumption() {
        return stamina_consumption;
    }

    public void setStamina_consumption(int stamina_consumption) {
        this.stamina_consumption = stamina_consumption;
    }

    public int getMagic_consumption() {
        return magic_consumption;
    }

    public void setMagic_consumption(int magic_consumption) {
        this.magic_consumption = magic_consumption;
    }

    public int getDuration_shifts() {
        return duration_shifts;
    }

    public void setDuration_shifts(int duration_shifts) {
        this.duration_shifts = duration_shifts;
    }

    public int getShifts_off() {
        return shifts_off;
    }

    public void setShifts_off(int shifts_off) {
        this.shifts_off = shifts_off;
    }
}
