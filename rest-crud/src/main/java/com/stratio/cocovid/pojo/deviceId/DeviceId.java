package com.stratio.cocovid.pojo.deviceId;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class DeviceId {
    private String uId;
    private String dId;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getdId() {
        return dId;
    }

    public void setdId(String dId) {
        this.dId = dId;
    }
}
