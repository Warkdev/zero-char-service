package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.CharacterTicket")
@Table(name = "character_ticket")
@NamedQueries({
    @NamedQuery(name = "CharacterTicket.findAll", query = "SELECT c FROM CharacterTicket c"),
    @NamedQuery(name = "CharacterTicket.findByTicketId", query = "SELECT c FROM CharacterTicket c WHERE c.ticketId = :ticketId"),
    @NamedQuery(name = "CharacterTicket.findByGuid", query = "SELECT c FROM CharacterTicket c WHERE c.guid = :guid"),
    @NamedQuery(name = "CharacterTicket.findByTicketLastchange", query = "SELECT c FROM CharacterTicket c WHERE c.ticketLastchange = :ticketLastchange"),
    @NamedQuery(name = "CharacterTicket.findByResolved", query = "SELECT c FROM CharacterTicket c WHERE c.resolved = :resolved")})
public class CharacterTicket {

  /**
   * A unique ticket ID.
   */
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "ticket_id", nullable = false)
  private Integer ticketId;
  /**
   * The GUID of the character sending the ticket. (See character.guid).
   */
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The ticket description text; the text written by the player.
   */
  @Column(name = "ticket_text", nullable = true)
  private String ticketText;
  /**
   * The ticket solution text; the text written by the GM.
   */
  @Column(name = "response_text", nullable = true)
  private String responseText;
  /**
   * Stores the time when this ticket was last changed.
   */
  @Column(name = "ticket_lastchange", nullable = false)
  private Timestamp ticketLastchange;
  /**
   * Resolved Flag = set to 1 if the GM has sucessfully resolved the ticket
   */
  @Column(name = "resolved", nullable = true)
  private boolean resolved;
}