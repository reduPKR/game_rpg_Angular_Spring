package com.game.gameapi.mapper;

import com.game.gameapi.dto.RaceDTO;
import com.game.gameapi.models.Race;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RaceMapper {
    RaceMapper INSTANCE = Mappers.getMapper(RaceMapper.class);

    Race toMode(RaceDTO raceDTO);
    RaceDTO toDTO(Race race);
}
