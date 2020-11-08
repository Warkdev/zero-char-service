package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterQueststatus")
@Table(name = "character_queststatus")
@IdClass(CharacterQueststatus.PrimaryKeys.class)
public class CharacterQueststatus {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Integer quest;
  }

  /**
   * The GUID of the character. (See character.guid).
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The quest ID. (See quest_template.entry).
   */
  @Id
  @Column(name = "quest", nullable = false)
  private Integer quest;
  /**
   * The current quest status.
   */
  @Column(name = "status", nullable = false)
  private Integer status;
  /**
   * Boolean 1 or 0 representing whether the quest has been rewarded or not.
   */
  @Column(name = "rewarded", nullable = false)
  private boolean rewarded;
  /**
   * Boolean 1 or 0 representing if the character has explored what was needed.
   */
  @Column(name = "explored", nullable = false)
  private boolean explored;
  /**
   * Remaining time left on the quest if the quest has a timer (See quest_template).
   */
  @Column(name = "timer", nullable = false)
  private Long timer;
  /**
   * Current count of the first number of kills or casts.
   */
  @Column(name = "mobcount1", nullable = false)
  private Integer mobcount1;
  /**
   * Current count of the second number of kills or casts.
   */
  @Column(name = "mobcount2", nullable = false)
  private Integer mobcount2;
  /**
   * Current count of the third number of kills or casts.
   */
  @Column(name = "mobcount3", nullable = false)
  private Integer mobcount3;
  /**
   * Current count of the forth number of kills or casts.
   */
  @Column(name = "mobcount4", nullable = false)
  private Integer mobcount4;
  /**
   * Current item count for the first item in a delivery quest, if any.
   */
  @Column(name = "itemcount1", nullable = false)
  private Integer itemcount1;
  /**
   * Current item count for the second item in a delivery quest, if any.
   */
  @Column(name = "itemcount2", nullable = false)
  private Integer itemcount2;
  /**
   * Current item count for the third item in a delivery quest, if any.
   */
  @Column(name = "itemcount3", nullable = false)
  private Integer itemcount3;
  /**
   * Current item count for the forth item in a delivery quest, if any.
   */
  @Column(name = "itemcount4", nullable = false)
  private Integer itemcount4;
}