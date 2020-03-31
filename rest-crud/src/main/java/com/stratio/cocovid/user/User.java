package com.stratio.cocovid.user;

public class User {
    private String uId;
    private String uPw;
    private String aId;
    private String aPw;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuPw() {
        return uPw;
    }

    public void setuPw(String uPw) {
        this.uPw = uPw;
    }

    public String getaId() {
        return aId;
    }

    public void setaId(String aId) {
        this.aId = aId;
    }

    public String getaPw() {
        return aPw;
    }

    public void setaPw(String aPw) {
        this.aPw = aPw;
    }
}
