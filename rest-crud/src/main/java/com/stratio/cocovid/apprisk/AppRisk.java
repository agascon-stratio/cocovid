package com.stratio.cocovid.apprisk;

public class AppRisk {
    public Integer uId;
    public String uPw;
    public AppLocArray appLocArray;

    public Integer getuId() {
        return uId;
    }

    public void setuId(Integer uId) {
        this.uId = uId;
    }

    public String getuPw() {
        return uPw;
    }

    public void setuPw(String uPw) {
        this.uPw = uPw;
    }

    public AppLocArray getAppLocArray() {
        return appLocArray;
    }

    public void setAppLocArray(AppLocArray appLocArray) {
        this.appLocArray = appLocArray;
    }

    @Override
    public String toString() {
        return "AppRisk{" +
                "uId=" + uId +
                ", uPw='" + uPw + '\'' +
                ", appLocArray=" + appLocArray +
                '}';
    }
}
