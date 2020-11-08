package eu.getmangos.entities;

import javax.persistence.*;
import lombok.Data;

@Entity(name = "eu.getmangos.entities.AHbotCategory")
@Table(name = "ahbot_category")
@NamedQueries({
    @NamedQuery(name = "AHBotCat.findAll", query = "SELECT c FROM AHBotCategory c"),
    @NamedQuery(name = "AHBotCat.findById", query = "SELECT c FROM AHBotCategory c where c.id = :id")
})
public class AHbotCategory {

  /**
   * Unique identifier of the category
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
  /**
   * An Item category Id
   */
  @Column(name = "category", nullable = true)
  private String category;
  /**
   * The cost multiplier
   */
  @Column(name = "multiplier", nullable = false)
  private java.math.BigDecimal multiplier;
  /**
   * The max number of items of this category in the AH.
   */
  @Column(name = "max_auction_count", nullable = false)
  private Long maxAuctionCount;
  /**
   * The UNIX time when the item will expire.
   */
  @Column(name = "expire_time", nullable = false)
  private Long expireTime;
}