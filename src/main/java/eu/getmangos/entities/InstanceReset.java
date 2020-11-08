package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.InstanceReset")
@Table(name = "instance_reset")
public class InstanceReset {

  /**
   * The map ID of the instance. (See Map.dbc)
   */
  @Id
  @Column(name = "mapid", nullable = false)
  private Integer mapid;
  /**
   * Dungeon reset time in seconds.
   */
  @Column(name = "resettime", nullable = false)
  private Long resettime;
}