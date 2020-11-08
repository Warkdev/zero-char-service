package eu.getmangos.entities;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.AiPlayerbotRandomBots")
@Table(name = "ai_playerbot_random_bots")
@NamedQueries({
    @NamedQuery(name = "AiPlayerbotRandomBots.findAll", query = "SELECT a FROM AiPlayerbotRandomBots a"),
    @NamedQuery(name = "AiPlayerbotRandomBots.findById", query = "SELECT a FROM AiPlayerbotRandomBots a WHERE a.id = :id"),
    @NamedQuery(name = "AiPlayerbotRandomBots.findByOwner", query = "SELECT a FROM AiPlayerbotRandomBots a WHERE a.owner = :owner"),
    @NamedQuery(name = "AiPlayerbotRandomBots.findByBot", query = "SELECT a FROM AiPlayerbotRandomBots a WHERE a.bot = :bot"),
    @NamedQuery(name = "AiPlayerbotRandomBots.findByTime", query = "SELECT a FROM AiPlayerbotRandomBots a WHERE a.time = :time"),
    @NamedQuery(name = "AiPlayerbotRandomBots.findByValidIn", query = "SELECT a FROM AiPlayerbotRandomBots a WHERE a.validIn = :validIn"),
    @NamedQuery(name = "AiPlayerbotRandomBots.findByEvent", query = "SELECT a FROM AiPlayerbotRandomBots a WHERE a.event = :event"),
    @NamedQuery(name = "AiPlayerbotRandomBots.findByValue", query = "SELECT a FROM AiPlayerbotRandomBots a WHERE a.value = :value"),
    @NamedQuery(name = "AiPlayerbotRandomBots.findByData", query = "SELECT a FROM AiPlayerbotRandomBots a WHERE a.data = :data")})
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