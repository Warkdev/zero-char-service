package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.InstanceReset")
@Table(name = "instance_reset")
@NamedQueries({
    @NamedQuery(name = "InstanceReset.findAll", query = "SELECT i FROM InstanceReset i"),
    @NamedQuery(name = "InstanceReset.findByMapid", query = "SELECT i FROM InstanceReset i WHERE i.mapid = :mapid"),
    @NamedQuery(name = "InstanceReset.findByResettime", query = "SELECT i FROM InstanceReset i WHERE i.resettime = :resettime")})
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