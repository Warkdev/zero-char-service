package eu.getmangos.dto;

import java.io.Serializable;

import org.eclipse.microprofile.openapi.annotations.media.Schema;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class AhbotPriceDTO implements Serializable {
    private static final long serialVersionUID = 1L;

    @Schema(description = "A unique identifier of the record")
    private Long id;

    @Schema(description = "The item ID for which the market price is adjusted")
    private String item;

    @Schema(description = "The average market price for this item")
    private java.math.BigDecimal price;

    @Schema(description = "The ID of the auction house for which this market price applies")
    private Long auction_house;
}
