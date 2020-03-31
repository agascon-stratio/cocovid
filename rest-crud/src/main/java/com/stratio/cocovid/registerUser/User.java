package com.stratio.cocovid.registerUser;

public class User {
    private String uPw;
    private String eml;
    private String phn;

    public String getuPw() {
        return uPw;
    }

    public void setuPw(String uPw) {
        this.uPw = uPw;
    }

    public String getEml() {
        return eml;
    }

    public void setEml(String eml) {
        this.eml = eml;
    }

    public String getPhn() {
        return phn;
    }

    public void setPhn(String phn) {
        this.phn = phn;
    }

    @Override
    public String toString() {
        return "{" +
                "uPw='" + uPw + '\'' +
                ", eml='" + eml + '\'' +
                ", phn='" + phn + '\'' +
                '}';
    }
}
