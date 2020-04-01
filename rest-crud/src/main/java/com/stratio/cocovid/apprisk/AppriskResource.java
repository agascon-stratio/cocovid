package com.stratio.cocovid.apprisk;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Collections;

@Path("/apprisk")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class AppriskResource {


    @POST
    public AppriskResponse getApproximateRisk(AppRisk appRisk){
        System.out.println(appRisk);
        return new AppriskResponse(true);
    }

}
