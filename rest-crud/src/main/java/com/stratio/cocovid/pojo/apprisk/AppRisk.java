package com.stratio.cocovid.pojo.apprisk;

import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.List;

@RegisterForReflection
public class AppRisk {
    private String uId;
    private AppLocArray appLocArray;
    private List<String> btArray;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public AppLocArray getAppLocArray() {
        return appLocArray;
    }

    public void setAppLocArray(AppLocArray appLocArray) {
        this.appLocArray = appLocArray;
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
                ", appLocArray=" + appLocArray +
                ", btArray=" + btArray +
                '}';
    }
}
