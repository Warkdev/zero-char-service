package eu.getmangos.entities;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterReputation")
@Table(name = "character_reputation")
@IdClass(CharacterReputation.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "CharacterReputation.findAll", query = "SELECT c FROM CharacterReputation c"),
    @NamedQuery(name = "CharacterReputation.findByGuid", query = "SELECT c FROM CharacterReputation c WHERE c.characterReputationPK.guid = :guid"),
    @NamedQuery(name = "CharacterReputation.findByFaction", query = "SELECT c FROM CharacterReputation c WHERE c.characterReputationPK.faction = :faction"),
    @NamedQuery(name = "CharacterReputation.findByStanding", query = "SELECT c FROM CharacterReputation c WHERE c.standing = :standing"),
    @NamedQuery(name = "CharacterReputation.findByFlags", query = "SELECT c FROM CharacterReputation c WHERE c.flags = :flags")})
public class CharacterReputation {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Integer faction;
  }

  /**
   * The GUID of the character. (See character.guid).
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The faction ID that the character has the given reputation in (See Faction.dbc).
   */
  @Id
  @Column(name = "faction", nullable = false)
  private Integer faction;
  /**
   * The current reputation value that the character has.
   */
  @Column(name = "standing", nullable = false)
  private Integer standing;
  /**
   * This field is a bitmask containing flags that apply to the faction.
   */
  @Column(name = "flags", nullable = false)
  private Integer flags;
}