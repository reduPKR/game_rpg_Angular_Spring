package com.game.gameapi.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PowerDTO {
    private Long id;

    @NotEmpty
    @Size(min=3, max=50)
    private String name;

    @NotEmpty
    @Size(min=3, max=100)
    private String description;

    @NotEmpty
    @Size(min=3, max=30)
    private String icon_name;

    @NotNull
    @Min(1)
    private int physical_attack;

    @NotNull
    @Min(1)
    private int magic_attack;

    @NotNull
    @Min(1)
    private int physical_defense;

    @NotNull
    @Min(1)
    private int magic_defense;

    @NotNull
    @Min(1)
    private int stamina_consumption;

    @NotNull
    @Min(1)
    private int magic_consumption;

    @NotNull
    @Min(1)
    private int duration_shifts;

    @NotNull
    @Min(1)
    private int shifts_off;

    /*-----------------------------------------------------------------------*/

    public PowerDTO() {
    }

    public PowerDTO(@NotEmpty @Size(min = 3, max = 50) String name, @NotEmpty @Size(min = 3, max = 100) String description, @NotEmpty @Size(min = 3, max = 30) String icon_name, @NotNull @Min(1) int physical_attack, @NotNull @Min(1) int magic_attack, @NotNull @Min(1) int physical_defense, @NotNull @Min(1) int magic_defense, @NotNull @Min(1) int stamina_consumption, @NotNull @Min(1) int magic_consumption, @NotNull @Min(1) int duration_shifts, @NotNull @Min(1) int shifts_off) {
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

    public PowerDTO(Long id, @NotEmpty @Size(min = 3, max = 50) String name, @NotEmpty @Size(min = 3, max = 100) String description, @NotEmpty @Size(min = 3, max = 30) String icon_name, @NotNull @Min(1) int physical_attack, @NotNull @Min(1) int magic_attack, @NotNull @Min(1) int physical_defense, @NotNull @Min(1) int magic_defense, @NotNull @Min(1) int stamina_consumption, @NotNull @Min(1) int magic_consumption, @NotNull @Min(1) int duration_shifts, @NotNull @Min(1) int shifts_off) {
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
