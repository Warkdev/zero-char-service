package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.AhbotHistory")
@Table(name = "ahbot_history")
@NamedQueries({
    @NamedQuery(name = "AHBotHistory.findAll", query = "SELECT h FROM AHBotHistory h"),
    @NamedQuery(name = "AHBotHistory.findById", query = "SELECT h FROM AHBotHistory h where h.id = :id")
})
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