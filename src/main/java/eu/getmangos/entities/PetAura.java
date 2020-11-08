package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Pet System
 */
@Data
@Entity(name = "eu.getmangos.entities.PetAura")
@Table(name = "pet_aura")
@IdClass(PetAura.PrimaryKeys.class)
public class PetAura {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Long casterGuid;
    private Integer itemGuid;
    private Integer spell;
  }

  /**
   * The GUID of the target affected by the aura. (See character.guid)
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The GUID of the player or creature who casted the aura. (See character.guid)
   */
  @Id
  @Column(name = "caster_guid", nullable = false)
  private Long casterGuid;
  /**
   * Guid of the item that is casting the aura on the pet.
   */
  @Id
  @Column(name = "item_guid", nullable = false)
  private Integer itemGuid;
  /**
   * The spell from which the aura was applied. (See Spell.dbc column 1)
   */
  @Id
  @Column(name = "spell", nullable = false)
  private Integer spell;
  /**
   * This is the total number of times the aura can be stacked on the pet.
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
   * Secondary effect (appears to be only healing related)
   */
  @Column(name = "basepoints1", nullable = false)
  private Integer basepoints1;
  /**
   * Secondary effect (appears to be only damage related)
   */
  @Column(name = "basepoints2", nullable = false)
  private Integer basepoints2;
  /**
   * Primary effect over time.
   */
  @Column(name = "periodictime0", nullable = false)
  private Integer periodictime0;
  /**
   * Secondary effect (healing) over time
   */
  @Column(name = "periodictime1", nullable = false)
  private Integer periodictime1;
  /**
   * Secondary effect (damage) over time.
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