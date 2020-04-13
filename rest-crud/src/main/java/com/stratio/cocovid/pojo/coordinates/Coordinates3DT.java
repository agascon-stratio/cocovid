package com.stratio.cocovid.pojo.coordinates;

import java.util.List;

public class Coordinates3DT {
    private Integer from;
    private Integer to;
    private List<Number> gpsCoordinates;
    private List<Number> BSSIDs;
    private List<Number> CellIds;

    public Coordinates3DT(Integer from, Integer to, List<Number> gpsCoordinates, List<Number> BSSIDs, List<Number> cellIds) {
        this.from = from;
        this.to = to;
        this.gpsCoordinates = gpsCoordinates;
        this.BSSIDs = BSSIDs;
        CellIds = cellIds;
    }

    @Override
    public String toString() {
        return "{" +
                "from=" + from +
                ", to=" + to +
                ", gpsCoordinates=" + gpsCoordinates +
                ", BSSIDs=" + BSSIDs +
                ", CellIds=" + CellIds +
                '}';
    }
}
