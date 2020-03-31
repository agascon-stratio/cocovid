package com.stratio.cocovid.testResult;

public class TestResultResponse {
    private Integer infected;

    public TestResultResponse(Integer infected) {
        this.infected = infected;
    }

    public Integer getInfected() {
        return infected;
    }

    public void setInfected(Integer infected) {
        this.infected = infected;
    }
}
