package eu.getmangos.entities;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

/**
 * Grid Loading System
 */
@Data
@Entity(name = "eu.getmangos.entities.GameobjectRespawn")
@Table(name = "gameobject_respawn")
@IdClass(GameobjectRespawn.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "GameobjectRespawn.findAll", query = "SELECT g FROM GameobjectRespawn g"),
    @NamedQuery(name = "GameobjectRespawn.findByGuid", query = "SELECT g FROM GameobjectRespawn g WHERE g.gameobjectRespawnPK.guid = :guid"),
    @NamedQuery(name = "GameobjectRespawn.findByRespawntime", query = "SELECT g FROM GameobjectRespawn g WHERE g.respawntime = :respawntime"),
    @NamedQuery(name = "GameobjectRespawn.findByInstance", query = "SELECT g FROM GameobjectRespawn g WHERE g.gameobjectRespawnPK.instance = :instance")})
public class GameobjectRespawn {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Integer instance;
  }

  /**
   * Global unique ID of the game object.
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * Time till the game object should respawn.
   */
  @Column(name = "respawntime", nullable = false)
  private Long respawntime;
  /**
   * Instance ID that the game object will spawn in.
   */
  @Id
  @Column(name = "instance", nullable = false)
  private Integer instance;
}