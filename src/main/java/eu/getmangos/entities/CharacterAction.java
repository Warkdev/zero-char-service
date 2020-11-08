package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterAction")
@Table(name = "character_action")
@IdClass(CharacterAction.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "CharacterAction.findAll", query = "SELECT c FROM CharacterAction c"),
    @NamedQuery(name = "CharacterAction.findById", query = "SELECT c FROM CharacterAction c where c.id = :id")
})
public class CharacterAction {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Byte button;
  }

  /**
   * The GUID of the character (See character.id).
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The ID of the button on the action bar where the action icon will be placed.
   */
  @Id
  @Column(name = "button", nullable = false)
  private Byte button;
  /**
   * Depending on the type value, this could be various values.
   */
  @Column(name = "action", nullable = false)
  private Integer action;
  /**
   * The type of action.
   */
  @Column(name = "type", nullable = false)
  private Byte type;
}