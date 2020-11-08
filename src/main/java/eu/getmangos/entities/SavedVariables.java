package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

/**
 * Variable Saves
 */
@Data
@Entity(name = "eu.getmangos.entities.SavedVariables")
@Table(name = "saved_variables")
@NamedQueries({
    @NamedQuery(name = "SavedVariables.findAll", query = "SELECT s FROM SavedVariables s"),
    @NamedQuery(name = "SavedVariables.findByNextMaintenanceDate", query = "SELECT s FROM SavedVariables s WHERE s.nextMaintenanceDate = :nextMaintenanceDate"),
    @NamedQuery(name = "SavedVariables.findByCleaningFlags", query = "SELECT s FROM SavedVariables s WHERE s.cleaningFlags = :cleaningFlags")})
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