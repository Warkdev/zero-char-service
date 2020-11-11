package eu.getmangos.mapper;

import org.mapstruct.Mapper;

import eu.getmangos.dto.AiPlayerbotNamesDTO;
import eu.getmangos.entities.AiPlayerbotNames;

@Mapper(componentModel = "cdi")
public interface AiPlayerbotNamesMapper {

    AiPlayerbotNamesDTO namesToDTO(AiPlayerbotNames names);

    AiPlayerbotNames dtoToEntity(AiPlayerbotNamesDTO dto);
}
