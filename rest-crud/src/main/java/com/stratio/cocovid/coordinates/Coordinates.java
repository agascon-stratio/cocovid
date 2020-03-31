package com.stratio.cocovid.coordinates;

import java.util.List;

public class Coordinates {
    private String uId;
    private LocArray locArray;
    private List<String> btArray;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public LocArray getLocArray() {
        return locArray;
    }

    public void setLocArray(LocArray locArray) {
        this.locArray = locArray;
    }

    public List<String> getBtArray() {
        return btArray;
    }

    public void setBtArray(List<String> btArray) {
        this.btArray = btArray;
    }

    @Override
    public String toString() {
        return "{" +
                "uId='" + uId + '\'' +
                ", locArray=" + locArray +
                ", btArray=" + btArray +
                '}';
    }
}
