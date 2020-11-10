package eu.getmangos.entities;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ahbot_category")
@NamedQueries({
    @NamedQuery(name = "AhbotCategory.findAll", query = "SELECT a FROM AhbotCategory a"),
    @NamedQuery(name = "AhbotCategory.findById", query = "SELECT a FROM AhbotCategory a WHERE a.id = :id"),
    @NamedQuery(name = "AhbotCategory.findByCategory", query = "SELECT a FROM AhbotCategory a WHERE a.category = :category"),
    @NamedQuery(name = "AhbotCategory.findByMultiplier", query = "SELECT a FROM AhbotCategory a WHERE a.multiplier = :multiplier"),
    @NamedQuery(name = "AhbotCategory.findByMaxAuctionCount", query = "SELECT a FROM AhbotCategory a WHERE a.maxAuctionCount = :maxAuctionCount"),
    @NamedQuery(name = "AhbotCategory.findByExpireTime", query = "SELECT a FROM AhbotCategory a WHERE a.expireTime = :expireTime")})
public class AhbotCategory {

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