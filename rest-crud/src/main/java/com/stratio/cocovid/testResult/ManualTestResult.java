package com.stratio.cocovid.testResult;

public class ManualTestResult {
    private String uId;
    private Integer infected;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Integer getInfected() {
        return infected;
    }

    public void setInfected(Integer infected) {
        this.infected = infected;
    }

    @Override
    public String toString() {
        return "{" +
                "uId='" + uId + '\'' +
                ", infected=" + infected +
                '}';
    }
}
