package com.game.gameapi.models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Builder;

import javax.persistence.*;

@Entity
@Builder
public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String description;

    @JsonIgnore
    @OneToOne
    @JoinColumn(name = "skill_points_id", referencedColumnName = "id")
    private SkillPoints skill_points;

    public Race() {
    }

    public Race(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public Race(Long id, String name, String description) {
        this.id = id;
        this.name = name;
        this.description = description;
    }

    public Race(String name, String description, SkillPoints skill_points) {
        this.name = name;
        this.description = description;
        this.skill_points = skill_points;
    }

    public Race(Long id, String name, String description, SkillPoints skill_points) {
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

    public SkillPoints getSkill_points() {
        return skill_points;
    }

    public void setSkill_points(SkillPoints skill_points) {
        this.skill_points = skill_points;
    }
}
