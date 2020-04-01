package com.stratio.cocovid.testresultmendix;

import com.stratio.cocovid.DefaultResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/testresultmendix")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TestResultMendixResource {
    @POST
    public DefaultResponse testResultToStratio(TestResultMendix request){
        System.out.println(request);
        return new DefaultResponse(0);
    }
}
