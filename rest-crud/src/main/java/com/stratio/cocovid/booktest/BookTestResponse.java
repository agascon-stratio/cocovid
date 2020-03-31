package com.stratio.cocovid.booktest;

import com.stratio.cocovid.DefaultResponse;

public class BookTestResponse extends DefaultResponse {
    private String vId;

    public BookTestResponse(Integer result, String vId) {
        super(result);
        this.vId = vId;
    }

    public String getvId() {
        return vId;
    }

    public void setvId(String vId) {
        this.vId = vId;
    }
}
