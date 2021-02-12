package com.game.gameapi.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class PowerDTO {
    private int id;

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
}
