package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Item System
 */
@Data
@Entity(name = "eu.getmangos.entities.ItemInstance")
@Table(name = "item_instance")
public class ItemInstance {

  /**
   * The GUID of the item. This number is unique for each item instance.
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The GUID of the character who has ownership of this item. (See character.guid)
   */
  @Column(name = "owner_guid", nullable = false)
  private Integer ownerGuid;
  /**
   * Much like the playerbytes fields in the characters table.
   */
  @Column(name = "data", nullable = true)
  private String data;
}