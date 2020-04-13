package com.stratio.cocovid.pojo.registerInstitution;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.List;

@RegisterForReflection
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

    public Double getLongitude(){
        return iGPS.get(0);
    }
    public Double getLatitude(){
        return iGPS.get(1);
    }

    @Override
    public String toString() {
        return "{" +
                "iId='" + iId + '\'' +
                ", iGPS=" + iGPS +
                '}';
    }
}
