package eu.getmangos.controllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;

import eu.getmangos.entities.AiPlayerbotNames;
import eu.getmangos.entities.AiPlayerbotRandomBots;

@RequestScoped
public class AIPlayerBotController {
    @Inject private Logger logger;

    @PersistenceContext(name = "CHAR_PU")
    private EntityManager em;

    /**
     * Return a list of bot names from the database.
     * @param page The page from which we need to browse the database.
     * @param pageSize The size of the page.
     * @return A list of bot names from the database.
     */
    @SuppressWarnings("unchecked")
    public List<AiPlayerbotNames> getBotNames(int page, int pageSize) {
        logger.debug("getBotNames() entry.");

        List<AiPlayerbotNames> listBotNames = em.createNamedQuery("AiPlayerbotNames.findAll")
                                                .setFirstResult((page - 1) * pageSize)
                                                .setMaxResults(pageSize)
                                                .getResultList();

        logger.debug("getBotNames() exit.");

        return listBotNames;
    }

    /**
     * Returns a list of random bots from the database.
     * @param page The page from which we've to browse.
     * @param pageSize The maximum amount of results.
     * @return A list of random bots from the database.
     */
    @SuppressWarnings("unchecked")
    public List<AiPlayerbotRandomBots> getRandomBots(int page, int pageSize) {
        logger.debug("getRandomBots() entry.");

        List<AiPlayerbotRandomBots> listBots = em.createNamedQuery("AiPlayerbotRandomBots.findAll")
                                                .setFirstResult((page - 1) * pageSize)
                                                .setMaxResults(pageSize)
                                                .getResultList();

        logger.debug("getRandomBots() exit.");

        return listBots;
    }
}
