package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.CharacterGifts")
@Table(name = "character_gifts")
public class CharacterGifts {

  /**
   * The GUID (Global Unique Identifier) of the character. (See character.guid).
   */
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The GUID of the item. (See item_instance.guid).
   */
  @Id
  @Column(name = "item_guid", nullable = false)
  private Integer itemGuid;
  /**
   * The entry of the item. (See item_template.entry).
   */
  @Column(name = "entry", nullable = false)
  private Integer entry;
  @Column(name = "flags", nullable = false)
  private Integer flags;
}