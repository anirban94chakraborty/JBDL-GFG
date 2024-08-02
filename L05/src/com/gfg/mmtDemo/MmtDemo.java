package com.gfg.mmtDemo;

import java.util.ArrayList;
import java.util.List;

public class MmtDemo {

    public static void main(String[] args) {

        List<FlightSearchInterface> flightSearchImps = new ArrayList<>();
        flightSearchImps.add(new IndigoFlightSearchService());
        flightSearchImps.add(new GoAirFlightSearchService());

        MmtSearchService mmtSearchService = new MmtSearchService(flightSearchImps);
        System.out.println(mmtSearchService.getAllFlightsBySrcAndDes("DLI","BLR"));
    }
}
