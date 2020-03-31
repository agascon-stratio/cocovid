package com.stratio.cocovid.apprisk;
import java.util.List;

public class AppLocArray {
    private List<List<Double>> appPGS;

    public List<List<Double>> getAppPGS() {
        return appPGS;
    }

    public void setAppPGS(List<List<Double>> appPGS) {
        this.appPGS = appPGS;
    }

    @Override
    public String toString() {
        return "{" +
                "appPGS=" + appPGS +
                '}';
    }
}
