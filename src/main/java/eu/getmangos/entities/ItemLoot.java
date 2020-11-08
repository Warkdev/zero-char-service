package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Item System
 */
@Data
@Entity(name = "eu.getmangos.entities.ItemLoot")
@Table(name = "item_loot")
@IdClass(ItemLoot.PrimaryKeys.class)
public class ItemLoot {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer guid;
    private Integer itemid;
  }

  /**
   * Global unique ID of the item loot entry.
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The GUID of the owner. (See character.guid)
   */
  @Column(name = "owner_guid", nullable = false)
  private Integer ownerGuid;
  /**
   * Item template entry ID of the item.
   */
  @Id
  @Column(name = "itemid", nullable = false)
  private Integer itemid;
  /**
   * Total number of the item.
   */
  @Column(name = "amount", nullable = false)
  private Integer amount;
  /**
   * Item random property.
   */
  @Column(name = "property", nullable = false)
  private Integer property;
}