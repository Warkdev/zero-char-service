package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.WardenAction")
@Table(name = "warden_action")
public class WardenAction {

  @Id
  @Column(name = "wardenId", nullable = false)
  private Short wardenid;
  @Column(name = "action", nullable = true)
  private Byte action;
}