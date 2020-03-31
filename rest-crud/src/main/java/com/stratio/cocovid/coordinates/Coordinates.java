package com.stratio.cocovid.coordinates;

public class Coordinates {
    public Integer uId;
    public String uPw;
    public LocArray locArray;

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

    public LocArray getLocArray() {
        return locArray;
    }

    public void setLocArray(LocArray locArray) {
        this.locArray = locArray;
    }
}
