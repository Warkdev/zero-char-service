package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterBattlegroundData")
@Table(name = "character_battleground_data")
@NamedQueries({
    @NamedQuery(name = "CharacterBattlegroundData.findAll", query = "SELECT c FROM CharacterBattlegroundData c"),
    @NamedQuery(name = "CharacterBattlegroundData.findByGuid", query = "SELECT c FROM CharacterBattlegroundData c WHERE c.guid = :guid"),
    @NamedQuery(name = "CharacterBattlegroundData.findByInstanceId", query = "SELECT c FROM CharacterBattlegroundData c WHERE c.instanceId = :instanceId"),
    @NamedQuery(name = "CharacterBattlegroundData.findByTeam", query = "SELECT c FROM CharacterBattlegroundData c WHERE c.team = :team"),
    @NamedQuery(name = "CharacterBattlegroundData.findByJoinX", query = "SELECT c FROM CharacterBattlegroundData c WHERE c.joinX = :joinX"),
    @NamedQuery(name = "CharacterBattlegroundData.findByJoinY", query = "SELECT c FROM CharacterBattlegroundData c WHERE c.joinY = :joinY"),
    @NamedQuery(name = "CharacterBattlegroundData.findByJoinZ", query = "SELECT c FROM CharacterBattlegroundData c WHERE c.joinZ = :joinZ"),
    @NamedQuery(name = "CharacterBattlegroundData.findByJoinO", query = "SELECT c FROM CharacterBattlegroundData c WHERE c.joinO = :joinO"),
    @NamedQuery(name = "CharacterBattlegroundData.findByJoinMap", query = "SELECT c FROM CharacterBattlegroundData c WHERE c.joinMap = :joinMap")})
public class CharacterBattlegroundData {

  /**
   * The character battleground datar global unique identifier.
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The unique ID of the battleground instance the character has entered.
   */
  @Column(name = "instance_id", nullable = false)
  private Integer instanceId;
  /**
   * Neutral, Horde, or Alliance
   */
  @Column(name = "team", nullable = false)
  private Integer team;
  /**
   * The character's X coordinate in the battleground.
   */
  @Column(name = "join_x", nullable = false)
  private Float joinX;
  /**
   * The character's Y coordinate in the battleground.
   */
  @Column(name = "join_y", nullable = false)
  private Float joinY;
  /**
   * The character's Z coordinate in the battleground.
   */
  @Column(name = "join_z", nullable = false)
  private Float joinZ;
  /**
   * The character's orientation in the battleground.
   */
  @Column(name = "join_o", nullable = false)
  private Float joinO;
  /**
   * Battleground map ID where the character will spawn.
   */
  @Column(name = "join_map", nullable = false)
  private Integer joinMap;
}