package eu.getmangos.entities;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterSpell")
@Table(name = "character_spell")
@IdClass(CharacterSpell.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "CharacterSpell.findAll", query = "SELECT c FROM CharacterSpell c"),
    @NamedQuery(name = "CharacterSpell.findByGuid", query = "SELECT c FROM CharacterSpell c WHERE c.characterSpellPK.guid = :guid"),
    @NamedQuery(name = "CharacterSpell.findBySpell", query = "SELECT c FROM CharacterSpell c WHERE c.characterSpellPK.spell = :spell"),
    @NamedQuery(name = "CharacterSpell.findByActive", query = "SELECT c FROM CharacterSpell c WHERE c.active = :active"),
    @NamedQuery(name = "CharacterSpell.findByDisabled", query = "SELECT c FROM CharacterSpell c WHERE c.disabled = :disabled")})
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