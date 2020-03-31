package com.stratio.cocovid.loginUser;

public class LoginRequest {
    private String uId;
    private String uPw;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getuPw() {
        return uPw;
    }

    public void setuPw(String uPw) {
        this.uPw = uPw;
    }

    @Override
    public String toString() {
        return "LoginRequest{" +
                "uId='" + uId + '\'' +
                ", uPw='" + uPw + '\'' +
                '}';
    }
}
