package com.game.gameapi.models;

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

    @OneToOne(cascade = CascadeType.ALL)
    private SkillPoints skill_points;

    public Race() {
    }

    public Race(String name, SkillPoints skill_points) {
        this.name = name;
        this.skill_points = skill_points;
    }

    public Race(Long id, String name, SkillPoints skill_points) {
        this.id = id;
        this.name = name;
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

    public SkillPoints getSkill_points() {
        return skill_points;
    }

    public void setSkill_points(SkillPoints skill_points) {
        this.skill_points = skill_points;
    }
}
