package eu.getmangos.controllers;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.slf4j.Logger;

import eu.getmangos.entities.AhbotCategory;
import eu.getmangos.entities.AhbotHistory;
import eu.getmangos.entities.AhbotPrice;

@RequestScoped
public class AHbotController {
    @Inject private Logger logger;

    @PersistenceContext(unitName = "CHAR_PU")
    private EntityManager em;

    /**
     * Returns a list of auction house selling history which the AH Bot uses as base to define the market price.
     * @param pageNumber The page to visit.
     * @param pageSize The size of the page.
     * @return The history of auctions for the requested page and page size.
     */
    @SuppressWarnings("unchecked")
    public List<AhbotHistory> getAuctionBotHistory(int pageNumber, int pageSize) {
        logger.debug("getAuctionBotHistory() entry.");

        List<AhbotHistory> listAuctions = (List<AhbotHistory>) em.createNamedQuery("AhbotHistory.findAll")
                                                                .setFirstResult((pageNumber - 1) * pageSize)
                                                                .setMaxResults(pageSize).getResultList();

        logger.debug("getAuctionBotHistory() exit.");

        return listAuctions;
    }

    /**
     * Returns a list of auction house market prices which the AH Bot uses as base to sell items.
     * @param pageNumber The page to visit.
     * @param pageSize The size of the page.
     * @param item The id of the item to retrieve.
     * @param auctionHouse The id of the concerned auction house.
     * @return The prices of auctions
     */
    @SuppressWarnings("unchecked")
    public List<AhbotPrice> getAuctionBotPrice(long item, long auctionHouse, int pageNumber, int pageSize) {
        logger.debug("getAuctionBotPrice() entry.");

        List<AhbotPrice> listPrices = em.createNamedQuery("AhbotPrice.findByItemAndAuctionHouse")
                                        .setParameter("item", item+"")
                                        .setParameter("auctionHouse", auctionHouse)
                                        .setFirstResult((pageNumber -1 ) * pageSize)
                                        .setMaxResults(pageSize).getResultList();

        logger.debug("getAuctionBotPrice() exit.");

        return listPrices;
    }

    /**
     * Returns a list of category multipliers stored in the database.
     * @return A list of AhbotCategory records.
     */
    @SuppressWarnings("unchecked")
    public List<AhbotCategory> getAuctionCategoryMultipliers() {
        logger.debug("getAuctionCategoryMultipliers() entry.");

        List<AhbotCategory> listCategories = em.createNamedQuery("AhbotCategory.findAll").getResultList();

        logger.debug("getAuctionCategoryMultipliers() exit.");

        return listCategories;
    }
}
