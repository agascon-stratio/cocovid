package com.stratio.cocovid.coordinates;

import javax.json.bind.annotation.JsonbProperty;
import java.util.List;

public class LocArray {
    @JsonbProperty("3DTcoordinates")
    public List<List<Object>> _3DTcoordinates;

    public List<Coordinates3DT> toCoordinates3DT() throws Exception {


        for(List<Object> rawList:_3DTcoordinates){
            int size = rawList.size();
            if(size != 5){
                throw new Exception("invalid arguments");
            }

            Integer from = Integer.valueOf(String.valueOf(rawList.get(0)));
            Integer to = Integer.valueOf(String.valueOf(rawList.get(1)));
            List<Number> gps = (List<Number>)rawList.get(2);
            List<Number> bssids = (List<Number>)rawList.get(3);
            List<Number> cellids = (List<Number>)rawList.get(4);

            System.out.println(new Coordinates3DT(from,to,gps,bssids,cellids).toString());

        }


        return null;
    }
}
