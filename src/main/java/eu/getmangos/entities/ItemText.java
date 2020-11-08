package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

/**
 * Item System
 */
@Data
@Entity(name = "eu.getmangos.entities.ItemText")
@Table(name = "item_text")
@NamedQueries({
    @NamedQuery(name = "ItemText.findAll", query = "SELECT i FROM ItemText i"),
    @NamedQuery(name = "ItemText.findById", query = "SELECT i FROM ItemText i WHERE i.id = :id")})
public class ItemText {

  /**
   * The text entry ID. This number is unique to every text entry in this table.
   */
  @Id
  @Column(name = "id", nullable = false)
  private Integer id;
  /**
   * The actual text that was sent as mail using the mail system.
   */
  @Column(name = "text", nullable = true)
  private String text;
}