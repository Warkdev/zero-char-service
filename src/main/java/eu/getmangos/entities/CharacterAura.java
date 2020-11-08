package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterAura")
@Table(name = "character_aura")
@IdClass(CharacterAura.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "CharacterAura.findAll", query = "SELECT c FROM CharacterAura c"),
    @NamedQuery(name = "CharacterAura.findById", query = "SELECT c FROM CharacterAura c where c.id = :id")
})
public class CharacterAura {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Long casterGuid;
    private Integer itemGuid;
    private Integer spell;
  }

  /**
   * The GUID (Full Global Unique Identifier) of the target affected by the aura.
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The GUID (Global Unique Identifier) of the player who cast the aura.
   */
  @Id
  @Column(name = "caster_guid", nullable = false)
  private Long casterGuid;
  /**
   * The GUID (Global Unique Identifier) of the item which casted the aura.
   */
  @Id
  @Column(name = "item_guid", nullable = false)
  private Integer itemGuid;
  /**
   * The spell from which the aura was applied. (See Spell.dbc)
   */
  @Id
  @Column(name = "spell", nullable = false)
  private Integer spell;
  /**
   * Determines how many stacks of the spell the character has.
   */
  @Column(name = "stackcount", nullable = false)
  private Integer stackcount;
  /**
   * The number of charges remaining on the aura.
   */
  @Column(name = "remaincharges", nullable = false)
  private Integer remaincharges;
  /**
   * Primary effect.
   */
  @Column(name = "basepoints0", nullable = false)
  private Integer basepoints0;
  /**
   * Secondary effect (healing)
   */
  @Column(name = "basepoints1", nullable = false)
  private Integer basepoints1;
  /**
   * Secondary effect (damage)
   */
  @Column(name = "basepoints2", nullable = false)
  private Integer basepoints2;
  /**
   * Primary effect over time counter.
   */
  @Column(name = "periodictime0", nullable = false)
  private Integer periodictime0;
  /**
   * Primary effect (healing) over time counter.
   */
  @Column(name = "periodictime1", nullable = false)
  private Integer periodictime1;
  /**
   * Primary effect (damage) over time counter.
   */
  @Column(name = "periodictime2", nullable = false)
  private Integer periodictime2;
  /**
   * The maximum duration of the aura.
   */
  @Column(name = "maxduration", nullable = false)
  private Integer maxduration;
  /**
   * The time remaining in seconds on the aura. -1 means that the aura is indefinite.
   */
  @Column(name = "remaintime", nullable = false)
  private Integer remaintime;
  /**
   * The effect index of the spell from which the aura came from.
   */
  @Column(name = "effIndexMask", nullable = false)
  private Integer effindexmask;
}