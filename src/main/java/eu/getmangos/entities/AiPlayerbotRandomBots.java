package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.AiPlayerbotRandomBots")
@Table(name = "ai_playerbot_random_bots")
@NamedQueries({
    @NamedQuery(name = "AIPlayerBotRandomBots.findAll", query = "SELECT ai FROM AIPlayerBotRandomBots ai"),
    @NamedQuery(name = "AIPlayerBotRandomBots.findById", query = "SELECT ai FROM AIPlayerBotRandomBots ai where ai.id = :id")
})
public class AiPlayerbotRandomBots {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
  @Column(name = "owner", nullable = false)
  private Long owner;
  @Column(name = "bot", nullable = false)
  private Long bot;
  @Column(name = "time", nullable = false)
  private Long time;
  @Column(name = "validIn", nullable = true)
  private Long validin;
  @Column(name = "event", nullable = true)
  private String event;
  @Column(name = "value", nullable = true)
  private Long value;
  @Column(name = "data", nullable = true)
  private String data;
}