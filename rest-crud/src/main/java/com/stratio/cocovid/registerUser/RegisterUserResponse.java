package com.stratio.cocovid.registerUser;

import com.stratio.cocovid.DefaultResponse;

public class RegisterUserResponse extends DefaultResponse {
    private String uId;

    public RegisterUserResponse(Integer result, String uId) {
        super(result);
        this.uId = uId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }
}
