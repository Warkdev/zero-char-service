package eu.getmangos.mapper;

import org.mapstruct.Mapper;

import eu.getmangos.dto.AiPlayerbotRandomBotEvent;
import eu.getmangos.dto.AiPlayerbotRandomBotsDTO;
import eu.getmangos.entities.AiPlayerbotRandomBots;

@Mapper(componentModel = "cdi")
public interface AiPlayerbotRandomBotsMapper {

    AiPlayerbotRandomBotsDTO botToDTO(AiPlayerbotRandomBots bot);

    AiPlayerbotRandomBots dtoToEntity(AiPlayerbotRandomBotsDTO dto);

    default boolean map(Long value) {
        return value != 0;
    }

    default Long map(boolean value) {
        return (value ? 1L : 0L);
    }

    default AiPlayerbotRandomBotEvent mapEvent(String event) {
        return AiPlayerbotRandomBotEvent.convert(event);
    }

    default String mapEventStr(AiPlayerbotRandomBotEvent event) {
        return event.event;
    }
}
