package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Debug System
 */
@Data
@Entity(name = "eu.getmangos.entities.Bugreport")
@Table(name = "bugreport")
@NamedQueries({
    @NamedQuery(name = "BugReport.findAll", query = "SELECT b FROM BugReport b"),
    @NamedQuery(name = "BugReport.findById", query = "SELECT b FROM BugReport b where b.id = :id")
})
public class Bugreport {

  /**
   * Auto generated value when records are inserted by the core.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;
  /**
   * The text description of the type of bug report / suggestion.
   */
  @Column(name = "type", nullable = false)
  private String type;
  /**
   * The text content of the bug/suggestion.
   */
  @Column(name = "content", nullable = false)
  private String content;
}