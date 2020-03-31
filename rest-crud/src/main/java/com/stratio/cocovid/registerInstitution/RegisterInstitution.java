package com.stratio.cocovid.registerInstitution;

import java.util.List;

public class RegisterInstitution {

    private String iId;
    private List<Double> iGPS;

    public String getiId() {
        return iId;
    }

    public void setiId(String iId) {
        this.iId = iId;
    }

    public List<Double> getiGPS() {
        return iGPS;
    }

    public void setiGPS(List<Double> iGPS) {
        this.iGPS = iGPS;
    }

    @Override
    public String toString() {
        return "{" +
                "iId='" + iId + '\'' +
                ", iGPS=" + iGPS +
                '}';
    }
}
