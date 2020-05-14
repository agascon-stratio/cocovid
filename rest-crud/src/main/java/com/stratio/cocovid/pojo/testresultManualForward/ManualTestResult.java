package com.stratio.cocovid.pojo.testresultManualForward;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class ManualTestResult {
    private String uId;
    private Integer infected;
    private String pdId;
    private String vId;

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

    public String getpdId() {
        return pdId;
    }

    public void setpdId(String pdId) {
        this.pdId = pdId;
    }

    public String getvId() {
        return vId;
    }

    public void setvId(String vId) {
        this.vId = vId;
    }

    @Override
    public String toString() {
        return "{" +
                "uId='" + uId + '\'' +
                "pdId='" + pdId + '\'' +
                "vId='" + vId + '\'' +
                ", infected=" + infected +
                '}';
    }
}
