package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Pet System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterPet")
@Table(name = "character_pet")
public class CharacterPet {

  /**
   * The special pet ID. This is a unique identifier among all pets.
   */
  @Id
  @Column(name = "id", nullable = false)
  private Integer id;
  /**
   * The creature entry of this pet. (See creature_template.entry).
   */
  @Column(name = "entry", nullable = false)
  private Integer entry;
  /**
   * The GUID of the pet's owner. (See character.guid).
   */
  @Column(name = "owner", nullable = false)
  private Integer owner;
  /**
   * The model ID to use to display the pet.
   */
  @Column(name = "modelid", nullable = true)
  private Integer modelid;
  /**
   * The ID of the spell that has created this pet.
   */
  @Column(name = "CreatedBySpell", nullable = false)
  private Integer createdbyspell;
  /**
   * The type of pet that this is. 0 = summoned pet, 1 = tamed pet
   */
  @Column(name = "PetType", nullable = false)
  private Byte pettype;
  /**
   * The current level of the pet.
   */
  @Column(name = "level", nullable = false)
  private Integer level;
  /**
   * The current experience that this pet has.
   */
  @Column(name = "exp", nullable = false)
  private Integer exp;
  /**
   * The current reaction state of the pet (passive, aggressive, etc).
   */
  @Column(name = "Reactstate", nullable = false)
  private boolean reactstate;
  /**
   * The current amount of loyalty points the pet has.
   */
  @Column(name = "loyaltypoints", nullable = false)
  private Integer loyaltypoints;
  /**
   * The pet's loyalty level.
   */
  @Column(name = "loyalty", nullable = false)
  private Integer loyalty;
  /**
   * Total training points available to spend.
   */
  @Column(name = "trainpoint", nullable = false)
  private Integer trainpoint;
  /**
   * The pet's name.
   */
  @Column(name = "name", nullable = true)
  private String name;
  /**
   * Boolean 1 or 0. 1 = Pet has been renamed.
   */
  @Column(name = "renamed", nullable = false)
  private boolean renamed;
  /**
   * The pet slot that the pet is in. The slot is a number between 0 and 3 inclusive.
   */
  @Column(name = "slot", nullable = false)
  private Integer slot;
  /**
   * The current pet health at the time it was saved to DB.
   */
  @Column(name = "curhealth", nullable = false)
  private Integer curhealth;
  /**
   * The current pet mana at the time it was saved to DB.
   */
  @Column(name = "curmana", nullable = false)
  private Integer curmana;
  /**
   * The current pet happiness.
   */
  @Column(name = "curhappiness", nullable = false)
  private Integer curhappiness;
  /**
   * The time when the pet was last saved, in Unix time.
   */
  @Column(name = "savetime", nullable = false)
  private Long savetime;
  /**
   * This is the cost to untrain the pet talents.
   */
  @Column(name = "resettalents_cost", nullable = false)
  private Integer resettalentsCost;
  /**
   * How many times the pets talents have been reset.
   */
  @Column(name = "resettalents_time", nullable = false)
  private Long resettalentsTime;
  /**
   * Data about pet action bar and action type ten pairs of action bar entry.
   */
  @Column(name = "abdata", nullable = true)
  private String abdata;
  /**
   * This field holds IDs of spells that have been taught to this pet.
   */
  @Column(name = "teachspelldata", nullable = true)
  private String teachspelldata;
}