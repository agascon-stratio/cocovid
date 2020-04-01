package com.stratio.cocovid.registermedical;

import com.stratio.cocovid.DefaultResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/registermedical")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class RegisterMedicalResource {
    @POST
    public DefaultResponse registerMedical(RegisterMedical request){
        System.out.println(request);
        return new DefaultResponse(0);
    }
}
