package com.kodilla.exception.test;

import java.util.HashMap;
import java.util.Map;

public class FlightsSearcher {
    public void findFilght(Flight flight) throws RouteNotFoundException {
        Map<String, Boolean> airports = new HashMap<>();

        airports.put("A", true);
        airports.put("B", false);
        airports.put("C", null);

        System.out.println("\nlooking for arrival airport: " + flight.getArrivalAirport());
        if (!airports.containsKey(flight.getArrivalAirport())){
            throw new RouteNotFoundException();
        } else {
            if (airports.get(flight.getArrivalAirport()) == null) {
                System.out.println("no data about availability");
            } else if (airports.get(flight.getArrivalAirport())) {
                System.out.println("it is available");
            } else {
                System.out.println("it is not available");
            }
        }
    }
}