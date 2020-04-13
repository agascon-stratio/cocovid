package com.stratio.cocovid.pojo.registerForward;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class RegisterForward {
    private String uId;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    @Override
    public String toString() {
        return "{" +
                "uId='" + uId + '\'' +
                '}';
    }
}
