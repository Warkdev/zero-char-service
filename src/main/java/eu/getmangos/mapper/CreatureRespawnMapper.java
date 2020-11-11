package eu.getmangos.mapper;

import org.mapstruct.Mapper;

import eu.getmangos.dto.CreatureRespawnDTO;
import eu.getmangos.entities.CreatureRespawn;

@Mapper(componentModel = "cdi")
public interface CreatureRespawnMapper {

    CreatureRespawnDTO map(CreatureRespawn auction);

    CreatureRespawn map(CreatureRespawnDTO dto);
}
