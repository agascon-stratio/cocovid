package com.stratio.cocovid.passwordResetRequest;

public class pwResetRequest {
    private String eml;

    public String getEml() {
        return eml;
    }

    public void setEml(String eml) {
        this.eml = eml;
    }

    @Override
    public String toString() {
        return "pwRequest{" +
                "eml='" + eml + '\'' +
                '}';
    }
}
