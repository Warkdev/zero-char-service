package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.PetSpellCooldown")
@Table(name = "pet_spell_cooldown")
@IdClass(PetSpellCooldown.PrimaryKeys.class)
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