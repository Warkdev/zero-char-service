package eu.getmangos.entities;

import java.io.Serializable;
import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.PvpstatsPlayers")
@Table(name = "pvpstats_players")
@IdClass(PvpstatsPlayers.PrimaryKeys.class)
public class PvpstatsPlayers {
  @Data
  public static class PrimaryKeys implements Serializable {
    private Long battlegroundId;
    private Integer characterGuid;
  }

  @Id
  @Column(name = "battleground_id", nullable = false)
  private Long battlegroundId;
  @Id
  @Column(name = "character_guid", nullable = false)
  private Integer characterGuid;
  @Column(name = "score_killing_blows", nullable = false)
  private Integer scoreKillingBlows;
  @Column(name = "score_deaths", nullable = false)
  private Integer scoreDeaths;
  @Column(name = "score_honorable_kills", nullable = false)
  private Integer scoreHonorableKills;
  @Column(name = "score_bonus_honor", nullable = false)
  private Integer scoreBonusHonor;
  @Column(name = "score_damage_done", nullable = false)
  private Integer scoreDamageDone;
  @Column(name = "score_healing_done", nullable = false)
  private Integer scoreHealingDone;
  @Column(name = "attr_1", nullable = false)
  private Integer attr1;
  @Column(name = "attr_2", nullable = false)
  private Integer attr2;
  @Column(name = "attr_3", nullable = false)
  private Integer attr3;
  @Column(name = "attr_4", nullable = false)
  private Integer attr4;
  @Column(name = "attr_5", nullable = false)
  private Integer attr5;
}