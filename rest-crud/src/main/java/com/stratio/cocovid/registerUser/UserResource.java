package com.stratio.cocovid.registerUser;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;

@Path("/registeruser")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UserResource {

    @POST
    public Response createModify(User dto){
        System.out.println(dto);
        return Response.status(200).entity(new RegisterUserResponse(0,"12345679")).build();
    }


}
