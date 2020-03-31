package com.stratio.cocovid.admin;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;

@Path("/admin")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AdminResource {

    @PUT
    public Response createModify(Admin dto){
        System.out.println(dto);
        return Response.status(200).entity(Collections.EMPTY_MAP).build();
    }

    @DELETE
    public Response delete(Admin dto){
        System.out.println(dto);
        return Response.status(200).entity(Collections.EMPTY_MAP).build();
    }

}
