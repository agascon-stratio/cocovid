package com.stratio.cocovid.registerInstitution;

import com.stratio.cocovid.DefaultResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/registerInstitution")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RegisterInstitutionResource {
    @POST
    public Response newInstitution(RegisterInstitution request){
        System.out.println(request);
        return Response.status(200).entity(new DefaultResponse(0)).build();
    }
}