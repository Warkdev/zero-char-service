package eu.getmangos.mapper;

import org.mapstruct.Mapper;

import eu.getmangos.dto.AhbotPriceDTO;
import eu.getmangos.entities.AhbotPrice;

@Mapper(componentModel = "cdi")
public interface AhBotPriceMapper {

    AhbotPriceDTO priceToDTO(AhbotPrice price);

    AhbotPrice dtoToEntity(AhbotPriceDTO dto);
}
