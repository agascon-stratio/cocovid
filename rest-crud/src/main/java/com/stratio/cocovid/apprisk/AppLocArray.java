package com.stratio.cocovid.apprisk;
import java.util.List;

public class AppLocArray {
    public String type;
    public List<List<Double>> coordinates;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<List<Double>> getCoordinates() {
        return coordinates;
    }

    public void setCoordinates(List<List<Double>> coordinates) {
        this.coordinates = coordinates;
    }

    @Override
    public String toString() {
        return "AppLocArray{" +
                "type='" + type + '\'' +
                ", coordinates=" + coordinates +
                '}';
    }
}
