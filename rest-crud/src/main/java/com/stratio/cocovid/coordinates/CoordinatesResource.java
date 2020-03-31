package com.stratio.cocovid.coordinates;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;

@Path("/coordinates")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class CoordinatesResource {

    @POST
    public Response detailCoordinates(Coordinates coordinates){

        try {
            coordinates.locArray.toCoordinates3DT();
        } catch (Exception e) {
            return Response.status(Response.Status.BAD_REQUEST).build();
        }

        return Response.status(200).entity(new CoordinatesResponse(true)).build();
    }
}
