package com.stratio.cocovid.pojo.coordinates;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.List;

@RegisterForReflection
public class Coordinates {
    @JsonProperty("uId")
    private String uId;
    @JsonProperty("locArray")
    private LocArray locArray;
    @JsonProperty("btArray")
    private List<String> btArray = null;

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
