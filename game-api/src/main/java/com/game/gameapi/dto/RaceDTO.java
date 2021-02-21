package com.game.gameapi.dto;

import com.game.gameapi.models.SkillPoints;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

public class RaceDTO {
    private Long id;

    @NotNull
    @Min(1)
    private String name;

    @NotNull
    private SkillPoints skill_points;
}
