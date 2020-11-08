package eu.getmangos.entities;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * Grid Loading System
 */
@Data
@Entity(name = "eu.getmangos.entities.CreatureRespawn")
@Table(name = "creature_respawn")
@IdClass(CreatureRespawn.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "CreatureRespawn.findAll", query = "SELECT c FROM CreatureRespawn c"),
    @NamedQuery(name = "CreatureRespawn.findByGuid", query = "SELECT c FROM CreatureRespawn c WHERE c.creatureRespawnPK.guid = :guid"),
    @NamedQuery(name = "CreatureRespawn.findByRespawntime", query = "SELECT c FROM CreatureRespawn c WHERE c.respawntime = :respawntime"),
    @NamedQuery(name = "CreatureRespawn.findByInstance", query = "SELECT c FROM CreatureRespawn c WHERE c.creatureRespawnPK.instance = :instance")})
public class CreatureRespawn {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Integer instance;
  }

  /**
   * Global Unique Identifier
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * Time till the creature should respawn.
   */
  @Column(name = "respawntime", nullable = false)
  private Long respawntime;
  /**
   * Instance ID of the instance the creature is respawning into.
   */
  @Id
  @Column(name = "instance", nullable = false)
  private Integer instance;
}