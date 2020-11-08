package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.Instance")
@Table(name = "instance")
public class Instance {

  /**
   * The instance ID. This number is unique to every instance.
   */
  @Id
  @Column(name = "id", nullable = false)
  private Integer id;
  /**
   * The map ID the instance is in. (See Map.dbc)
   */
  @Column(name = "map", nullable = false)
  private Integer map;
  /**
   * The time when the instance will be reset, in Unix time.
   */
  @Column(name = "resettime", nullable = false)
  private Long resettime;
  /**
   * Specific data belonging to the individual instance.
   */
  @Column(name = "data", nullable = true)
  private String data;
}