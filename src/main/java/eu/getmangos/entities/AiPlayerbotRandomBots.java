package eu.getmangos.entities;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity
@Table(name = "ai_playerbot_random_bots")
@NamedQueries({
    @NamedQuery(name = "AiPlayerbotRandomBots.findAll", query = "SELECT a FROM AiPlayerbotRandomBots a WHERE a.event <> 'bot_count'"),
    @NamedQuery(name = "AiPlayerbotRandomBots.findBotEvents", query = "SELECT a FROM AiPlayerbotRandomBots a WHERE a.owner = :owner AND a.bot = :bot AND a.event <> 'bot_count'"),
    @NamedQuery(name = "AiPlayerbotRandomBots.findEventValue", query = "SELECT a FROM AiPlayerbotRandomBots a WHERE a.owner = :owner AND a.bot = :bot AND a.event = :event"),
    @NamedQuery(name = "AiPlayerbotRandomBots.reset", query = "DELETE FROM AiPlayerbotRandomBots")
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