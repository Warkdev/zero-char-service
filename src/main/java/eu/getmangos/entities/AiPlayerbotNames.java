package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

/**
 * PlayerbotAI AutoBot names
 */
@Data
@Entity(name = "eu.getmangos.entities.AiPlayerbotNames")
@Table(name = "ai_playerbot_names")
@NamedQueries({
    @NamedQuery(name = "AIPlayerBotNames.findAll", query = "SELECT ai FROM AIPlayerBotNames ai"),
    @NamedQuery(name = "AIPlayerBotNames.findById", query = "SELECT ai FROM AIPlayerBotNames ai where ai.name_id = :id")
})
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