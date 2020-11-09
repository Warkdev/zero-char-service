package eu.getmangos.dto;

import java.io.Serializable;
import java.util.Date;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AhbotHistoryDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "A unique identifier of the record")
    private long id;

    @Schema(description = "The date at which the item has been bought")
    private Date buyTime;

    @Schema(description = "item ID won for this auction")
    private Long item;

    @Schema(description = "The amount, in copper for this auction")
    private Long bid;

    @Schema(description = "The buyout price, in copper for this auction")
    private Long buyout;

    @Schema(description = "The GUID of the player who won this auction")
    private Long won;
}
