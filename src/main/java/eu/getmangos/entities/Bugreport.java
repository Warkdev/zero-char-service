package eu.getmangos.entities;

import javax.persistence.*;
import lombok.Data;

/**
 * Debug System
 */
@Data
@Entity
@Table(name = "bugreport")
@NamedQueries({
    @NamedQuery(name = "Bugreport.findAll", query = "SELECT b FROM Bugreport b"),
    @NamedQuery(name = "Bugreport.findById", query = "SELECT b FROM Bugreport b WHERE b.id = :id")})
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