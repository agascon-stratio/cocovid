package com.stratio.cocovid.pojo.apprisk;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class AppriskResponse {
    private Boolean match;

    public AppriskResponse() {
    }

    public AppriskResponse(Boolean match) {
        this.match = match;
    }

    public Boolean getMatch() {
        return match;
    }

    public void setMatch(Boolean match) {
        this.match = match;
    }
}
