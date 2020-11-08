package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.World")
@Table(name = "world")
public class World {

  /**
   * The map ID (See Map.dbc)
   */
  @Id
  @Column(name = "map", nullable = false)
  private Integer map;
  /**
   * Specific data belonging to the world.
   */
  @Column(name = "data", nullable = true)
  private String data;
}