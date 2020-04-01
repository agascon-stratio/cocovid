package com.stratio.cocovid.passwordReset;

import com.stratio.cocovid.DefaultResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/resetpassword")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PasswordResetResource {

    @POST
    public DefaultResponse resetPassword(pwReset request){
        System.out.println(request);
        return new DefaultResponse(0);
    }

}
