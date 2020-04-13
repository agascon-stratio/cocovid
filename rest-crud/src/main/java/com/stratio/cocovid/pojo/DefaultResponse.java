package com.stratio.cocovid.pojo;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class DefaultResponse {
    private Integer result;

    public DefaultResponse(Integer result) {
        this.result = result;
    }

    public Integer getResult() {
        return result;
    }

    public void setResult(Integer result) {
        this.result = result;
    }
}
