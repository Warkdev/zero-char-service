package eu.getmangos.entities;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterQueststatus")
@Table(name = "character_queststatus")
@IdClass(CharacterQueststatus.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "CharacterQueststatus.findAll", query = "SELECT c FROM CharacterQueststatus c"),
    @NamedQuery(name = "CharacterQueststatus.findByGuid", query = "SELECT c FROM CharacterQueststatus c WHERE c.characterQueststatusPK.guid = :guid"),
    @NamedQuery(name = "CharacterQueststatus.findByQuest", query = "SELECT c FROM CharacterQueststatus c WHERE c.characterQueststatusPK.quest = :quest"),
    @NamedQuery(name = "CharacterQueststatus.findByStatus", query = "SELECT c FROM CharacterQueststatus c WHERE c.status = :status"),
    @NamedQuery(name = "CharacterQueststatus.findByRewarded", query = "SELECT c FROM CharacterQueststatus c WHERE c.rewarded = :rewarded"),
    @NamedQuery(name = "CharacterQueststatus.findByExplored", query = "SELECT c FROM CharacterQueststatus c WHERE c.explored = :explored"),
    @NamedQuery(name = "CharacterQueststatus.findByTimer", query = "SELECT c FROM CharacterQueststatus c WHERE c.timer = :timer"),
    @NamedQuery(name = "CharacterQueststatus.findByMobcount1", query = "SELECT c FROM CharacterQueststatus c WHERE c.mobcount1 = :mobcount1"),
    @NamedQuery(name = "CharacterQueststatus.findByMobcount2", query = "SELECT c FROM CharacterQueststatus c WHERE c.mobcount2 = :mobcount2"),
    @NamedQuery(name = "CharacterQueststatus.findByMobcount3", query = "SELECT c FROM CharacterQueststatus c WHERE c.mobcount3 = :mobcount3"),
    @NamedQuery(name = "CharacterQueststatus.findByMobcount4", query = "SELECT c FROM CharacterQueststatus c WHERE c.mobcount4 = :mobcount4"),
    @NamedQuery(name = "CharacterQueststatus.findByItemcount1", query = "SELECT c FROM CharacterQueststatus c WHERE c.itemcount1 = :itemcount1"),
    @NamedQuery(name = "CharacterQueststatus.findByItemcount2", query = "SELECT c FROM CharacterQueststatus c WHERE c.itemcount2 = :itemcount2"),
    @NamedQuery(name = "CharacterQueststatus.findByItemcount3", query = "SELECT c FROM CharacterQueststatus c WHERE c.itemcount3 = :itemcount3"),
    @NamedQuery(name = "CharacterQueststatus.findByItemcount4", query = "SELECT c FROM CharacterQueststatus c WHERE c.itemcount4 = :itemcount4")})
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