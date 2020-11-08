package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.GroupInstance")
@Table(name = "group_instance")
@IdClass(GroupInstance.PrimaryKeys.class)
public class GroupInstance {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer leaderguid;
    private Integer instance;
  }

  /**
   * The Guid of the group leader. (See characters.guid)
   */
  @Id
  @Column(name = "leaderGuid", nullable = false)
  private Integer leaderguid;
  /**
   * ID of the Instance session the group has enterd.
   */
  @Id
  @Column(name = "instance", nullable = false)
  private Integer instance;
  /**
   * Boolean flag if the group is bound to the Instance or not
   */
  @Column(name = "permanent", nullable = false)
  private boolean permanent;
}