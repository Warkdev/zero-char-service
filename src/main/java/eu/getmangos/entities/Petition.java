package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Guild System
 */
@Data
@Entity(name = "eu.getmangos.entities.Petition")
@Table(name = "petition")
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