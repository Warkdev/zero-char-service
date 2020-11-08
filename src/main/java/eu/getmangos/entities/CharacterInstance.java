package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.CharacterInstance")
@Table(name = "character_instance")
@IdClass(CharacterInstance.PrimaryKeys.class)
public class CharacterInstance {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Integer instance;
  }

  /**
   * The GUID (Global Unique Identifier) of the character.
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The instance ID. (See instance.id).
   */
  @Id
  @Column(name = "instance", nullable = false)
  private Integer instance;
  /**
   * Boolean 0 or 1 controlling if the player has been bound to the instance.
   */
  @Column(name = "permanent", nullable = false)
  private boolean permanent;
}