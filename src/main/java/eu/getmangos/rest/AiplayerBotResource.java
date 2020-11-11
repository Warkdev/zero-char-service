package eu.getmangos.rest;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
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

import eu.getmangos.dto.AiPlayerbotNamesDTO;
import eu.getmangos.dto.AiPlayerbotRandomBotsDTO;

public interface AiplayerBotResource {

    @GET
    @Path("/names")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Retrieves a list of names from the database.",
        description = "This API is returning a list of names from the database. A missing page and page size will return the first 20 results."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "200", description = "A list of bot names history", content = @Content(
                        mediaType = "application/json", schema = @Schema(implementation = AiPlayerbotNamesDTO.class)
                )
            ),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response findBotNames(@QueryParam("page") Integer page, @QueryParam("page_size") Integer pageSize);

    @GET
    @Path("/ai/events")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Retrieves a list of bot events given the page and the page size",
        description = "This API is returning a list of bot events processed or to be processed by the AI Playerbot. A missing page and page size will return the first 20 results."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "200", description = "A list of events for any bot", content = @Content(
                        mediaType = "application/json", schema = @Schema(implementation = AiPlayerbotRandomBotsDTO.class)
                )
            ),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response findAllBotEvents(@QueryParam("page") Integer page, @QueryParam("page_size") Integer pageSize);

    @GET
    @Path("/ai/events/{bot_id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Retrieves a list of events processed or to be processed for a given bot",
        description = "This API is returning a list of events for the given bot."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "200", description = "A list of events for the given bot", content = @Content(
                        mediaType = "application/json", schema = @Schema(implementation = AiPlayerbotRandomBotsDTO.class)
                )
            ),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response findBotEvents(@PathParam("bot_id") long botId);

    @DELETE
    @Path("/ai/events/reset")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Reset the AI Bot event system",
        description = "This API is deleting all AI Bot Events processed or to be processed. You must initialize the system again after running this command."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "200", description = "Reset operation succeeded", content = @Content(
                        mediaType = "application/json"
                )
            ),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response resetAllBotEvents();
}
