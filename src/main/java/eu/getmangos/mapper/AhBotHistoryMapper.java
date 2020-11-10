package eu.getmangos.mapper;

import org.mapstruct.Mapper;

import eu.getmangos.dto.AhbotHistoryDTO;
import eu.getmangos.entities.AhbotHistory;

@Mapper(componentModel = "cdi")
public interface AhBotHistoryMapper {

    AhbotHistoryDTO historyToDTO(AhbotHistory history);

    AhbotHistory dtoToEntity(AhbotHistoryDTO dto);
}
