package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Used DB version notes
 */
@Data
@Entity(name = "eu.getmangos.entities.DbVersion")
@Table(name = "db_version")
@IdClass(DbVersion.PrimaryKeys.class)
public class DbVersion {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer version;
    private Integer structure;
    private Integer content;
  }

  /**
   * The Version of the Release
   */
  @Id
  @Column(name = "version", nullable = false)
  private Integer version;
  /**
   * The current core structure level.
   */
  @Id
  @Column(name = "structure", nullable = false)
  private Integer structure;
  /**
   * The current core content level.
   */
  @Id
  @Column(name = "content", nullable = false)
  private Integer content;
  /**
   * A short description of the latest database revision.
   */
  @Column(name = "description", nullable = false)
  private String description;
  /**
   * A comment about the latest database revision.
   */
  @Column(name = "comment", nullable = true)
  private String comment;
}