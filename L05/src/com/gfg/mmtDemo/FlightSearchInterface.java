package com.gfg.mmtDemo;

import java.util.List;

public interface FlightSearchInterface {

    List<FlightData> getFlightBySrcDes(String src, String des);
}
