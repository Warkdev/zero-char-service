package eu.getmangos.rest;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.eclipse.microprofile.openapi.annotations.Operation;
import org.eclipse.microprofile.openapi.annotations.media.Content;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponse;
import org.eclipse.microprofile.openapi.annotations.responses.APIResponses;
import org.eclipse.microprofile.openapi.annotations.media.Schema;

import eu.getmangos.dto.AhbotCategoryDTO;
import eu.getmangos.dto.AhbotHistoryDTO;
import eu.getmangos.dto.AhbotPriceDTO;

public interface AhBotResource {

    @GET
    @Path("/history")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Retrieves a list of AH Bot Auction History given the page and the page size",
        description = "This API is returning a list of historical auctions."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "200", description = "A list of auctions history", content = @Content(
                        mediaType = "application/json", schema = @Schema(implementation = AhbotHistoryDTO.class)
                )
            ),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response findAhBotHistory(@QueryParam("page") Integer page, @QueryParam("page_size") Integer pageSize);


    @GET
    @Path("/market_price/{auction_house}/{item}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Retrieves a list of AH Bot Market Prices for an item at an auction house given the page and the page size",
        description = "This API is returning a list of market prices used by the AH Bot."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "200", description = "A list of market prices for an item and the given auction house", content = @Content(
                        mediaType = "application/json", schema = @Schema(implementation = AhbotPriceDTO.class)
                )
            ),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response findAhBotMarketPrices(@PathParam("auction_house") Long auctionHouse, @PathParam("item") Long item, @QueryParam("page") Integer page, @QueryParam("page_size") Integer pageSize);

    @GET
    @Path("/multipliers")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Retrieves a list of Category Multipliers used by the AH Bot",
        description = "This API is returning a list of category multipliers used by the AH Bot."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "200", description = "A list of category multipliers used by the AH Bot", content = @Content(
                        mediaType = "application/json", schema = @Schema(implementation = AhbotCategoryDTO.class)
                )
            ),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response findAhBotCategoryMultipliers();
}
