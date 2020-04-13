package com.stratio.cocovid.pojo.testresultmendix;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class TestResultMendix {
    private String uId;
    private String mId;
    private Integer infected;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
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
                ", mId='" + mId + '\'' +
                ", infected=" + infected +
                '}';
    }
}
