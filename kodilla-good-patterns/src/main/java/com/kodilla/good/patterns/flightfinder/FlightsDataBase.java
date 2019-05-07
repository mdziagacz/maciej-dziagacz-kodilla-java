package com.kodilla.good.patterns.flightfinder;

import java.util.HashSet;
import java.util.Set;

public class FlightsDataBase {
    private final Set<Flight> flightsDataBase = new HashSet<>();

    public Set<Flight> flightsReceiver() {
        flightsDataBase.add(new Flight("WROCLAW", "GDANSK"));
        flightsDataBase.add(new Flight("BERLIN", "WARSZAWA"));
        flightsDataBase.add(new Flight("WARSZAWA", "GDANSK"));
        flightsDataBase.add(new Flight("KATOWICE", "GDANSK"));
        flightsDataBase.add(new Flight("WARSZAWA", "MADRYT"));
        flightsDataBase.add(new Flight("MADRYT", "WARSZAWA"));
        flightsDataBase.add(new Flight("GDANSK", "WROCLAW"));
        flightsDataBase.add(new Flight("GDANSK", "PARYZ"));
        return new HashSet<>(flightsDataBase);
    }
}
