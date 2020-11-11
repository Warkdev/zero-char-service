package eu.getmangos.rest;

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

import eu.getmangos.dto.CreatureRespawnDTO;

public interface InstanceResource {

    @GET
    @Path("/{instance_id}/creature_respawn")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Retrieves a list of creature respawn timers for the given instance from the database.",
        description = "This API is returning a list of creature respawn timers from the database. A missing page and page size will return the first 20 results."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "200", description = "A list of creature respawn timers", content = @Content(
                        mediaType = "application/json", schema = @Schema(implementation = CreatureRespawnDTO.class)
                )
            ),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response findAllCreatureRespawn(@PathParam("instance_id") Integer instanceId, @QueryParam("page") Integer page, @QueryParam("page_size") Integer pageSize);

    @GET
    @Path("/{instance_id}/creature_respawn/{guid}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Retrieves a specific creature respawn timer for the given instance from the database.",
        description = "This API is returning a specific creature respawn timer from the database."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "200", description = "A list of creature respawn timers", content = @Content(
                        mediaType = "application/json", schema = @Schema(implementation = CreatureRespawnDTO.class)
                )
            ),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "404", description = "Timer not found"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response findCreatureRespawn(@PathParam("instance_id") Integer instanceId, @PathParam("guid") Integer guid);

    @POST
    @Path("/{instance_id}/creature_respawn")
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "Creates a new creature respawn timer within the database for the given instance.",
        description = "This API is creating a new creature respawn timer within the database."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "201", description = "The respawn timer has been created"),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response createCreatureRespawn(@PathParam("instance_id") Integer instanceId, CreatureRespawnDTO entity);

    @PUT
    @Path("/{instance_id}/creature_respawn/{guid}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "Updates a creature respawn timer within the database.",
        description = "This API is updating a creature respawn timer within the database."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "200", description = "The creature respawn timer has been created"),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response updateCreatureRespawnTimer(@PathParam("instance_id") Integer instanceId, @PathParam("guid") Integer guid, CreatureRespawnDTO entity);

    @DELETE
    @Path("/{instance_id}/creature_respawn")
    @Operation(summary = "Delete all creature respawn timer for the given instance",
        description = "This API is deleting all existing creature respawn timers for the given instance ID."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "204", description = "The creature respawn timers has been deleted", content = @Content(
                        mediaType = "application/json"
                )
            ),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected even occured")
        }
    )
    public Response deleteAllCreatureRespawnTimer(@PathParam("instance_id") Integer instanceId);

    @DELETE
    @Path("/{instance_id}/creature_respawn/{guid}")
    @Operation(summary = "Delete a creature respawn timer",
        description = "This API is deleting an existing creature respawn timer based on the provided id."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "204", description = "The creature respawn timer has been deleted", content = @Content(
                        mediaType = "application/json"
                )
            ),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected even occured")
        }
    )
    public Response deleteCreatureRespawnTimer(@PathParam("instance_id") Integer instanceId, @PathParam("guid") Integer guid);
}
