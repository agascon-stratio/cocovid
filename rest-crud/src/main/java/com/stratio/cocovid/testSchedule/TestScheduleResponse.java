package com.stratio.cocovid.testSchedule;

import com.stratio.cocovid.DefaultResponse;

public class TestScheduleResponse extends DefaultResponse {
    private Sched sched;

    public Sched getSched() {
        return sched;
    }

    public void setSched(Sched sched) {
        this.sched = sched;
    }

    public TestScheduleResponse(Integer result, Sched sched) {
        super(result);
        this.sched = sched;
    }
}
