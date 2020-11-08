package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.WardenAction")
@Table(name = "warden_action")
@NamedQueries({
    @NamedQuery(name = "WardenAction.findAll", query = "SELECT w FROM WardenAction w"),
    @NamedQuery(name = "WardenAction.findByWardenId", query = "SELECT w FROM WardenAction w WHERE w.wardenId = :wardenId"),
    @NamedQuery(name = "WardenAction.findByAction", query = "SELECT w FROM WardenAction w WHERE w.action = :action")})
public class WardenAction {

  @Id
  @Column(name = "wardenId", nullable = false)
  private Short wardenid;
  @Column(name = "action", nullable = true)
  private Byte action;
}