package eu.getmangos.entities;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ahbot_price")
@NamedQueries({
    @NamedQuery(name = "AhbotPrice.findAll", query = "SELECT a FROM AhbotPrice a"),
    @NamedQuery(name = "AhbotPrice.findById", query = "SELECT a FROM AhbotPrice a WHERE a.id = :id"),
    @NamedQuery(name = "AhbotPrice.findByItemAndAuctionHouse", query = "SELECT a FROM AhbotPrice a WHERE a.item = :item AND a.auctionHouse = :auctionHouse"),
    @NamedQuery(name = "AhbotPrice.findByItem", query = "SELECT a FROM AhbotPrice a WHERE a.item = :item"),
    @NamedQuery(name = "AhbotPrice.findByPrice", query = "SELECT a FROM AhbotPrice a WHERE a.price = :price"),
    @NamedQuery(name = "AhbotPrice.findByAuctionHouse", query = "SELECT a FROM AhbotPrice a WHERE a.auctionHouse = :auctionHouse")})
public class AhbotPrice {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
  @Column(name = "item", nullable = true)
  private String item;
  @Column(name = "price", nullable = false)
  private java.math.BigDecimal price;
  @Column(name = "auction_house", nullable = false)
  private Long auctionHouse;
}