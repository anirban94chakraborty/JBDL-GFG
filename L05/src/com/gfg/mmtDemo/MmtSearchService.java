package com.gfg.mmtDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

public class MmtSearchService {

    private ExecutorService executorService = Executors.newFixedThreadPool(10);

    List<FlightSearchInterface> flightSearchInterfaces;

    public MmtSearchService(List<FlightSearchInterface> flightSearchInterfaces) {
        this.flightSearchInterfaces = flightSearchInterfaces;
    }

    public List<FlightData> getAllFlightsBySrcAndDes(String src, String des) {

        List<FlightData> response = new ArrayList<>();

        List<Callable<List<FlightData>>> callableList = new ArrayList<>();
        for(FlightSearchInterface flightSearchImpl : flightSearchInterfaces) {
            Callable<List<FlightData>> callable = () -> flightSearchImpl.getFlightBySrcDes(src, des);
            callableList.add(callable);
        }

        try {
            List<Future<List<FlightData>>> futureList = executorService.invokeAll(callableList);
            for(Future<List<FlightData>> future : futureList) {
                try {
                    response.addAll(future.get(300, TimeUnit.MILLISECONDS));
                } catch (TimeoutException e) {
                    throw new RuntimeException(e);
                }
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e);
        }

        return response;
    }
}
