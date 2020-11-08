package eu.getmangos.entities;

import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterInventory")
@Table(name = "character_inventory")
@NamedQueries({
    @NamedQuery(name = "CharacterInventory.findAll", query = "SELECT c FROM CharacterInventory c"),
    @NamedQuery(name = "CharacterInventory.findByGuid", query = "SELECT c FROM CharacterInventory c WHERE c.guid = :guid"),
    @NamedQuery(name = "CharacterInventory.findByBag", query = "SELECT c FROM CharacterInventory c WHERE c.bag = :bag"),
    @NamedQuery(name = "CharacterInventory.findBySlot", query = "SELECT c FROM CharacterInventory c WHERE c.slot = :slot"),
    @NamedQuery(name = "CharacterInventory.findByItem", query = "SELECT c FROM CharacterInventory c WHERE c.item = :item"),
    @NamedQuery(name = "CharacterInventory.findByItemTemplate", query = "SELECT c FROM CharacterInventory c WHERE c.itemTemplate = :itemTemplate")})
public class CharacterInventory {

  /**
   * The GUID (Global Unique Identifier) of the character. (See character.guid).
   */
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * If it isn't 0, then it is the bag's item GUID (Global Unique Identifier).
   */
  @Column(name = "bag", nullable = false)
  private Integer bag;
  /**
   * The slot is the slot in the bag where the item is.
   */
  @Column(name = "slot", nullable = false)
  private Byte slot;
  /**
   * The item's GUID. (See item_instance.guid).
   */
  @Id
  @Column(name = "item", nullable = false)
  private Integer item;
  /**
   * The item's template entry (Item Identifier). (See item_template.entry).
   */
  @Column(name = "item_template", nullable = false)
  private Integer itemTemplate;
}