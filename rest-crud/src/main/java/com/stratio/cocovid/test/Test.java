package com.stratio.cocovid.test;

public class Test {

    private String aId;
    private String aPw;
    private String uId;
    private Boolean infected;

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

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public Boolean getInfected() {
        return infected;
    }

    public void setInfected(Boolean infected) {
        this.infected = infected;
    }

    @Override
    public String toString() {
        return "Test{" +
                "aId='" + aId + '\'' +
                ", aPw='" + aPw + '\'' +
                ", uId='" + uId + '\'' +
                ", infected=" + infected +
                '}';
    }
}
