package com.stratio.cocovid.testResult;

public class TestResult {
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
