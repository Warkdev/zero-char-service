package eu.getmangos.mapper;

import java.util.Date;

import org.mapstruct.Mapper;

import eu.getmangos.dto.AhbotCategoryDTO;
import eu.getmangos.entities.AhbotCategory;

@Mapper(componentModel = "cdi")
public interface AhBotCategoryMapper {

    AhbotCategoryDTO categoryToDTO(AhbotCategory multipliers);

    AhbotCategory dtoToEntity(AhbotCategoryDTO dto);

    default Long mapTime(Date date) {
        return date.getTime();
    }

    default Date mapTime(Long time) {
        return new Date(time);
    }
}
