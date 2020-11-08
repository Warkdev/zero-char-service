package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

/**
 * Guild System
 */
@Data
@Entity(name = "eu.getmangos.entities.Guild")
@Table(name = "guild")
@NamedQueries({
    @NamedQuery(name = "Guild.findAll", query = "SELECT g FROM Guild g"),
    @NamedQuery(name = "Guild.findByGuildid", query = "SELECT g FROM Guild g WHERE g.guildid = :guildid"),
    @NamedQuery(name = "Guild.findByName", query = "SELECT g FROM Guild g WHERE g.name = :name"),
    @NamedQuery(name = "Guild.findByLeaderguid", query = "SELECT g FROM Guild g WHERE g.leaderguid = :leaderguid"),
    @NamedQuery(name = "Guild.findByEmblemStyle", query = "SELECT g FROM Guild g WHERE g.emblemStyle = :emblemStyle"),
    @NamedQuery(name = "Guild.findByEmblemColor", query = "SELECT g FROM Guild g WHERE g.emblemColor = :emblemColor"),
    @NamedQuery(name = "Guild.findByBorderStyle", query = "SELECT g FROM Guild g WHERE g.borderStyle = :borderStyle"),
    @NamedQuery(name = "Guild.findByBorderColor", query = "SELECT g FROM Guild g WHERE g.borderColor = :borderColor"),
    @NamedQuery(name = "Guild.findByBackgroundColor", query = "SELECT g FROM Guild g WHERE g.backgroundColor = :backgroundColor"),
    @NamedQuery(name = "Guild.findByInfo", query = "SELECT g FROM Guild g WHERE g.info = :info"),
    @NamedQuery(name = "Guild.findByMotd", query = "SELECT g FROM Guild g WHERE g.motd = :motd"),
    @NamedQuery(name = "Guild.findByCreatedate", query = "SELECT g FROM Guild g WHERE g.createdate = :createdate")})
public class Guild {

  /**
   * The ID of the guild.
   */
  @Id
  @Column(name = "guildid", nullable = false)
  private Integer guildid;
  /**
   * The guild name.
   */
  @Column(name = "name", nullable = false)
  private String name;
  /**
   * The GUID of the character who created the guild. (See characters.guid)
   */
  @Column(name = "leaderguid", nullable = false)
  private Integer leaderguid;
  /**
   * The emblem style of the guild tabard.
   */
  @Column(name = "EmblemStyle", nullable = false)
  private Integer emblemstyle;
  /**
   * The emblem color of the guild tabard.
   */
  @Column(name = "EmblemColor", nullable = false)
  private Integer emblemcolor;
  /**
   * The border style of the guild tabard.
   */
  @Column(name = "BorderStyle", nullable = false)
  private Integer borderstyle;
  /**
   * The border color of the guild tabard.
   */
  @Column(name = "BorderColor", nullable = false)
  private Integer bordercolor;
  /**
   * The background color of the guild tabard.
   */
  @Column(name = "BackgroundColor", nullable = false)
  private Integer backgroundcolor;
  /**
   * The text message that appears in the Guild Information box.
   */
  @Column(name = "info", nullable = false)
  private String info;
  /**
   * The text that appears in the Message Of The Day box.
   */
  @Column(name = "motd", nullable = false)
  private String motd;
  /**
   * The date when the guild was created.
   */
  @Column(name = "createdate", nullable = false)
  private Long createdate;
}