package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

/**
 * Game event system
 */
@Data
@Entity(name = "eu.getmangos.entities.GameEventStatus")
@Table(name = "game_event_status")
@NamedQueries({
    @NamedQuery(name = "GameEventStatus.findAll", query = "SELECT g FROM GameEventStatus g"),
    @NamedQuery(name = "GameEventStatus.findByEvent", query = "SELECT g FROM GameEventStatus g WHERE g.event = :event")})
public class GameEventStatus {

  /**
   * The Event Id (see game_event.is) of currently active game events.
   */
  @Id
  @Column(name = "event", nullable = false)
  private Short event;
}