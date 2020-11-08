package eu.getmangos.entities;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

/**
 * Guild Eventlog
 */
@Data
@Entity(name = "eu.getmangos.entities.GuildEventlog")
@Table(name = "guild_eventlog")
@IdClass(GuildEventlog.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "GuildEventlog.findAll", query = "SELECT g FROM GuildEventlog g"),
    @NamedQuery(name = "GuildEventlog.findByGuildid", query = "SELECT g FROM GuildEventlog g WHERE g.guildEventlogPK.guildid = :guildid"),
    @NamedQuery(name = "GuildEventlog.findByLogGuid", query = "SELECT g FROM GuildEventlog g WHERE g.guildEventlogPK.logGuid = :logGuid"),
    @NamedQuery(name = "GuildEventlog.findByEventType", query = "SELECT g FROM GuildEventlog g WHERE g.eventType = :eventType"),
    @NamedQuery(name = "GuildEventlog.findByPlayerGuid1", query = "SELECT g FROM GuildEventlog g WHERE g.playerGuid1 = :playerGuid1"),
    @NamedQuery(name = "GuildEventlog.findByPlayerGuid2", query = "SELECT g FROM GuildEventlog g WHERE g.playerGuid2 = :playerGuid2"),
    @NamedQuery(name = "GuildEventlog.findByNewRank", query = "SELECT g FROM GuildEventlog g WHERE g.newRank = :newRank"),
    @NamedQuery(name = "GuildEventlog.findByTimeStamp", query = "SELECT g FROM GuildEventlog g WHERE g.timeStamp = :timeStamp")})
public class GuildEventlog {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guildid;
    private Integer logguid;
  }

  /**
   * Id of related guild. (See guild.guildid).
   */
  @Id
  @Column(name = "guildid", nullable = false)
  private Integer guildid;
  /**
   * A unique identifier given to each log entry to distinguish it.
   */
  @Id
  @Column(name = "LogGuid", nullable = false)
  private Integer logguid;
  /**
   * The Guild Event Type.
   */
  @Column(name = "EventType", nullable = false)
  private boolean eventtype;
  /**
   * Guid of character who made the change. (See character.guid)
   */
  @Column(name = "PlayerGuid1", nullable = false)
  private Integer playerguid1;
  /**
   * Guid of character who was changed. (See character.guid)
   */
  @Column(name = "PlayerGuid2", nullable = false)
  private Integer playerguid2;
  /**
   * Id of new rank of PlayerGuid2. (See guild_rank.rid)
   */
  @Column(name = "NewRank", nullable = false)
  private Byte newrank;
  /**
   * Unix timestamp of when the event happened.
   */
  @Column(name = "TimeStamp", nullable = false)
  private Long timestamp;
}