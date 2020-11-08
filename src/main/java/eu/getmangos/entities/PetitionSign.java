package eu.getmangos.entities;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

/**
 * Guild System
 */
@Data
@Entity(name = "eu.getmangos.entities.PetitionSign")
@Table(name = "petition_sign")
@IdClass(PetitionSign.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "PetitionSign.findAll", query = "SELECT p FROM PetitionSign p"),
    @NamedQuery(name = "PetitionSign.findByOwnerguid", query = "SELECT p FROM PetitionSign p WHERE p.ownerguid = :ownerguid"),
    @NamedQuery(name = "PetitionSign.findByPetitionguid", query = "SELECT p FROM PetitionSign p WHERE p.petitionSignPK.petitionguid = :petitionguid"),
    @NamedQuery(name = "PetitionSign.findByPlayerguid", query = "SELECT p FROM PetitionSign p WHERE p.petitionSignPK.playerguid = :playerguid"),
    @NamedQuery(name = "PetitionSign.findByPlayerAccount", query = "SELECT p FROM PetitionSign p WHERE p.playerAccount = :playerAccount")})
public class PetitionSign {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer petitionguid;
    private Integer playerguid;
  }

  /**
   * The GUID of the owner that is trying to make the guild/arena team.
   */
  @Column(name = "ownerguid", nullable = false)
  private Integer ownerguid;
  /**
   * The GUID of the charter item. (See item_template.guid)
   */
  @Id
  @Column(name = "petitionguid", nullable = false)
  private Integer petitionguid;
  /**
   * The GUID of the player that has signed the charter. (See character.guid)
   */
  @Id
  @Column(name = "playerguid", nullable = false)
  private Integer playerguid;
  /**
   * The account ID of the player that has signed the charter (See account.id).
   */
  @Column(name = "player_account", nullable = false)
  private Integer playerAccount;
}