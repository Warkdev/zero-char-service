package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Groups
 */
@Data
@Entity(name = "eu.getmangos.entities.Groups")
@Table(name = "groups")
public class Groups {

  /**
   * Uniquie ID for the group.
   */
  @Id
  @Column(name = "groupId", nullable = false)
  private Integer groupid;
  /**
   * Guid of the group's leader
   */
  @Column(name = "leaderGuid", nullable = false)
  private Integer leaderguid;
  /**
   * Guid of the character who is that main tank.
   */
  @Column(name = "mainTank", nullable = false)
  private Integer maintank;
  /**
   * Guid of the character who is that main assist.
   */
  @Column(name = "mainAssistant", nullable = false)
  private Integer mainassistant;
  /**
   * This is the loot method used by the group.
   */
  @Column(name = "lootMethod", nullable = false)
  private Byte lootmethod;
  /**
   * Guid of the character who retrieves the loot.
   */
  @Column(name = "looterGuid", nullable = false)
  private Integer looterguid;
  /**
   * The quality of the items in the loot to be rolled for.
   */
  @Column(name = "lootThreshold", nullable = false)
  private Byte lootthreshold;
  /**
   * Guid of the target that has the star raid target on it.
   */
  @Column(name = "icon1", nullable = false)
  private Integer icon1;
  /**
   * Guid of the target that has the circle raid target on it.
   */
  @Column(name = "icon2", nullable = false)
  private Integer icon2;
  /**
   * Guid of target that has the dimond raid target on it.
   */
  @Column(name = "icon3", nullable = false)
  private Integer icon3;
  /**
   * Guid of the target that has the triangler raid target on it.
   */
  @Column(name = "icon4", nullable = false)
  private Integer icon4;
  /**
   * Guid of the target that has the moon raid target on it.
   */
  @Column(name = "icon5", nullable = false)
  private Integer icon5;
  /**
   * Guid of the target that has the square raid target on it.
   */
  @Column(name = "icon6", nullable = false)
  private Integer icon6;
  /**
   * Guid of the target that has the cross raid target on it.
   */
  @Column(name = "icon7", nullable = false)
  private Integer icon7;
  /**
   * Guid of the target that has the skull raid target on it.
   */
  @Column(name = "icon8", nullable = false)
  private Integer icon8;
  /**
   * Flag set for if group is part of a raid or not.
   */
  @Column(name = "isRaid", nullable = false)
  private boolean israid;
}