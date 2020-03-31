package com.stratio.cocovid.coordinates;

import javax.json.bind.annotation.JsonbProperty;
import java.util.List;

public class LocArray {
    private List<List<Integer>> tInterval;
    private List<List<Double>> detGPS;
    private List<List<Integer>> bssids;
    private List<List<Integer>> cellids;

    public List<List<Integer>> gettInterval() {
        return tInterval;
    }

    public void settInterval(List<List<Integer>> tInterval) {
        this.tInterval = tInterval;
    }

    public List<List<Double>> getDetGPS() {
        return detGPS;
    }

    public void setDetGPS(List<List<Double>> detGPS) {
        this.detGPS = detGPS;
    }

    public List<List<Integer>> getBssids() {
        return bssids;
    }

    public void setBssids(List<List<Integer>> bssids) {
        this.bssids = bssids;
    }

    public List<List<Integer>> getCellids() {
        return cellids;
    }

    public void setCellids(List<List<Integer>> cellids) {
        this.cellids = cellids;
    }

    @Override
    public String toString() {
        return "{" +
                "tInterval=" + tInterval +
                ", detGPS=" + detGPS +
                ", bssids=" + bssids +
                ", cellids=" + cellids +
                '}';
    }
}
