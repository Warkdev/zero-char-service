package eu.getmangos.entities;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.AhbotHistory")
@Table(name = "ahbot_history")
@NamedQueries({
    @NamedQuery(name = "AhbotHistory.findAll", query = "SELECT a FROM AhbotHistory a"),
    @NamedQuery(name = "AhbotHistory.findById", query = "SELECT a FROM AhbotHistory a WHERE a.id = :id"),
    @NamedQuery(name = "AhbotHistory.findByBuytime", query = "SELECT a FROM AhbotHistory a WHERE a.buytime = :buytime"),
    @NamedQuery(name = "AhbotHistory.findByItem", query = "SELECT a FROM AhbotHistory a WHERE a.item = :item"),
    @NamedQuery(name = "AhbotHistory.findByBid", query = "SELECT a FROM AhbotHistory a WHERE a.bid = :bid"),
    @NamedQuery(name = "AhbotHistory.findByBuyout", query = "SELECT a FROM AhbotHistory a WHERE a.buyout = :buyout"),
    @NamedQuery(name = "AhbotHistory.findByWon", query = "SELECT a FROM AhbotHistory a WHERE a.won = :won"),
    @NamedQuery(name = "AhbotHistory.findByCategory", query = "SELECT a FROM AhbotHistory a WHERE a.category = :category"),
    @NamedQuery(name = "AhbotHistory.findByAuctionHouse", query = "SELECT a FROM AhbotHistory a WHERE a.auctionHouse = :auctionHouse")})
public class AhbotHistory {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
  @Column(name = "buytime", nullable = false)
  private Long buytime;
  @Column(name = "item", nullable = false)
  private Long item;
  @Column(name = "bid", nullable = false)
  private Long bid;
  @Column(name = "buyout", nullable = false)
  private Long buyout;
  @Column(name = "won", nullable = false)
  private Long won;
  /**
   * An Item category Id from the list below:
   */
  @Column(name = "category", nullable = true)
  private String category;
  @Column(name = "auction_house", nullable = false)
  private Long auctionHouse;
}