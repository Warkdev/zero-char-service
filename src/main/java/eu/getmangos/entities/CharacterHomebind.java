package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterHomebind")
@Table(name = "character_homebind")
@NamedQueries({
    @NamedQuery(name = "CharacterHomebind.findAll", query = "SELECT c FROM CharacterHomebind c"),
    @NamedQuery(name = "CharacterHomebind.findByGuid", query = "SELECT c FROM CharacterHomebind c WHERE c.guid = :guid"),
    @NamedQuery(name = "CharacterHomebind.findByMap", query = "SELECT c FROM CharacterHomebind c WHERE c.map = :map"),
    @NamedQuery(name = "CharacterHomebind.findByZone", query = "SELECT c FROM CharacterHomebind c WHERE c.zone = :zone"),
    @NamedQuery(name = "CharacterHomebind.findByPositionX", query = "SELECT c FROM CharacterHomebind c WHERE c.positionX = :positionX"),
    @NamedQuery(name = "CharacterHomebind.findByPositionY", query = "SELECT c FROM CharacterHomebind c WHERE c.positionY = :positionY"),
    @NamedQuery(name = "CharacterHomebind.findByPositionZ", query = "SELECT c FROM CharacterHomebind c WHERE c.positionZ = :positionZ")})
public class CharacterHomebind {

  /**
   * The GUID (Global Unique Identifier) of the character. (See character.guid).
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The Map Identifier where the character gets teleported to. (See Maps.dbc).
   */
  @Column(name = "map", nullable = false)
  private Integer map;
  /**
   * The Zone Identifier where the character gets teleported to.
   */
  @Column(name = "zone", nullable = false)
  private Integer zone;
  /**
   * The x position where the character gets teleported to.
   */
  @Column(name = "position_x", nullable = false)
  private Float positionX;
  /**
   * The y position where the character gets teleported to.
   */
  @Column(name = "position_y", nullable = false)
  private Float positionY;
  /**
   * The z position where the character gets teleported to.
   */
  @Column(name = "position_z", nullable = false)
  private Float positionZ;
}