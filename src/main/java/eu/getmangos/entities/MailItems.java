package eu.getmangos.entities;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.MailItems")
@Table(name = "mail_items")
@IdClass(MailItems.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "MailItems.findAll", query = "SELECT m FROM MailItems m"),
    @NamedQuery(name = "MailItems.findByMailId", query = "SELECT m FROM MailItems m WHERE m.mailItemsPK.mailId = :mailId"),
    @NamedQuery(name = "MailItems.findByItemGuid", query = "SELECT m FROM MailItems m WHERE m.mailItemsPK.itemGuid = :itemGuid"),
    @NamedQuery(name = "MailItems.findByItemTemplate", query = "SELECT m FROM MailItems m WHERE m.itemTemplate = :itemTemplate"),
    @NamedQuery(name = "MailItems.findByReceiver", query = "SELECT m FROM MailItems m WHERE m.receiver = :receiver")})
public class MailItems {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Integer mailId;
    private Integer itemGuid;
  }

  /**
   * The Mail Id (See mail.id).
   */
  @Id
  @Column(name = "mail_id", nullable = false)
  private Integer mailId;
  /**
   * The GUID of the item.
   */
  @Id
  @Column(name = "item_guid", nullable = false)
  private Integer itemGuid;
  /**
   * The entry ID of the item in the item_template table.
   */
  @Column(name = "item_template", nullable = false)
  private Integer itemTemplate;
  /**
   * Guid of the character who receives the mail.
   */
  @Column(name = "receiver", nullable = false)
  private Integer receiver;
}