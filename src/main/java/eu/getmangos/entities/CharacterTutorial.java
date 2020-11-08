package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterTutorial")
@Table(name = "character_tutorial")
@NamedQueries({
    @NamedQuery(name = "CharacterTutorial.findAll", query = "SELECT c FROM CharacterTutorial c"),
    @NamedQuery(name = "CharacterTutorial.findByAccount", query = "SELECT c FROM CharacterTutorial c WHERE c.account = :account"),
    @NamedQuery(name = "CharacterTutorial.findByTut0", query = "SELECT c FROM CharacterTutorial c WHERE c.tut0 = :tut0"),
    @NamedQuery(name = "CharacterTutorial.findByTut1", query = "SELECT c FROM CharacterTutorial c WHERE c.tut1 = :tut1"),
    @NamedQuery(name = "CharacterTutorial.findByTut2", query = "SELECT c FROM CharacterTutorial c WHERE c.tut2 = :tut2"),
    @NamedQuery(name = "CharacterTutorial.findByTut3", query = "SELECT c FROM CharacterTutorial c WHERE c.tut3 = :tut3"),
    @NamedQuery(name = "CharacterTutorial.findByTut4", query = "SELECT c FROM CharacterTutorial c WHERE c.tut4 = :tut4"),
    @NamedQuery(name = "CharacterTutorial.findByTut5", query = "SELECT c FROM CharacterTutorial c WHERE c.tut5 = :tut5"),
    @NamedQuery(name = "CharacterTutorial.findByTut6", query = "SELECT c FROM CharacterTutorial c WHERE c.tut6 = :tut6"),
    @NamedQuery(name = "CharacterTutorial.findByTut7", query = "SELECT c FROM CharacterTutorial c WHERE c.tut7 = :tut7")})
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