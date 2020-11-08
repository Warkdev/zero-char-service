package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterTutorial")
@Table(name = "character_tutorial")
public class CharacterTutorial {

  /**
   * The account id of the user. (See account.id).
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "account", nullable = false)
  private Long account;
  /**
   * These values are 32bits flags.
   */
  @Column(name = "tut0", nullable = false)
  private Integer tut0;
  /**
   * These values are 32bits flags.
   */
  @Column(name = "tut1", nullable = false)
  private Integer tut1;
  /**
   * These values are 32bits flags.
   */
  @Column(name = "tut2", nullable = false)
  private Integer tut2;
  /**
   * These values are 32bits flags.
   */
  @Column(name = "tut3", nullable = false)
  private Integer tut3;
  /**
   * These values are 32bits flags.
   */
  @Column(name = "tut4", nullable = false)
  private Integer tut4;
  /**
   * These values are 32bits flags.
   */
  @Column(name = "tut5", nullable = false)
  private Integer tut5;
  /**
   * These values are 32bits flags.
   */
  @Column(name = "tut6", nullable = false)
  private Integer tut6;
  /**
   * These values are 32bits flags.
   */
  @Column(name = "tut7", nullable = false)
  private Integer tut7;
}