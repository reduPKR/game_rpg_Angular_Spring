package com.game.gameapi.models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Builder
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Power {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

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
}
