package eu.getmangos.entities;

import java.sql.*;
import javax.persistence.*;
import lombok.Data;

@Data
@Entity(name = "eu.getmangos.entities.PvpstatsBattlegrounds")
@Table(name = "pvpstats_battlegrounds")
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