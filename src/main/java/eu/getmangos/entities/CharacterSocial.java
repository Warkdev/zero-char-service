package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterSocial")
@Table(name = "character_social")
@IdClass(CharacterSocial.PrimaryKeys.class)
public class CharacterSocial {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Integer friend;
    private boolean flags;
  }

  /**
   * The GUID of the character. (See character.guid)
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The GUID of the friend/ignored. (See character.guid)
   */
  @Id
  @Column(name = "friend", nullable = false)
  private Integer friend;
  /**
   * Whether the character is a friend or ignored.
   */
  @Id
  @Column(name = "flags", nullable = false)
  private boolean flags;
}