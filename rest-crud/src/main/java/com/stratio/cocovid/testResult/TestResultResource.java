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
    public TestResultResponse getTestResult(TestResult request){
        System.out.println(request);
        return new TestResultResponse(0);
    }

    @POST
    public DefaultResponse manualTestResult(ManualTestResult request){
        System.out.println(request);
        return new DefaultResponse(0);
    }
}
