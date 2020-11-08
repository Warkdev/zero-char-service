package eu.getmangos.entities;

import java.io.Serializable;
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
    @NamedQuery(name = "CharacterAction.findByGuid", query = "SELECT c FROM CharacterAction c WHERE c.characterActionPK.guid = :guid"),
    @NamedQuery(name = "CharacterAction.findByButton", query = "SELECT c FROM CharacterAction c WHERE c.characterActionPK.button = :button"),
    @NamedQuery(name = "CharacterAction.findByAction", query = "SELECT c FROM CharacterAction c WHERE c.action = :action"),
    @NamedQuery(name = "CharacterAction.findByType", query = "SELECT c FROM CharacterAction c WHERE c.type = :type")})
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