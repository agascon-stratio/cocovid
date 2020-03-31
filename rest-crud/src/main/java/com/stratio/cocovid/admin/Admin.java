package com.stratio.cocovid.admin;

public class Admin {
    private String aId;
    private String aPw;
    private String saId;
    private String saPw;

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

    public String getSaId() {
        return saId;
    }

    public void setSaId(String saId) {
        this.saId = saId;
    }

    public String getSaPw() {
        return saPw;
    }

    public void setSaPw(String saPw) {
        this.saPw = saPw;
    }

    @Override
    public String toString() {
        return "AdminDto{" +
                "aId='" + aId + '\'' +
                ", aPw='" + aPw + '\'' +
                ", saId='" + saId + '\'' +
                ", saPw='" + saPw + '\'' +
                '}';
    }
}
