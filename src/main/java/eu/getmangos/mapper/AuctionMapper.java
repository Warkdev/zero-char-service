package eu.getmangos.mapper;

import org.mapstruct.Mapper;

import eu.getmangos.dto.AuctionDTO;
import eu.getmangos.entities.Auction;

@Mapper(componentModel = "cdi")
public interface AuctionMapper {

    AuctionDTO auctionToDTO(Auction auction);

    Auction dtoToEntity(AuctionDTO dto);
}
