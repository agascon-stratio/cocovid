package com.stratio.cocovid.pojo.coordinates;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.quarkus.runtime.annotations.RegisterForReflection;

import java.util.List;

@RegisterForReflection
public class LocArray {
    @JsonProperty("tInterval")
    private List<List<Integer>> tInterval = null;
    @JsonProperty("detGPS")
    private List<List<Double>> detGPS = null;
    @JsonProperty("bssids")
    private List<List<Integer>> bssids = null;
    @JsonProperty("cellids")
    private List<List<Integer>> cellids = null;

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
