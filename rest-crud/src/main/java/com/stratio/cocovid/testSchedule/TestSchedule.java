package com.stratio.cocovid.testSchedule;

import java.util.List;

public class TestSchedule {

    private String uId;
    private List<Double> uGPS;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public List<Double> getuGPS() {
        return uGPS;
    }

    public void setuGPS(List<Double> uGPS) {
        this.uGPS = uGPS;
    }

    @Override
    public String toString() {
        return "{" +
                "uId='" + uId + '\'' +
                ", uGPS=" + uGPS +
                '}';
    }
}
