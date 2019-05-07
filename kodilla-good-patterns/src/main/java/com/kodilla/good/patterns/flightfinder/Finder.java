package com.kodilla.good.patterns.flightfinder;

import java.util.Set;
import java.util.stream.Collectors;

public class Finder {


    public void flightFrom(String from) {
        System.out.println("\nAll flights from: " + from);
        Set<Flight> result = new FlightsDataBase().flightsReceiver().stream()
                .filter(departure -> departure.getDepartureAirport().equals(from))
                .collect(Collectors.toSet());

        printer(result);
    }

    public void flightToWithoutTransfer(String to) {
        System.out.println("\nAll flights to: " + to);
        Set<Flight> result = new FlightsDataBase().flightsReceiver().stream()
                .filter(departure -> departure.getArrivalAirport().equals(to))
                .collect(Collectors.toSet());

        printer(result);
    }

    public void flightFromToWithTransfer(String from, String to, String transfer) {
        System.out.println("\nAll flights from: " + from + " to: " + "with transfer in: " + transfer);

        Set<Flight> firstFly = new FlightsDataBase().flightsReceiver().stream()
                .filter(departure -> departure.getDepartureAirport().equals(from))
                .filter(transfers -> transfers.getArrivalAirport().equals(transfer))
                .collect(Collectors.toSet());

        Set<Flight> finalDestination = new FlightsDataBase().flightsReceiver().stream()
                .filter(destination -> destination.getArrivalAirport().equals(to))
                .filter(transfers -> transfers.getDepartureAirport().equals(transfer))
                .collect(Collectors.toSet());

        printer(firstFly);
        printer(finalDestination);
    }

    private void printer(Set<Flight> result) {
        if (result.size() != 0) {
            result.forEach(System.out::println);
        } else {
            System.out.println("flight not found");
        }
    }
}
