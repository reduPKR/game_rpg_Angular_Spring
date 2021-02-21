package com.game.gameapi.models;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Race {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private SkillPoints skill_points;

    public Race() {
    }

    public Race(String name, SkillPoints skill_points) {
        this.name = name;
        this.skill_points = skill_points;
    }

    public Race(int id, String name, SkillPoints skill_points) {
        this.id = id;
        this.name = name;
        this.skill_points = skill_points;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
