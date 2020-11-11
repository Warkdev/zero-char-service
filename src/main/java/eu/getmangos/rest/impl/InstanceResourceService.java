package eu.getmangos.rest.impl;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.slf4j.Logger;

import eu.getmangos.controllers.CreatureRespawnController;
import eu.getmangos.controllers.DAOException;
import eu.getmangos.dto.CreatureRespawnDTO;
import eu.getmangos.entities.CreatureRespawn;
import eu.getmangos.mapper.CreatureRespawnMapper;
import eu.getmangos.rest.InstanceResource;

@RequestScoped
@Path("/instance/v1")
@Tag(name = "instance")
public class InstanceResourceService implements InstanceResource {

    @Inject private Logger logger;

    @Inject private CreatureRespawnController creatureRespawnController;

    @Inject private CreatureRespawnMapper creatureMapper;

    @Override
    @Tag(name = "creature")
    @Tag(name = "respawn")
    @Tag(name = "instance")
    public Response findAllCreatureRespawn(Integer instanceId, Integer page, Integer pageSize) {
        logger.debug("findAllCreatureRespawn() entry.");

        if(page == null) {
            page = 1;
        }

        if(pageSize == null) {
            pageSize = 20;
        }

        if(pageSize > 100) {
            pageSize = 100;
        }

        List<CreatureRespawnDTO> list = new ArrayList<>();

        try{
            for(CreatureRespawn respawn : creatureRespawnController.findAllByInstance(instanceId, page, pageSize)) {
                list.add(creatureMapper.map(respawn));
            }
        } catch (DAOException dao) {
            return Response.status(404).entity(list).build();
        }

        logger.debug("findAllCreatureRespawn() exit.");

        return Response.status(200).entity(list).build();
    }

    @Override
    @Tag(name = "creature")
    @Tag(name = "respawn")
    @Tag(name = "instance")
    public Response findCreatureRespawn(Integer instanceId, Integer guid) {
        logger.debug("findCreatureRespawn() entry.");

        CreatureRespawn entity = null;

        try {
            entity = creatureRespawnController.find(instanceId, guid);
        } catch (DAOException dao) {
            logger.debug("Error while retrieving the timer "+dao.getMessage());
            return Response.status(500).build();
        } finally {
            logger.debug("findCreatureRespawn() exit.");
        }

        if(entity == null) {
            return Response.status(404).build();
        }

        return Response.status(200).entity(creatureMapper.map(entity)).build();
    }

    @Override
    @Tag(name = "creature")
    @Tag(name = "respawn")
    @Tag(name = "instance")
    public Response createCreatureRespawn(Integer instanceId, CreatureRespawnDTO entity) {
        try {
            entity.setInstance(instanceId);
            this.creatureRespawnController.create(creatureMapper.map(entity));
        } catch (DAOException daoEx) {
                return Response.status(400).entity(daoEx.getMessage()).build();
        } catch (Exception ex) {
                return Response.status(500).entity(ex.getMessage()).build();
        }
        return Response.status(201).entity("Respawn Timer has been created.").build();
    }

    @Override
    @Tag(name = "creature")
    @Tag(name = "respawn")
    @Tag(name = "instance")
    public Response updateCreatureRespawnTimer(Integer instanceId, Integer guid, CreatureRespawnDTO entity) {
        try {
            entity.setGuid(guid);
            entity.setInstance(instanceId);
            this.creatureRespawnController.update(creatureMapper.map(entity));
        } catch (DAOException daoEx) {
                return Response.status(400).entity(daoEx.getMessage()).build();
        } catch (Exception ex) {
                return Response.status(500).entity(ex.getMessage()).build();
        }
        return Response.status(200).entity("Respawn Timer has been updated.").build();
    }

    @Override
    @Tag(name = "creature")
    @Tag(name = "respawn")
    @Tag(name = "instance")
    public Response deleteCreatureRespawnTimer(Integer instanceId, Integer guid) {
        try {
            this.creatureRespawnController.delete(instanceId, guid);
        } catch (DAOException daoEx) {
                return Response.status(400).entity(daoEx.getMessage()).build();
        } catch (Exception ex) {
                return Response.status(500).entity(ex.getMessage()).build();
        }
        return Response.status(204).build();
    }

    @Override
    @Tag(name = "creature")
    @Tag(name = "respawn")
    @Tag(name = "instance")
    public Response deleteAllCreatureRespawnTimer(Integer instanceId) {
        try {
            this.creatureRespawnController.deleteAllByInstance(instanceId);
        } catch (DAOException daoEx) {
                return Response.status(400).entity(daoEx.getMessage()).build();
        } catch (Exception ex) {
                return Response.status(500).entity(ex.getMessage()).build();
        }
        return Response.status(204).build();
    }

}
