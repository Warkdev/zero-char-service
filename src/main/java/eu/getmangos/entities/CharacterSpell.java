package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterSpell")
@Table(name = "character_spell")
@IdClass(CharacterSpell.PrimaryKeys.class)
public class CharacterSpell {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Integer spell;
  }

  /**
   * The GUID (Global Unique Identifier) of the character. (See character.guid).
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The spell ID (Spell Identifier). (See Spell.dbc)
   */
  @Id
  @Column(name = "spell", nullable = false)
  private Integer spell;
  /**
   * Boolean 1 or 0 signifying whether the spell is active (appears in the spell book
   */
  @Column(name = "active", nullable = false)
  private Byte active;
  /**
   * Boolean flag 0 or 1 when spell is disabled because of talents.
   */
  @Column(name = "disabled", nullable = false)
  private Byte disabled;
}