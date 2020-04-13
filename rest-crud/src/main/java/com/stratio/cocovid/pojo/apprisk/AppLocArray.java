package com.stratio.cocovid.pojo.apprisk;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;
import java.util.List;

@RegisterForReflection
public class AppLocArray {
    @JsonProperty("appPGS ")
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
