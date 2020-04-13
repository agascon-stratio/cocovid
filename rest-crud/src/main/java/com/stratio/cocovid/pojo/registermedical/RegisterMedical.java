package com.stratio.cocovid.pojo.registermedical;

import io.quarkus.runtime.annotations.RegisterForReflection;

@RegisterForReflection
public class RegisterMedical {
    private String iId;
    private String mId;

    public String getiId() {
        return iId;
    }

    public void setiId(String iId) {
        this.iId = iId;
    }

    public String getmId() {
        return mId;
    }

    public void setmId(String mId) {
        this.mId = mId;
    }

    @Override
    public String toString() {
        return "{" +
                "iId='" + iId + '\'' +
                ", mId='" + mId + '\'' +
                '}';
    }
}
