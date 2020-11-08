package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.CharacterWhispers")
@Table(name = "character_whispers")
public class CharacterWhispers {

  /**
   * The unique id of this whisper message
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Integer id;
  /**
   * The GUID of the character receiving the whisper. (See character.guid).
   */
  @Column(name = "to_guid", nullable = false)
  private Integer toGuid;
  /**
   * The GUID of the character sending the whisper. (See character.guid).
   */
  @Column(name = "from_guid", nullable = false)
  private Integer fromGuid;
  /**
   * The body text of the whisper message
   */
  @Column(name = "message", nullable = false)
  private String message;
  /**
   * The id of the ticket this whisper relates to. (See character_ticket.ticket_id).
   */
  @Column(name = "regarding_ticket_id", nullable = false)
  private Integer regardingTicketId;
  /**
   * Stores the time when this whisper was sent.
   */
  @Column(name = "sent_on", nullable = false)
  private Timestamp sentOn;
}