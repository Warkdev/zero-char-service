package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.World")
@Table(name = "world")
@NamedQueries({
    @NamedQuery(name = "World.findAll", query = "SELECT w FROM World w"),
    @NamedQuery(name = "World.findByMap", query = "SELECT w FROM World w WHERE w.map = :map")})
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