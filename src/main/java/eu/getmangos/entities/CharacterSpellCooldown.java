package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.CharacterSpellCooldown")
@Table(name = "character_spell_cooldown")
@IdClass(CharacterSpellCooldown.PrimaryKeys.class)
public class CharacterSpellCooldown {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Integer spell;
  }

  /**
   * The GUID (Global Unique Identifier, Low part) of the character.
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
   * If the spell was casted from an item, the item ID (Item Identifier).
   */
  @Column(name = "item", nullable = false)
  private Integer item;
  /**
   * The time when the spell cooldown will finish, measured in Unix Time.
   */
  @Column(name = "time", nullable = false)
  private Long time;
}