package eu.getmangos.entities;

import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.PvpstatsBattlegrounds")
@Table(name = "pvpstats_battlegrounds")
@NamedQueries({
    @NamedQuery(name = "PvpstatsBattlegrounds.findAll", query = "SELECT p FROM PvpstatsBattlegrounds p"),
    @NamedQuery(name = "PvpstatsBattlegrounds.findById", query = "SELECT p FROM PvpstatsBattlegrounds p WHERE p.id = :id"),
    @NamedQuery(name = "PvpstatsBattlegrounds.findByWinnerTeam", query = "SELECT p FROM PvpstatsBattlegrounds p WHERE p.winnerTeam = :winnerTeam"),
    @NamedQuery(name = "PvpstatsBattlegrounds.findByBracketId", query = "SELECT p FROM PvpstatsBattlegrounds p WHERE p.bracketId = :bracketId"),
    @NamedQuery(name = "PvpstatsBattlegrounds.findByType", query = "SELECT p FROM PvpstatsBattlegrounds p WHERE p.type = :type"),
    @NamedQuery(name = "PvpstatsBattlegrounds.findByDate", query = "SELECT p FROM PvpstatsBattlegrounds p WHERE p.date = :date")})
public class PvpstatsBattlegrounds {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "id", nullable = false)
  private Long id;
  @Column(name = "winner_team", nullable = false)
  private Byte winnerTeam;
  @Column(name = "bracket_id", nullable = false)
  private Byte bracketId;
  @Column(name = "type", nullable = false)
  private Byte type;
  @Column(name = "date", nullable = false)
  private Timestamp date;
}