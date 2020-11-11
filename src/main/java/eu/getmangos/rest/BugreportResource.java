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

import eu.getmangos.dto.BugReportDTO;

public interface BugreportResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Retrieves a list of bug reports from the database.",
        description = "This API is returning a list of bug reports from the database. A missing page and page size will return the first 20 results."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "200", description = "A list of bug reports", content = @Content(
                        mediaType = "application/json", schema = @Schema(implementation = BugReportDTO.class)
                )
            ),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response findAllBugreport(@QueryParam("page") Integer page, @QueryParam("page_size") Integer pageSize);

    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    @Operation(summary = "Retrieves a bug report from the database.",
        description = "This API is returning the matching bug report from the database."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "200", description = "The matching bug report", content = @Content(
                        mediaType = "application/json", schema = @Schema(implementation = BugReportDTO.class)
                )
            ),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "404", description = "Bug report not found"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response findBugreport(@PathParam("id") int id);

    @POST
    @Produces(MediaType.APPLICATION_JSON)
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "Creates a bug report within the database.",
        description = "This API is creating a new bug report within the database."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "201", description = "The bug report has been created"),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response createBugreport(BugReportDTO entity);

    @PUT
    @Path("/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Operation(summary = "Updates a bug report within the database.",
        description = "This API is updating a new bug report within the database."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "200", description = "The bug report has been created"),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected event occured")
        }
    )
    public Response updateBugreport(@PathParam("id") Integer auctionId, BugReportDTO entity);

    @DELETE
    @Path("{id}")
    @Operation(summary = "Delete a bug report",
        description = "This API is deleting an existing bug report based on the provided id."
    )
    @APIResponses(
        value = {
            @APIResponse(responseCode = "204", description = "The bug report has been deleted", content = @Content(
                        mediaType = "application/json"
                )
            ),
            @APIResponse(responseCode = "400", description = "Error with the request"),
            @APIResponse(responseCode = "500", description = "An unexpected even occured")
        }
    )
    public Response deleteBugreport(@PathParam("id") Integer id);
}
