package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Pet System
 */
@Data
@Entity(name = "eu.getmangos.entities.PetSpell")
@Table(name = "pet_spell")
@IdClass(PetSpell.PrimaryKeys.class)
public class PetSpell {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Integer spell;
  }

  /**
   * The pet GUID. (See character_pet.id).
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The spell ID. See (Spell.dbc)
   */
  @Id
  @Column(name = "spell", nullable = false)
  private Integer spell;
  /**
   * Boolean 0 or 1 controlling if the spell is active or not.
   */
  @Column(name = "active", nullable = false)
  private Integer active;
}