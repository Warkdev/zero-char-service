package eu.getmangos.entities;

import java.io.Serializable;
import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterSkills")
@Table(name = "character_skills")
@IdClass(CharacterSkills.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "CharacterSkills.findAll", query = "SELECT c FROM CharacterSkills c"),
    @NamedQuery(name = "CharacterSkills.findByGuid", query = "SELECT c FROM CharacterSkills c WHERE c.characterSkillsPK.guid = :guid"),
    @NamedQuery(name = "CharacterSkills.findBySkill", query = "SELECT c FROM CharacterSkills c WHERE c.characterSkillsPK.skill = :skill"),
    @NamedQuery(name = "CharacterSkills.findByValue", query = "SELECT c FROM CharacterSkills c WHERE c.value = :value"),
    @NamedQuery(name = "CharacterSkills.findByMax", query = "SELECT c FROM CharacterSkills c WHERE c.max = :max")})
public class CharacterSkills {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Integer skill;
  }

  /**
   * The GUID (Global Unique Identifier) of the character. (See character.guid).
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The list of skills a character knows. A listing of those can be found in here.
   */
  @Id
  @Column(name = "skill", nullable = false)
  private Integer skill;
  /**
   * The current skill rank(value) of the character skills a character has.
   */
  @Column(name = "value", nullable = false)
  private Integer value;
  /**
   * The highest possible value for the given skill within a given rank.
   */
  @Column(name = "max", nullable = false)
  private Integer max;
}