package eu.getmangos.rest.impl;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.slf4j.Logger;

import eu.getmangos.controllers.AHbotController;
import eu.getmangos.dto.AhbotCategoryDTO;
import eu.getmangos.dto.AhbotHistoryDTO;
import eu.getmangos.dto.AhbotPriceDTO;
import eu.getmangos.entities.AhbotCategory;
import eu.getmangos.entities.AhbotHistory;
import eu.getmangos.entities.AhbotPrice;
import eu.getmangos.mapper.AhBotCategoryMapper;
import eu.getmangos.mapper.AhBotHistoryMapper;
import eu.getmangos.mapper.AhBotPriceMapper;
import eu.getmangos.rest.AhBotResource;

@RequestScoped
@Path("/ahbot/v1")
@Tag(name = "ahbot")
public class AhBotResourceService implements AhBotResource {

    @Inject private Logger logger;

    @Inject private AHbotController ahbotController;

    @Inject private AhBotCategoryMapper categoryMapper;
    @Inject private AhBotPriceMapper priceMapper;
    @Inject private AhBotHistoryMapper historyMapper;

    @Override
    public Response findAhBotHistory(Integer page, Integer pageSize) {
        logger.debug("findAhBotHistory() entry.");

        List<AhbotHistoryDTO> listHistory = new ArrayList<>();
        for(AhbotHistory hist : ahbotController.getAuctionBotHistory(page, pageSize)) {
            listHistory.add(historyMapper.historyToDTO(hist));
        }

        logger.debug("findAhBotHistory() exit.");
        return Response.status(200).entity(listHistory).build();
    }

    @Override
    public Response findAhBotMarketPrices(Long auctionHouse, Long item, Integer page, Integer pageSize) {
        logger.debug("findAhBotMarketPrices() entry.");

        List<AhbotPriceDTO> listPrices = new ArrayList<>();

        for(AhbotPrice price : ahbotController.getAuctionBotPrice(item, auctionHouse, page, pageSize)) {
            listPrices.add(priceMapper.priceToDTO(price));
        }

        logger.debug("findAhBotMarketPrices() exit.");
        return Response.status(200).entity(listPrices).build();
    }

    @Override
    public Response findAhBotCategoryMultipliers() {
        logger.debug("findAhBotCategoryMultipliers() entry.");

        List<AhbotCategoryDTO> listMultipliers = new ArrayList<>();
        for(AhbotCategory category : ahbotController.getAuctionCategoryMultipliers()) {
            listMultipliers.add(categoryMapper.categoryToDTO(category));
        }

        logger.debug("findAhBotCategoryMultipliers() exit.");
        return Response.status(200).entity(listMultipliers).build();
    }

}
