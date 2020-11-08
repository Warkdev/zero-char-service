package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.CharacterWhispers")
@Table(name = "character_whispers")
@NamedQueries({
    @NamedQuery(name = "CharacterWhispers.findAll", query = "SELECT c FROM CharacterWhispers c"),
    @NamedQuery(name = "CharacterWhispers.findById", query = "SELECT c FROM CharacterWhispers c WHERE c.id = :id"),
    @NamedQuery(name = "CharacterWhispers.findByToGuid", query = "SELECT c FROM CharacterWhispers c WHERE c.toGuid = :toGuid"),
    @NamedQuery(name = "CharacterWhispers.findByFromGuid", query = "SELECT c FROM CharacterWhispers c WHERE c.fromGuid = :fromGuid"),
    @NamedQuery(name = "CharacterWhispers.findByMessage", query = "SELECT c FROM CharacterWhispers c WHERE c.message = :message"),
    @NamedQuery(name = "CharacterWhispers.findByRegardingTicketId", query = "SELECT c FROM CharacterWhispers c WHERE c.regardingTicketId = :regardingTicketId"),
    @NamedQuery(name = "CharacterWhispers.findBySentOn", query = "SELECT c FROM CharacterWhispers c WHERE c.sentOn = :sentOn")})
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