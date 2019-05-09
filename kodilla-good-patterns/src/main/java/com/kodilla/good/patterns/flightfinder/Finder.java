package com.kodilla.good.patterns.flightfinder;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

public class Finder {

    public Set<Flight> flightFrom(String from) {
        System.out.println("\nAll flights from: " + from);
        return new FlightsDataBase().flightsReceiver().stream()
                .filter(departure -> departure.getDepartureAirport().equals(from))
                .collect(Collectors.toSet());
    }

    public Set<Flight> flightToWithoutTransfer(String to) {
        System.out.println("\nAll flights to: " + to);
        return new FlightsDataBase().flightsReceiver().stream()
                .filter(departure -> departure.getArrivalAirport().equals(to))
                .collect(Collectors.toSet());
    }

    public HashSet<Set<Flight>> flightToWithTransfer(String to, String from) {

        Set<Flight> dataBase = new FlightsDataBase().flightsReceiver();
        Set<Flight> route = null;
        HashSet<Set<Flight>> result = new HashSet<>();

        System.out.println("\nAll flights from: " + from + " to " + to);

        for (Flight flight : dataBase) {
            if (flight.getArrivalAirport().equals(to)) {
                route = dataBase.stream()
                        .filter(transfer -> flight.getDepartureAirport().equals(transfer.getArrivalAirport()))
                        .filter(transfer -> transfer.getDepartureAirport().equals(from))
                        .collect(Collectors.toSet());
                route.add(flight);
            }
            result.add(route);
        }
        result.remove(null);
        return result;
    }
}
