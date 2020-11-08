package eu.getmangos.entities;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterHonorCp")
@Table(name = "character_honor_cp")
@IdClass(CharacterHonorCp.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "CharacterHonorCp.findAll", query = "SELECT c FROM CharacterHonorCp c"),
    @NamedQuery(name = "CharacterHonorCp.findByGuid", query = "SELECT c FROM CharacterHonorCp c WHERE c.characterHonorCpPK.guid = :guid"),
    @NamedQuery(name = "CharacterHonorCp.findByVictimType", query = "SELECT c FROM CharacterHonorCp c WHERE c.victimType = :victimType"),
    @NamedQuery(name = "CharacterHonorCp.findByVictim", query = "SELECT c FROM CharacterHonorCp c WHERE c.characterHonorCpPK.victim = :victim"),
    @NamedQuery(name = "CharacterHonorCp.findByHonor", query = "SELECT c FROM CharacterHonorCp c WHERE c.honor = :honor"),
    @NamedQuery(name = "CharacterHonorCp.findByDate", query = "SELECT c FROM CharacterHonorCp c WHERE c.characterHonorCpPK.date = :date"),
    @NamedQuery(name = "CharacterHonorCp.findByType", query = "SELECT c FROM CharacterHonorCp c WHERE c.type = :type"),
    @NamedQuery(name = "CharacterHonorCp.findByUsed", query = "SELECT c FROM CharacterHonorCp c WHERE c.used = :used")})
public class CharacterHonorCp {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Integer victim;
    private Integer date;
  }

  /**
   * The global unique identifier player character (victor)
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * This appears to be 4 for a player and 3 for an NPC.
   */
  @Column(name = "victim_type", nullable = false)
  private Byte victimType;
  /**
   * The global unique identifier player character (victim)
   */
  @Id
  @Column(name = "victim", nullable = false)
  private Integer victim;
  /**
   * Amount of honor earned for the honor kill.
   */
  @Column(name = "honor", nullable = false)
  private Float honor;
  /**
   * The date the honor kill occured.
   */
  @Id
  @Column(name = "date", nullable = false)
  private Integer date;
  /**
   * The is appears to be 1 for player and 2 for NPC.
   */
  @Column(name = "type", nullable = false)
  private Byte type;
  /**
   * =1 if already counted in rank points
   */
  @Column(name = "used", nullable = false)
  private boolean used;
}