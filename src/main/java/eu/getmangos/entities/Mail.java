package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * Mail System
 */
@Data
@Entity(name = "eu.getmangos.entities.Mail")
@Table(name = "mail")
public class Mail {

  /**
   * Unique message id. Every new message gets a new auto incremented id.
   */
  @Id
  @Column(name = "id", nullable = false)
  private Integer id;
  /**
   * message_type.
   */
  @Column(name = "messageType", nullable = false)
  private Byte messagetype;
  /**
   * The StationeryID (See Stationery.dbc).
   */
  @Column(name = "stationery", nullable = false)
  private Byte stationery;
  /**
   * The Mail Template Id (See MailTemplate.dbc)
   */
  @Column(name = "mailTemplateId", nullable = false)
  private Integer mailtemplateid;
  /**
   * Guid of the character who sends the mail.
   */
  @Column(name = "sender", nullable = false)
  private Integer sender;
  /**
   * Guid of the character who receives the mail.
   */
  @Column(name = "receiver", nullable = false)
  private Integer receiver;
  /**
   * The Subject of the mail.
   */
  @Column(name = "subject", nullable = true)
  private String subject;
  /**
   * The item_text ID of the massage within the mail.
   */
  @Column(name = "itemTextId", nullable = false)
  private Integer itemtextid;
  /**
   * Boolean value showing whether or not atems have been sent.
   */
  @Column(name = "has_items", nullable = false)
  private Byte hasItems;
  /**
   * Current Unix Time + Unix Time till expiry.
   */
  @Column(name = "expire_time", nullable = false)
  private Long expireTime;
  /**
   * Current Unix Time + Unix Time till delivery.
   */
  @Column(name = "deliver_time", nullable = false)
  private Long deliverTime;
  /**
   * Amount of money sent.
   */
  @Column(name = "money", nullable = false)
  private Integer money;
  /**
   * Amount of money needed (COD).
   */
  @Column(name = "cod", nullable = false)
  private Integer cod;
  /**
   * checked_flag.
   */
  @Column(name = "checked", nullable = false)
  private Byte checked;
}