package eu.getmangos.rest.impl;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.slf4j.Logger;

import eu.getmangos.controllers.AIPlayerBotController;
import eu.getmangos.dto.AiPlayerbotNamesDTO;
import eu.getmangos.dto.AiPlayerbotRandomBotsDTO;
import eu.getmangos.entities.AiPlayerbotNames;
import eu.getmangos.entities.AiPlayerbotRandomBots;
import eu.getmangos.mapper.AiPlayerbotNamesMapper;
import eu.getmangos.mapper.AiPlayerbotRandomBotsMapper;
import eu.getmangos.rest.AiplayerBotResource;

@RequestScoped
@Path("/aiplayerbot/v1")
@Tag(name = "aiplayerbot")
public class AiplayerBotResourceService implements AiplayerBotResource {

    @Inject private Logger logger;

    @Inject private AIPlayerBotController playerBotController;;

    @Inject private AiPlayerbotNamesMapper namesMapper;
    @Inject private AiPlayerbotRandomBotsMapper eventsMapper;

    @Override
    public Response findBotNames(Integer page, Integer pageSize) {
        logger.debug("findBotNames() entry.");

        if(page == null) {
            page = 1;
        }

        if(pageSize == null) {
            pageSize = 20;
        }

        List<AiPlayerbotNamesDTO> list = new ArrayList<>();
        for(AiPlayerbotNames name : playerBotController.getBotNames(page, pageSize)) {
            list.add(namesMapper.namesToDTO(name));
        }

        logger.debug("findBotNames() exit.");
        return Response.status(200).entity(list).build();
    }

    @Override
    public Response findAllBotEvents(Integer page, Integer pageSize) {
        logger.debug("findAllBotEvents() entry.");

        if(page == null) {
            page = 1;
        }

        if(pageSize == null) {
            pageSize = 20;
        }

        List<AiPlayerbotRandomBotsDTO> list = new ArrayList<>();
        for(AiPlayerbotRandomBots event : playerBotController.getRandomBots(page, pageSize)) {
            list.add(eventsMapper.botToDTO(event));
        }

        logger.debug("findAllBotEvents() exit.");
        return Response.status(200).entity(list).build();
    }

    @Override
    public Response findBotEvents(long botId) {
        logger.debug("findBotEvents() entry.");

        List<AiPlayerbotRandomBotsDTO> list = new ArrayList<>();
        for(AiPlayerbotRandomBots event : playerBotController.getBotListEvents(botId)) {
            list.add(eventsMapper.botToDTO(event));
        }

        logger.debug("findBotEvents() exit.");
        return Response.status(200).entity(list).build();
    }

    @Override
    public Response getMaxBotCount() {
        logger.debug("getMaxBotCount() entry.");

        Long max = playerBotController.getMaxAllowedBotCount();

        logger.debug("getMaxBotCount() exit.");

        return Response.status(200).entity(max).build();
    }

    @Override
    public Response resetAllBotEvents() {
        logger.debug("resetAllBotEvents() entry.");

        playerBotController.reset();

        logger.debug("resetAllBotEvents() exit.");

        return Response.status(200).build();
    }

}
