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
    public CoordinatesResponse detailCoordinates(Coordinates coordinates){
        System.out.println(coordinates);
        return new CoordinatesResponse(true);
    }
}
