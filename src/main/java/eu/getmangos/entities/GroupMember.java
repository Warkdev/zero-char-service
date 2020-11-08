package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Groups
 */
@Data
@Entity(name = "eu.getmangos.entities.GroupMember")
@Table(name = "group_member")
@IdClass(GroupMember.PrimaryKeys.class)
public class GroupMember {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer groupid;
    private Integer memberguid;
  }

  /**
   * The group ID from the groups table.
   */
  @Id
  @Column(name = "groupId", nullable = false)
  private Integer groupid;
  /**
   * The GUID of the character in the group.
   */
  @Id
  @Column(name = "memberGuid", nullable = false)
  private Integer memberguid;
  /**
   * Flag stating whether or not the character is the assist.
   */
  @Column(name = "assistant", nullable = false)
  private boolean assistant;
  /**
   * This is the group number within a raid (8 groups max)
   */
  @Column(name = "subgroup", nullable = false)
  private Short subgroup;
}