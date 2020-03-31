package com.stratio.cocovid.booktest;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;

@Path("/booktest")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class BookTestResource {

    @POST
    public Response postTestResult(Booktest test){
        System.out.println(test);
        return Response.status(200).entity(new BookTestResponse(0,"432435")).build();
    }

}
