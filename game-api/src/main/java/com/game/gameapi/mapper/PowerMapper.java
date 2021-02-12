package com.game.gameapi.mapper;

import com.game.gameapi.dto.PowerDTO;
import com.game.gameapi.models.Power;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PowerMapper {
    PowerMapper INSTANCE = Mappers.getMapper(PowerMapper.class);

    Power toModel(PowerDTO powerDTO);
    PowerDTO toDTO(Power power);
}
