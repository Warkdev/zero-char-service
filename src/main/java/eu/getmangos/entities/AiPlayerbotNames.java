package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

/**
 * PlayerbotAI AutoBot names
 */
@Data
@Entity(name = "eu.getmangos.entities.AiPlayerbotNames")
@Table(name = "ai_playerbot_names")
@NamedQueries({
    @NamedQuery(name = "AiPlayerbotNames.findAll", query = "SELECT a FROM AiPlayerbotNames a"),
    @NamedQuery(name = "AiPlayerbotNames.findByNameId", query = "SELECT a FROM AiPlayerbotNames a WHERE a.nameId = :nameId"),
    @NamedQuery(name = "AiPlayerbotNames.findByName", query = "SELECT a FROM AiPlayerbotNames a WHERE a.name = :name"),
    @NamedQuery(name = "AiPlayerbotNames.findByGender", query = "SELECT a FROM AiPlayerbotNames a WHERE a.gender = :gender"),
    @NamedQuery(name = "AiPlayerbotNames.findByRace", query = "SELECT a FROM AiPlayerbotNames a WHERE a.race = :race"),
    @NamedQuery(name = "AiPlayerbotNames.findByClass1", query = "SELECT a FROM AiPlayerbotNames a WHERE a.class1 = :class1"),
    @NamedQuery(name = "AiPlayerbotNames.findByPurpose", query = "SELECT a FROM AiPlayerbotNames a WHERE a.purpose = :purpose"),
    @NamedQuery(name = "AiPlayerbotNames.findByPriority", query = "SELECT a FROM AiPlayerbotNames a WHERE a.priority = :priority"),
    @NamedQuery(name = "AiPlayerbotNames.findByInUse", query = "SELECT a FROM AiPlayerbotNames a WHERE a.inUse = :inUse")})
public class AiPlayerbotNames {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "name_id", nullable = false)
  private Integer nameId;
  @Column(name = "name", nullable = false)
  private String name;
  /**
   * The Gender of the bot
   */
  @Column(name = "gender", nullable = false)
  private Byte gender;
  /**
   * The Race of the bot
   */
  @Column(name = "race", nullable = false)
  private Short race;
  @Column(name = "class", nullable = false)
  private Short className;
  @Column(name = "purpose", nullable = false)
  private Integer purpose;
  @Column(name = "priority", nullable = false)
  private boolean priority;
  @Column(name = "in_use", nullable = false)
  private boolean inUse;
}