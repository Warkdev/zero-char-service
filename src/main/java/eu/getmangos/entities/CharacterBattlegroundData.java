package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterBattlegroundData")
@Table(name = "character_battleground_data")
public class CharacterBattlegroundData {

  /**
   * The character battleground datar global unique identifier.
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The unique ID of the battleground instance the character has entered.
   */
  @Column(name = "instance_id", nullable = false)
  private Integer instanceId;
  /**
   * Neutral, Horde, or Alliance
   */
  @Column(name = "team", nullable = false)
  private Integer team;
  /**
   * The character's X coordinate in the battleground.
   */
  @Column(name = "join_x", nullable = false)
  private Float joinX;
  /**
   * The character's Y coordinate in the battleground.
   */
  @Column(name = "join_y", nullable = false)
  private Float joinY;
  /**
   * The character's Z coordinate in the battleground.
   */
  @Column(name = "join_z", nullable = false)
  private Float joinZ;
  /**
   * The character's orientation in the battleground.
   */
  @Column(name = "join_o", nullable = false)
  private Float joinO;
  /**
   * Battleground map ID where the character will spawn.
   */
  @Column(name = "join_map", nullable = false)
  private Integer joinMap;
}