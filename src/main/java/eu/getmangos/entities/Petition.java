package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

/**
 * Guild System
 */
@Data
@Entity(name = "eu.getmangos.entities.Petition")
@Table(name = "petition")
@NamedQueries({
    @NamedQuery(name = "Petition.findAll", query = "SELECT p FROM Petition p"),
    @NamedQuery(name = "Petition.findByOwnerguid", query = "SELECT p FROM Petition p WHERE p.ownerguid = :ownerguid"),
    @NamedQuery(name = "Petition.findByPetitionguid", query = "SELECT p FROM Petition p WHERE p.petitionguid = :petitionguid"),
    @NamedQuery(name = "Petition.findByName", query = "SELECT p FROM Petition p WHERE p.name = :name")})
public class Petition {

  /**
   * The petition owner's GUID. (See characters.guid)
   */
  @Id
  @Column(name = "ownerguid", nullable = false)
  private Integer ownerguid;
  /**
   * The GUID of the petition item. See (item_instance.guid)
   */
  @Column(name = "petitionguid", nullable = true)
  private Integer petitionguid;
  /**
   * The name of the guild or arena team that the player is trying to petition.
   */
  @Column(name = "name", nullable = false)
  private String name;
}