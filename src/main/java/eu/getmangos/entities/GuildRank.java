package eu.getmangos.entities;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

/**
 * Guild System
 */
@Data
@Entity(name = "eu.getmangos.entities.GuildRank")
@Table(name = "guild_rank")
@IdClass(GuildRank.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "GuildRank.findAll", query = "SELECT g FROM GuildRank g"),
    @NamedQuery(name = "GuildRank.findByGuildid", query = "SELECT g FROM GuildRank g WHERE g.guildRankPK.guildid = :guildid"),
    @NamedQuery(name = "GuildRank.findByRid", query = "SELECT g FROM GuildRank g WHERE g.guildRankPK.rid = :rid"),
    @NamedQuery(name = "GuildRank.findByRname", query = "SELECT g FROM GuildRank g WHERE g.rname = :rname"),
    @NamedQuery(name = "GuildRank.findByRights", query = "SELECT g FROM GuildRank g WHERE g.rights = :rights")})
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