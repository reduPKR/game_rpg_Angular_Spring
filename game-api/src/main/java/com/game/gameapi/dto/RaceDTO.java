package com.game.gameapi.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.Min;
import javax.validation.constraints.Size;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class RaceDTO {
    private Long id;

    @Min(1)
    private String name;

    @Size(min=3, max=100)
    private String description;

    private SkillPointsDTO skill_points;

    public RaceDTO() {
    }

    public RaceDTO(@Min(1) String name, @Size(min = 3, max = 100) String description, SkillPointsDTO skill_points) {
        this.name = name;
        this.description = description;
        this.skill_points = skill_points;
    }

    public RaceDTO(Long id, @Min(1) String name, @Size(min = 3, max = 100) String description, SkillPointsDTO skill_points) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.skill_points = skill_points;
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

    public SkillPointsDTO getSkill_points() {
        return skill_points;
    }

    public void setSkill_points(SkillPointsDTO skill_points) {
        this.skill_points = skill_points;
    }
}
