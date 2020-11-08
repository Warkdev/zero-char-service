package eu.getmangos.entities;

import java.io.Serializable;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.PvpstatsPlayers")
@Table(name = "pvpstats_players")
@IdClass(PvpstatsPlayers.PrimaryKeys.class)
@NamedQueries({
    @NamedQuery(name = "PvpstatsPlayers.findAll", query = "SELECT p FROM PvpstatsPlayers p"),
    @NamedQuery(name = "PvpstatsPlayers.findByBattlegroundId", query = "SELECT p FROM PvpstatsPlayers p WHERE p.pvpstatsPlayersPK.battlegroundId = :battlegroundId"),
    @NamedQuery(name = "PvpstatsPlayers.findByCharacterGuid", query = "SELECT p FROM PvpstatsPlayers p WHERE p.pvpstatsPlayersPK.characterGuid = :characterGuid"),
    @NamedQuery(name = "PvpstatsPlayers.findByScoreKillingBlows", query = "SELECT p FROM PvpstatsPlayers p WHERE p.scoreKillingBlows = :scoreKillingBlows"),
    @NamedQuery(name = "PvpstatsPlayers.findByScoreDeaths", query = "SELECT p FROM PvpstatsPlayers p WHERE p.scoreDeaths = :scoreDeaths"),
    @NamedQuery(name = "PvpstatsPlayers.findByScoreHonorableKills", query = "SELECT p FROM PvpstatsPlayers p WHERE p.scoreHonorableKills = :scoreHonorableKills"),
    @NamedQuery(name = "PvpstatsPlayers.findByScoreBonusHonor", query = "SELECT p FROM PvpstatsPlayers p WHERE p.scoreBonusHonor = :scoreBonusHonor"),
    @NamedQuery(name = "PvpstatsPlayers.findByScoreDamageDone", query = "SELECT p FROM PvpstatsPlayers p WHERE p.scoreDamageDone = :scoreDamageDone"),
    @NamedQuery(name = "PvpstatsPlayers.findByScoreHealingDone", query = "SELECT p FROM PvpstatsPlayers p WHERE p.scoreHealingDone = :scoreHealingDone"),
    @NamedQuery(name = "PvpstatsPlayers.findByAttr1", query = "SELECT p FROM PvpstatsPlayers p WHERE p.attr1 = :attr1"),
    @NamedQuery(name = "PvpstatsPlayers.findByAttr2", query = "SELECT p FROM PvpstatsPlayers p WHERE p.attr2 = :attr2"),
    @NamedQuery(name = "PvpstatsPlayers.findByAttr3", query = "SELECT p FROM PvpstatsPlayers p WHERE p.attr3 = :attr3"),
    @NamedQuery(name = "PvpstatsPlayers.findByAttr4", query = "SELECT p FROM PvpstatsPlayers p WHERE p.attr4 = :attr4"),
    @NamedQuery(name = "PvpstatsPlayers.findByAttr5", query = "SELECT p FROM PvpstatsPlayers p WHERE p.attr5 = :attr5")})
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