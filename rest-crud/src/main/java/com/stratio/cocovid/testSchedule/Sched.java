package com.stratio.cocovid.testSchedule;

import java.util.List;

public class Sched {
    private String iId;
    private Integer time;
    private String loc;
    private String str;
    private String cit;
    private String pcd;
    private List<Double> iGPS = null;

    public Sched(String iId, Integer time, String loc, String str, String cit, String pcd, List<Double> iGPS) {
        this.iId = iId;
        this.time = time;
        this.loc = loc;
        this.str = str;
        this.cit = cit;
        this.pcd = pcd;
        this.iGPS = iGPS;
    }

    public String getiId() {
        return iId;
    }

    public void setiId(String iId) {
        this.iId = iId;
    }

    public Integer getTime() {
        return time;
    }

    public void setTime(Integer time) {
        this.time = time;
    }

    public String getLoc() {
        return loc;
    }

    public void setLoc(String loc) {
        this.loc = loc;
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    public String getCit() {
        return cit;
    }

    public void setCit(String cit) {
        this.cit = cit;
    }

    public String getPcd() {
        return pcd;
    }

    public void setPcd(String pcd) {
        this.pcd = pcd;
    }

    public List<Double> getiGPS() {
        return iGPS;
    }

    public void setiGPS(List<Double> iGPS) {
        this.iGPS = iGPS;
    }
}
