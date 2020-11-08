package eu.getmangos.entities;


import javax.persistence.*;
import lombok.Data;

/**
 * Player System
 */
@Data
@Entity(name = "eu.getmangos.entities.Characters")
@Table(name = "characters")
@NamedQueries({
    @NamedQuery(name = "Characters.findAll", query = "SELECT c FROM Characters c"),
    @NamedQuery(name = "Characters.findByGuid", query = "SELECT c FROM Characters c WHERE c.guid = :guid"),
    @NamedQuery(name = "Characters.findByAccount", query = "SELECT c FROM Characters c WHERE c.account = :account"),
    @NamedQuery(name = "Characters.findByName", query = "SELECT c FROM Characters c WHERE c.name = :name"),
    @NamedQuery(name = "Characters.findByRace", query = "SELECT c FROM Characters c WHERE c.race = :race"),
    @NamedQuery(name = "Characters.findByClass1", query = "SELECT c FROM Characters c WHERE c.class1 = :class1"),
    @NamedQuery(name = "Characters.findByGender", query = "SELECT c FROM Characters c WHERE c.gender = :gender"),
    @NamedQuery(name = "Characters.findByLevel", query = "SELECT c FROM Characters c WHERE c.level = :level"),
    @NamedQuery(name = "Characters.findByXp", query = "SELECT c FROM Characters c WHERE c.xp = :xp"),
    @NamedQuery(name = "Characters.findByMoney", query = "SELECT c FROM Characters c WHERE c.money = :money"),
    @NamedQuery(name = "Characters.findByPlayerBytes", query = "SELECT c FROM Characters c WHERE c.playerBytes = :playerBytes"),
    @NamedQuery(name = "Characters.findByPlayerBytes2", query = "SELECT c FROM Characters c WHERE c.playerBytes2 = :playerBytes2"),
    @NamedQuery(name = "Characters.findByPlayerFlags", query = "SELECT c FROM Characters c WHERE c.playerFlags = :playerFlags"),
    @NamedQuery(name = "Characters.findByPositionX", query = "SELECT c FROM Characters c WHERE c.positionX = :positionX"),
    @NamedQuery(name = "Characters.findByPositionY", query = "SELECT c FROM Characters c WHERE c.positionY = :positionY"),
    @NamedQuery(name = "Characters.findByPositionZ", query = "SELECT c FROM Characters c WHERE c.positionZ = :positionZ"),
    @NamedQuery(name = "Characters.findByMap", query = "SELECT c FROM Characters c WHERE c.map = :map"),
    @NamedQuery(name = "Characters.findByOrientation", query = "SELECT c FROM Characters c WHERE c.orientation = :orientation"),
    @NamedQuery(name = "Characters.findByOnline", query = "SELECT c FROM Characters c WHERE c.online = :online"),
    @NamedQuery(name = "Characters.findByCinematic", query = "SELECT c FROM Characters c WHERE c.cinematic = :cinematic"),
    @NamedQuery(name = "Characters.findByTotaltime", query = "SELECT c FROM Characters c WHERE c.totaltime = :totaltime"),
    @NamedQuery(name = "Characters.findByLeveltime", query = "SELECT c FROM Characters c WHERE c.leveltime = :leveltime"),
    @NamedQuery(name = "Characters.findByLogoutTime", query = "SELECT c FROM Characters c WHERE c.logoutTime = :logoutTime"),
    @NamedQuery(name = "Characters.findByIsLogoutResting", query = "SELECT c FROM Characters c WHERE c.isLogoutResting = :isLogoutResting"),
    @NamedQuery(name = "Characters.findByRestBonus", query = "SELECT c FROM Characters c WHERE c.restBonus = :restBonus"),
    @NamedQuery(name = "Characters.findByResettalentsCost", query = "SELECT c FROM Characters c WHERE c.resettalentsCost = :resettalentsCost"),
    @NamedQuery(name = "Characters.findByResettalentsTime", query = "SELECT c FROM Characters c WHERE c.resettalentsTime = :resettalentsTime"),
    @NamedQuery(name = "Characters.findByTransX", query = "SELECT c FROM Characters c WHERE c.transX = :transX"),
    @NamedQuery(name = "Characters.findByTransY", query = "SELECT c FROM Characters c WHERE c.transY = :transY"),
    @NamedQuery(name = "Characters.findByTransZ", query = "SELECT c FROM Characters c WHERE c.transZ = :transZ"),
    @NamedQuery(name = "Characters.findByTransO", query = "SELECT c FROM Characters c WHERE c.transO = :transO"),
    @NamedQuery(name = "Characters.findByTransguid", query = "SELECT c FROM Characters c WHERE c.transguid = :transguid"),
    @NamedQuery(name = "Characters.findByExtraFlags", query = "SELECT c FROM Characters c WHERE c.extraFlags = :extraFlags"),
    @NamedQuery(name = "Characters.findByStableSlots", query = "SELECT c FROM Characters c WHERE c.stableSlots = :stableSlots"),
    @NamedQuery(name = "Characters.findByAtLogin", query = "SELECT c FROM Characters c WHERE c.atLogin = :atLogin"),
    @NamedQuery(name = "Characters.findByZone", query = "SELECT c FROM Characters c WHERE c.zone = :zone"),
    @NamedQuery(name = "Characters.findByDeathExpireTime", query = "SELECT c FROM Characters c WHERE c.deathExpireTime = :deathExpireTime"),
    @NamedQuery(name = "Characters.findByHonorHighestRank", query = "SELECT c FROM Characters c WHERE c.honorHighestRank = :honorHighestRank"),
    @NamedQuery(name = "Characters.findByHonorStanding", query = "SELECT c FROM Characters c WHERE c.honorStanding = :honorStanding"),
    @NamedQuery(name = "Characters.findByStoredHonorRating", query = "SELECT c FROM Characters c WHERE c.storedHonorRating = :storedHonorRating"),
    @NamedQuery(name = "Characters.findByStoredDishonorableKills", query = "SELECT c FROM Characters c WHERE c.storedDishonorableKills = :storedDishonorableKills"),
    @NamedQuery(name = "Characters.findByStoredHonorableKills", query = "SELECT c FROM Characters c WHERE c.storedHonorableKills = :storedHonorableKills"),
    @NamedQuery(name = "Characters.findByWatchedFaction", query = "SELECT c FROM Characters c WHERE c.watchedFaction = :watchedFaction"),
    @NamedQuery(name = "Characters.findByDrunk", query = "SELECT c FROM Characters c WHERE c.drunk = :drunk"),
    @NamedQuery(name = "Characters.findByHealth", query = "SELECT c FROM Characters c WHERE c.health = :health"),
    @NamedQuery(name = "Characters.findByPower1", query = "SELECT c FROM Characters c WHERE c.power1 = :power1"),
    @NamedQuery(name = "Characters.findByPower2", query = "SELECT c FROM Characters c WHERE c.power2 = :power2"),
    @NamedQuery(name = "Characters.findByPower3", query = "SELECT c FROM Characters c WHERE c.power3 = :power3"),
    @NamedQuery(name = "Characters.findByPower4", query = "SELECT c FROM Characters c WHERE c.power4 = :power4"),
    @NamedQuery(name = "Characters.findByPower5", query = "SELECT c FROM Characters c WHERE c.power5 = :power5"),
    @NamedQuery(name = "Characters.findByAmmoId", query = "SELECT c FROM Characters c WHERE c.ammoId = :ammoId"),
    @NamedQuery(name = "Characters.findByActionBars", query = "SELECT c FROM Characters c WHERE c.actionBars = :actionBars"),
    @NamedQuery(name = "Characters.findByDeleteInfosAccount", query = "SELECT c FROM Characters c WHERE c.deleteInfosAccount = :deleteInfosAccount"),
    @NamedQuery(name = "Characters.findByDeleteInfosName", query = "SELECT c FROM Characters c WHERE c.deleteInfosName = :deleteInfosName"),
    @NamedQuery(name = "Characters.findByDeleteDate", query = "SELECT c FROM Characters c WHERE c.deleteDate = :deleteDate")})
public class Characters {

  /**
   * The character global unique identifier.
   */
  @Id
  @Column(name = "guid", nullable = false)
  private Integer guid;
  /**
   * The account ID in which this character resides (See account.id) in the realm db.
   */
  @Column(name = "account", nullable = false)
  private Integer account;
  /**
   * The name of the character.
   */
  @Column(name = "name", nullable = false)
  private String name;
  /**
   * The race of the character.
   */
  @Column(name = "race", nullable = false)
  private Byte race;
  /**
   * The Class Id of the character (See chrclasses.dbc).
   */
  @Column(name = "class", nullable = false)
  private Byte className;
  /**
   * The Sex/Gender of the character.
   */
  @Column(name = "gender", nullable = false)
  private Byte gender;
  /**
   * The current level of the designated player.
   */
  @Column(name = "level", nullable = false)
  private Byte level;
  /**
   * The total amount of xp that the signified player has.
   */
  @Column(name = "xp", nullable = false)
  private Integer xp;
  /**
   * This is the amount of copper the character possesses.
   */
  @Column(name = "money", nullable = false)
  private Integer money;
  /**
   * This defines the physical attributes of the character.
   */
  @Column(name = "playerBytes", nullable = false)
  private Integer playerbytes;
  /**
   * This defines the facial hair physical attribute of the character.
   */
  @Column(name = "playerBytes2", nullable = false)
  private Integer playerbytes2;
  /**
   * These are the player flags, such as GM mode on or off.
   */
  @Column(name = "playerFlags", nullable = false)
  private Integer playerflags;
  /**
   * The x position of the character's location.
   */
  @Column(name = "position_x", nullable = false)
  private Float positionX;
  /**
   * The y position of the character's location.
   */
  @Column(name = "position_y", nullable = false)
  private Float positionY;
  /**
   * The z position of the character's location.
   */
  @Column(name = "position_z", nullable = false)
  private Float positionZ;
  /**
   * The map ID the character is in (See maps.dbc)
   */
  @Column(name = "map", nullable = false)
  private Integer map;
  /**
   * The orientation the character is facing. (North = 0.0, South = 3.14159)
   */
  @Column(name = "orientation", nullable = false)
  private Float orientation;
  @Column(name = "taximask", nullable = true)
  private String taximask;
  /**
   * Records whether the character is online (1) or offline (0).
   */
  @Column(name = "online", nullable = false)
  private Byte online;
  /**
   * Boolean 1 or 0 controlling whether the start cinematic has been shown or not.
   */
  @Column(name = "cinematic", nullable = false)
  private Byte cinematic;
  /**
   * The total time that the character has been active in the world.
   */
  @Column(name = "totaltime", nullable = false)
  private Integer totaltime;
  /**
   * The total time the character has spent in the world at the current level.
   */
  @Column(name = "leveltime", nullable = false)
  private Integer leveltime;
  /**
   * The time when the character last logged out, measured in Unix time.
   */
  @Column(name = "logout_time", nullable = false)
  private Long logoutTime;
  /**
   * Boolean 1 or 0 controlling if the character is currently in a resting zone.
   */
  @Column(name = "is_logout_resting", nullable = false)
  private Byte isLogoutResting;
  /**
   * This is the rest bonus for the character.
   */
  @Column(name = "rest_bonus", nullable = false)
  private Float restBonus;
  /**
   * The cost for the character to reset its talents, measured in copper.
   */
  @Column(name = "resettalents_cost", nullable = false)
  private Integer resettalentsCost;
  @Column(name = "resettalents_time", nullable = false)
  private Long resettalentsTime;
  /**
   * The X coordinate of the character on the transport it is travelling on.
   */
  @Column(name = "trans_x", nullable = false)
  private Float transX;
  /**
   * The Y coordinate of the character on the transport it is travelling on.
   */
  @Column(name = "trans_y", nullable = false)
  private Float transY;
  /**
   * The Z coordinate of the character on the transport it is travelling on.
   */
  @Column(name = "trans_z", nullable = false)
  private Float transZ;
  /**
   * The orientation of the character on the transport it is travelling on.
   */
  @Column(name = "trans_o", nullable = false)
  private Float transO;
  /**
   * This is the transprt the character is currently travelling on.
   */
  @Column(name = "transguid", nullable = false)
  private Long transguid;
  /**
   * These flags control certain player specific attributes, mostly GM features.
   */
  @Column(name = "extra_flags", nullable = false)
  private Integer extraFlags;
  /**
   * The number of stable slots the player has available. Maximum is 2.
   */
  @Column(name = "stable_slots", nullable = false)
  private boolean stableSlots;
  /**
   * The status of the character.
   */
  @Column(name = "at_login", nullable = false)
  private Integer atLogin;
  /**
   * The zone ID the character is in.
   */
  @Column(name = "zone", nullable = false)
  private Integer zone;
  /**
   * Time when a character can be resurrected.
   */
  @Column(name = "death_expire_time", nullable = false)
  private Long deathExpireTime;
  /**
   * Stores the players current taxi path (TaxiPath.dbc) if logged off while on one.
   */
  @Column(name = "taxi_path", nullable = true)
  private String taxiPath;
  /**
   * This shows the highest honor rank ever earned.
   */
  @Column(name = "honor_highest_rank", nullable = false)
  private Integer honorHighestRank;
  @Column(name = "honor_standing", nullable = false)
  private Integer honorStanding;
  /**
   * This is the current amount of honor points.
   */
  @Column(name = "stored_honor_rating", nullable = false)
  private Float storedHonorRating;
  /**
   * The is the total dishonorable kills made by the character.
   */
  @Column(name = "stored_dishonorable_kills", nullable = false)
  private Integer storedDishonorableKills;
  /**
   * The is the total honorable kills made by the character.
   */
  @Column(name = "stored_honorable_kills", nullable = false)
  private Integer storedHonorableKills;
  /**
   * The faction whose rep is being followed on the experience bar.
   */
  @Column(name = "watchedFaction", nullable = false)
  private Integer watchedfaction;
  /**
   * This represents the alcoholic strength of the drink.
   */
  @Column(name = "drunk", nullable = false)
  private Short drunk;
  /**
   * The character's health when logging out.
   */
  @Column(name = "health", nullable = false)
  private Integer health;
  /**
   * If a mana user, then this is a character's mana level when logging out.
   */
  @Column(name = "power1", nullable = false)
  private Integer power1;
  /**
   * If a warrior, then this is a character's rage level when logging out.
   */
  @Column(name = "power2", nullable = false)
  private Integer power2;
  /**
   * This is a hunter pet's focus level.
   */
  @Column(name = "power3", nullable = false)
  private Integer power3;
  /**
   * If a rogue, then this is a character's energy level when logging out.
   */
  @Column(name = "power4", nullable = false)
  private Integer power4;
  /**
   * This is the current active pet's happiness level.
   */
  @Column(name = "power5", nullable = false)
  private Integer power5;
  /**
   * This is a record of all areas discovered by the character.
   */
  @Column(name = "exploredZones", nullable = true)
  private String exploredzones;
  /**
   * This is a record of all items that are currently equipped.
   */
  @Column(name = "equipmentCache", nullable = true)
  private String equipmentcache;
  /**
   * This is the item_template Entry ID of the ammo currently equipped.
   */
  @Column(name = "ammoId", nullable = false)
  private Integer ammoid;
  /**
   * This represents which action bars are currently active.
   */
  @Column(name = "actionBars", nullable = false)
  private Byte actionbars;
  /**
   * This is the account number from the characters table.
   */
  @Column(name = "deleteInfos_Account", nullable = true)
  private Integer deleteinfosAccount;
  /**
   * The is the name of the character being deleted.
   */
  @Column(name = "deleteInfos_Name", nullable = true)
  private String deleteinfosName;
  /**
   * This is the date the character was deleted,
   */
  @Column(name = "deleteDate", nullable = true)
  private Long deletedate;
}