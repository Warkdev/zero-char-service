package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.AhbotPrice")
@Table(name = "ahbot_price")
@NamedQueries({
    @NamedQuery(name = "AHBotPrice.findAll", query = "SELECT p FROM AHBotPrice p"),
    @NamedQuery(name = "AHBotPrice.findById", query = "SELECT p FROM AHBotPrice p where p.id = :id")
})
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