package eu.getmangos.entities;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

/**
 * Item System
 */
@Data
@Entity(name = "eu.getmangos.entities.ItemLoot")
@Table(name = "item_loot")
@IdClass(ItemLoot.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "ItemLoot.findAll", query = "SELECT i FROM ItemLoot i"),
    @NamedQuery(name = "ItemLoot.findByGuid", query = "SELECT i FROM ItemLoot i WHERE i.itemLootPK.guid = :guid"),
    @NamedQuery(name = "ItemLoot.findByOwnerGuid", query = "SELECT i FROM ItemLoot i WHERE i.ownerGuid = :ownerGuid"),
    @NamedQuery(name = "ItemLoot.findByItemid", query = "SELECT i FROM ItemLoot i WHERE i.itemLootPK.itemid = :itemid"),
    @NamedQuery(name = "ItemLoot.findByAmount", query = "SELECT i FROM ItemLoot i WHERE i.amount = :amount"),
    @NamedQuery(name = "ItemLoot.findByProperty", query = "SELECT i FROM ItemLoot i WHERE i.property = :property")})
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