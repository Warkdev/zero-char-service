package eu.getmangos.entities;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.PetSpellCooldown")
@Table(name = "pet_spell_cooldown")
@IdClass(PetSpellCooldown.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "PetSpellCooldown.findAll", query = "SELECT p FROM PetSpellCooldown p"),
    @NamedQuery(name = "PetSpellCooldown.findByGuid", query = "SELECT p FROM PetSpellCooldown p WHERE p.petSpellCooldownPK.guid = :guid"),
    @NamedQuery(name = "PetSpellCooldown.findBySpell", query = "SELECT p FROM PetSpellCooldown p WHERE p.petSpellCooldownPK.spell = :spell"),
    @NamedQuery(name = "PetSpellCooldown.findByTime", query = "SELECT p FROM PetSpellCooldown p WHERE p.time = :time")})
public class PetSpellCooldown {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Integer spell;
  }

  /**
   * The GUID of the pet. (See character_pet.id)
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The spell ID to which the cooldown applies.
   */
  @Id
  @Column(name = "spell", nullable = false)
  private Integer spell;
  /**
   * The time when the cooldown expires, in Unix time.
   */
  @Column(name = "time", nullable = false)
  private Long time;
}