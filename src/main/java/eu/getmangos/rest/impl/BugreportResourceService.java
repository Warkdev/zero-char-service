package eu.getmangos.rest.impl;

import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.ws.rs.Path;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.tags.Tag;
import org.slf4j.Logger;

import eu.getmangos.controllers.BugReportController;
import eu.getmangos.controllers.DAOException;
import eu.getmangos.dto.BugReportDTO;
import eu.getmangos.entities.Bugreport;
import eu.getmangos.mapper.BugReportMapper;
import eu.getmangos.rest.BugreportResource;

@RequestScoped
@Path("/bug_report/v1")
@Tag(name = "bug_report")
public class BugreportResourceService implements BugreportResource {

    @Inject private Logger logger;

    @Inject private BugReportController reportController;

    @Inject private BugReportMapper reportMapper;

    @Override
    public Response findAllBugreport(Integer page, Integer pageSize) {
        logger.debug("findAllBugreport() entry.");

        if(page == null) {
            page = 1;
        }

        if(pageSize == null) {
            pageSize = 20;
        }

        if(pageSize > 100) {
            pageSize = 100;
        }

        List<BugReportDTO> list = new ArrayList<>();

        for(Bugreport report : reportController.findAll(page, pageSize)) {
            list.add(reportMapper.map(report));
        }

        logger.debug("findAllBugreport() exit.");

        return Response.status(200).entity(list).build();
    }

    @Override
    public Response findBugreport(int id) {
        logger.debug("findBugreport() entry.");

        try {
            BugReportDTO report = reportMapper.map(reportController.find(id));
            if(report == null) {
                return Response.status(404).build();
            }
            return Response.status(200).entity(report).build();
        } catch (DAOException dao) {
            logger.debug("findBugreport() exit.");
            return Response.status(500).build();
        }

    }

    @Override
    public Response createBugreport(BugReportDTO entity) {
        try {
            this.reportController.create(reportMapper.map(entity));
        } catch (DAOException daoEx) {
                return Response.status(400).entity(daoEx.getMessage()).build();
        } catch (Exception ex) {
                return Response.status(500).entity(ex.getMessage()).build();
        }
        return Response.status(201).entity("Bug Report has been created.").build();
    }

    @Override
    public Response updateBugreport(Integer auctionId, BugReportDTO entity) {
        try {
            this.reportController.update(reportMapper.map(entity));
        } catch (DAOException daoEx) {
                return Response.status(400).entity(daoEx.getMessage()).build();
        } catch (Exception ex) {
                return Response.status(500).entity(ex.getMessage()).build();
        }
        return Response.status(200).entity("Bug Report has been updated.").build();
    }

    @Override
    public Response deleteBugreport(Integer id) {
        try {
            this.reportController.delete(id);
        } catch (DAOException daoEx) {
                return Response.status(400).entity(daoEx.getMessage()).build();
        } catch (Exception ex) {
                return Response.status(500).entity(ex.getMessage()).build();
        }
        return Response.status(204).build();
    }

}
