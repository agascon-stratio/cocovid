package com.stratio.cocovid.pojo.coordinates;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class CoordinatesResponse {
    private Boolean match;

    public CoordinatesResponse() {
    }

    public CoordinatesResponse(Boolean match) {
        this.match = match;
    }

    public Boolean getMatch() {
        return match;
    }

    public void setMatch(Boolean match) {
        this.match = match;
    }
}
