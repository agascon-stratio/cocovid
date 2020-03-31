package com.stratio.cocovid.testResult;

import com.stratio.cocovid.DefaultResponse;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/testresult")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TestResultResource {
    @GET
    public Response getTestResult(TestResult request){
        System.out.println(request);
        return Response.status(200).entity(new TestResultResponse(0)).build();
    }

    @POST
    public Response manualTestResult(ManualTestResult request){
        System.out.println(request);
        return Response.status(200).entity(new DefaultResponse(0)).build();
    }
}
