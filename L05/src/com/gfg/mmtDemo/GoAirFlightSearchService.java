package com.gfg.mmtDemo;

import java.util.ArrayList;
import java.util.List;

public class GoAirFlightSearchService implements FlightSearchInterface{
    @Override
    public List<FlightData> getFlightBySrcDes(String src, String des) {
        // API call to GoAir Server
        //
        List<FlightData> data = new ArrayList<>();
        data.add(new FlightData("DLI","BLR",15000.00));
        data.add(new FlightData("DLI","BLR",14000.00));
        data.add(new FlightData("DLI","BLR",19000.00));
        return data;
    }
}
