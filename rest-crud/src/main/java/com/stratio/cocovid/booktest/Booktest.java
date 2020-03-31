package com.stratio.cocovid.booktest;

import java.util.List;

public class Booktest {
    private String uId;
    private String mId;
    private List<Double> uGPS;

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
                ", mId='" + mId + '\'' +
                ", uGPS=" + uGPS +
                '}';
    }
}
