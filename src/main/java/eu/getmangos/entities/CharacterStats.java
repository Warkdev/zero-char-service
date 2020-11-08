package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.CharacterStats")
@Table(name = "character_stats")
public class CharacterStats {

  /**
   * The guid of the character. (See character.guid).
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * Maximum amount of health that the character has.
   */
  @Column(name = "maxhealth", nullable = false)
  private Integer maxhealth;
  /**
   * Max Mana
   */
  @Column(name = "maxpower1", nullable = false)
  private Integer maxpower1;
  /**
   * Max Rage
   */
  @Column(name = "maxpower2", nullable = false)
  private Integer maxpower2;
  /**
   * Max Focus
   */
  @Column(name = "maxpower3", nullable = false)
  private Integer maxpower3;
  /**
   * Max Energy
   */
  @Column(name = "maxpower4", nullable = false)
  private Integer maxpower4;
  /**
   * Max Happiness
   */
  @Column(name = "maxpower5", nullable = false)
  private Integer maxpower5;
  /**
   * Max Rune
   */
  @Column(name = "maxpower6", nullable = false)
  private Integer maxpower6;
  /**
   * Max Runic Power
   */
  @Column(name = "maxpower7", nullable = false)
  private Integer maxpower7;
  /**
   * Character's current strength value.
   */
  @Column(name = "strength", nullable = false)
  private Integer strength;
  /**
   * Character's current agility value
   */
  @Column(name = "agility", nullable = false)
  private Integer agility;
  /**
   * Character's current stamina value.
   */
  @Column(name = "stamina", nullable = false)
  private Integer stamina;
  /**
   * Character's current intellect value.
   */
  @Column(name = "intellect", nullable = false)
  private Integer intellect;
  /**
   * Character's current spirit value.
   */
  @Column(name = "spirit", nullable = false)
  private Integer spirit;
  /**
   * Character's current armor value.
   */
  @Column(name = "armor", nullable = false)
  private Integer armor;
  /**
   * Character's current holy resistance value.
   */
  @Column(name = "resHoly", nullable = false)
  private Integer resholy;
  /**
   * Character's current fire resistance value.
   */
  @Column(name = "resFire", nullable = false)
  private Integer resfire;
  /**
   * Character's current nature resistance value.
   */
  @Column(name = "resNature", nullable = false)
  private Integer resnature;
  /**
   * Character's current frost resistance value.
   */
  @Column(name = "resFrost", nullable = false)
  private Integer resfrost;
  /**
   * Character's current shadow resistance value.
   */
  @Column(name = "resShadow", nullable = false)
  private Integer resshadow;
  /**
   * Character's current arcane resistance value.
   */
  @Column(name = "resArcane", nullable = false)
  private Integer resarcane;
  /**
   * Character's current block chance
   */
  @Column(name = "blockPct", nullable = false)
  private Float blockpct;
  /**
   * Character's current dodge chance.
   */
  @Column(name = "dodgePct", nullable = false)
  private Float dodgepct;
  /**
   * Character's current parry chance.
   */
  @Column(name = "parryPct", nullable = false)
  private Float parrypct;
  /**
   * Character's current crit chance.
   */
  @Column(name = "critPct", nullable = false)
  private Float critpct;
  /**
   * Character's current ranged crit chance.
   */
  @Column(name = "rangedCritPct", nullable = false)
  private Float rangedcritpct;
  /**
   * Character's current attackpower.
   */
  @Column(name = "attackPower", nullable = false)
  private Integer attackpower;
  /**
   * Character's current ranged attackpower.
   */
  @Column(name = "rangedAttackPower", nullable = false)
  private Integer rangedattackpower;
}