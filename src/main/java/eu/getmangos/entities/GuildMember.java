package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Guild System
 */
@Data
@Entity(name = "eu.getmangos.entities.GuildMember")
@Table(name = "guild_member")
public class GuildMember {

  /**
   * The ID of the guild that the member is a part of. (See guild.guildid)
   */
  @Column(name = "guildid", nullable = false)
  private Integer guildid;
  /**
   * The GUID of the player. (See character.guid)
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The rank that the player has in the guild. (See guild_rank.rid)
   */
  @Column(name = "rank", nullable = false)
  private Byte rank;
  /**
   * The Player Note set by the player.
   */
  @Column(name = "pnote", nullable = false)
  private String pnote;
  /**
   * The Officers Note set by officers in the guild.
   */
  @Column(name = "offnote", nullable = false)
  private String offnote;
}