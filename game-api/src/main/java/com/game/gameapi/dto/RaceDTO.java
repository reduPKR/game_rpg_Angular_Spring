package com.game.gameapi.dto;

import com.game.gameapi.models.SkillPoints;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

public class RaceDTO {
    private Long id;

    @Min(1)
    private String name;

    @Size(min=3, max=100)
    private String description;
}
