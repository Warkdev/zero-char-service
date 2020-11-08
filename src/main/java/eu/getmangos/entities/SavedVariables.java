package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Variable Saves
 */
@Data
@Entity(name = "eu.getmangos.entities.SavedVariables")
@Table(name = "saved_variables")
public class SavedVariables {

  /**
   * The Date when the Honor Points / Rank etc. are updated.
   */
  @Id
  @Column(name = "NextMaintenanceDate", nullable = false)
  private Integer nextmaintenancedate;
  /**
   * The flags controlling character cleanup.
   */
  @Column(name = "cleaning_flags", nullable = false)
  private Integer cleaningFlags;
}