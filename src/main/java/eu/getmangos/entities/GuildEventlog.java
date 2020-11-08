package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Guild Eventlog
 */
@Data
@Entity(name = "eu.getmangos.entities.GuildEventlog")
@Table(name = "guild_eventlog")
@IdClass(GuildEventlog.PrimaryKeys.class)
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