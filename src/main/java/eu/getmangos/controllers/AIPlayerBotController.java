package eu.getmangos.controllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.NonUniqueResultException;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.slf4j.Logger;

import eu.getmangos.dto.AiPlayerbotRandomBotEvent;
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

    /**
     * Returns the amount of max allowed bots for this server.
     * @return
     */
    public Long getMaxAllowedBotCount() {
        logger.debug("getMaxAllowedBotCount() entry.");

        try {
            AiPlayerbotRandomBots data = em.createNamedQuery("AiPlayerbotRandomBots.findEventValue", AiPlayerbotRandomBots.class)
                                        .setParameter("owner", 0)
                                        .setParameter("bot", 0)
                                        .setParameter("event", AiPlayerbotRandomBotEvent.BOTCOUNT.event)
                                        .getSingleResult();
            return data.getValue();
        } catch (NoResultException | NonUniqueResultException ex) {
            return 0L;
        } finally {
            logger.debug("getMaxAllowedBotCount() exit.");
        }
    }

    /**
     * Return a list of events for a given bot.
     * @param bot The bot ID for which the event list needs to be retrieved.
     * @return A list of events for this bot.
     */
    @SuppressWarnings("unchecked")
    public List<AiPlayerbotRandomBots> getBotListEvents(long bot) {
        logger.debug("getBotListEvents() entry.");

        List<AiPlayerbotRandomBots> data = em.createNamedQuery("AiPlayerbotRandomBots.findBotEvents")
                                    .setParameter("owner", 0)
                                    .setParameter("bot", bot)
                                    .getResultList();

        logger.debug("getBotListEvents() exit.");
        return data;
    }

    /**
     * Reset the AI Player Bot System.
     */
    @Transactional
    public void reset() {
        logger.debug("reset() entry.");

        em.createNamedQuery("AiPlayerbotRandomBots.reset").executeUpdate();

        logger.debug("reset() exit.");
    }
}
