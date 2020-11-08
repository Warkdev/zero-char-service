package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Grid Loading System
 */
@Data
@Entity(name = "eu.getmangos.entities.GameobjectRespawn")
@Table(name = "gameobject_respawn")
@IdClass(GameobjectRespawn.PrimaryKeys.class)
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