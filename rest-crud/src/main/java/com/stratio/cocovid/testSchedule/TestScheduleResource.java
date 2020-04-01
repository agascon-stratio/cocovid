package com.stratio.cocovid.testSchedule;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.Arrays;
import java.util.Collections;

@Path("/testschedule")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TestScheduleResource {

    @GET
    public TestScheduleResponse testSchedule(TestSchedule request){
        System.out.println(request);
        return new TestScheduleResponse(0,new Sched("12345679",1310669017,"Room 101","24 Street","Madrid","80235 ", Arrays.asList(100.01123123, 0.01123123)));
    }

}
