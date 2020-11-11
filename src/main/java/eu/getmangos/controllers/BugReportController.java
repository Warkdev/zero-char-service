package eu.getmangos.controllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;

import eu.getmangos.entities.Bugreport;

@RequestScoped
public class BugReportController {
    @Inject private Logger logger;

    @PersistenceContext(name = "CHAR_PU")
    private EntityManager em;

    /**
     * Create a new bug report in the database.
     * @param report The bug report to be created.
     * @throws DAOException An exception is raised if the bug report can't be created.
     */
    @Transactional
    public void create(Bugreport report) throws DAOException {
        logger.debug("create() entry.");

        try {
            em.persist(report);
        } catch (Exception e) {
            logger.debug("Exception raised while creating the bug report: "+e.getMessage());
            throw new DAOException("Error while creating the bug report.");
        }

        logger.debug("create() exit.");
    }

    /**
     * Update a bug report in the database.
     * @param report The bug report to be updated.
     * @throws DAOException An exception is raised if the bug report can't be updated.
     */
    @Transactional
    public void update(Bugreport report) throws DAOException {
        logger.debug("update() entry.");
        logger.debug(report.toString());

        Bugreport exist = find(report.getId());

        if(exist == null) {
            throw new DAOException("The entity does not exist");
        }

        try {
            em.merge(report);
        } catch (Exception e) {
            logger.debug("Exception raised while updating the bug report: "+e.getMessage());
            throw new DAOException("Error while updating the bug report.");
        }

        logger.debug("update() exit.");
    }

    /**
     * Retrieves a bug report based on its ID.
     * @param id The ID of the bug report to retrieve.
     * @return The matching bug report or null if not found.
     * @throws DAOException
     */
    public Bugreport find(Integer id) throws DAOException {
        logger.debug("find() entry.");

        if (id == null) {
            throw new DAOException("ID is null.");
        }

        try {
            Bugreport report = em.createNamedQuery("Bugreport.findById", Bugreport.class).setParameter("id", id).getSingleResult();
            return report;
        } catch (NoResultException nre) {
            logger.debug("No result received for entity with id "+id);
            return null;
        } finally {
            logger.debug("find() exit.");
        }
    }

    /**
     * Delete a bug report based from the database.
     * @param id The ID of the bug report to be deleted.
     * @throws DAOException An exception is raised if the auction can't be deleted.
     */
    @Transactional
    public void delete(Integer id) throws DAOException {
        logger.debug("delete() entry.");

        if (id == null) {
            throw new DAOException("ID is null.");
        }

        em.createNamedQuery("Bugreport.delete").setParameter("id", id).executeUpdate();

        logger.debug("delete() exit.");
    }

    /**
     * Retrieves the list of all bug reports using paging.
     * @param page The page to be queried.
     * @param pageSize The size of the page.
     * @return A list of bug reports corresponding to the search.
     */
    @SuppressWarnings("unchecked")
    public List<Bugreport> findAll(int page, int pageSize) {
        logger.debug("findAll() entry.");

        List<Bugreport> list = em.createNamedQuery("Bugreport.findAll")
                                .setFirstResult((page - 1) * pageSize)
                                .setMaxResults(pageSize)
                                .getResultList();

        logger.debug("findAll() exit.");

        return list;
    }
}
