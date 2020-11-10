package eu.getmangos.dto;

import java.io.Serializable;
import java.util.Date;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AhbotCategoryDTO implements Serializable{
    private static final long serialVersionUID = 1L;

    @Schema(description = "A unique identifier of the record")
    private long id;

    @Schema(description = "The category to which the multiplier applies")
    private Long category;

    @Schema(description = "The cost multiplier")
    private java.math.BigDecimal multiplier;

    @Schema(description = "The max number of items of this category in the AH")
    private Long maxAuctionCount;

    @Schema(description = "The date when the item will expire")
    private Date expireTime;
}
