package com.game.gameapi.dto;

import com.game.gameapi.models.SkillPoints;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class RaceDTO {
    private Long id;

    @NotNull
    @Min(1)
    private String name;

    @NotEmpty
    @Size(min=3, max=100)
    private String description;

    @NotNull
    private SkillPoints skill_points;
}
