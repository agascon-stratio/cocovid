package com.stratio.cocovid.passwordReset;

public class pwReset {
    private String uId;
    private String code;
    private String uPw;

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getuPw() {
        return uPw;
    }

    public void setuPw(String uPw) {
        this.uPw = uPw;
    }

    @Override
    public String toString() {
        return "pwReset{" +
                "uId='" + uId + '\'' +
                ", code='" + code + '\'' +
                ", uPw='" + uPw + '\'' +
                '}';
    }
}
