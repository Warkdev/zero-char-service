package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

/**
 * PlayerbotAI AutoBot names
 */
@Data
@Entity
@Table(name = "ai_playerbot_names")
@NamedQueries({
    @NamedQuery(name = "AiPlayerbotNames.findAll", query = "SELECT a FROM AiPlayerbotNames a")
})
public class AiPlayerbotNames {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "name_id", nullable = false)
  private Long nameId;
  @Column(name = "name", nullable = false)
  private String name;
  /**
   * The Gender of the bot
   */
  @Column(name = "gender", nullable = false)
  private Short gender;
  /**
   * The Race of the bot
   */
  @Column(name = "race", nullable = false)
  private Integer race;
  @Column(name = "class", nullable = false)
  private Integer className;
  @Column(name = "purpose", nullable = false)
  private Long purpose;
  @Column(name = "priority", nullable = false)
  private boolean priority;
  @Column(name = "in_use", nullable = false)
  private boolean inUse;
}