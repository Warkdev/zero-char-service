package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Guild System
 */
@Data
@Entity(name = "eu.getmangos.entities.GuildRank")
@Table(name = "guild_rank")
@IdClass(GuildRank.PrimaryKeys.class)
public class GuildRank {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guildid;
    private Integer rid;
  }

  /**
   * The guild ID that the rank is part of. (See guild.guildid)
   */
  @Id
  @Column(name = "guildid", nullable = false)
  private Integer guildid;
  /**
   * The particular rank ID. This number must be unique to each rank in a guild.
   */
  @Id
  @Column(name = "rid", nullable = false)
  private Integer rid;
  /**
   * The name of the rank that is displayed in-game.
   */
  @Column(name = "rname", nullable = false)
  private String rname;
  /**
   * The rights a player with this rank has in the guild.
   */
  @Column(name = "rights", nullable = false)
  private Integer rights;
}