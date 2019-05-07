package com.kodilla.good.patterns.flightfinder;

public class runner {

    public static void main(String[] args) {

        Finder find = new Finder();

        find.flightFrom("GDANSK");
        find.flightToWithoutTransfer("WARSZAWA");
        find.flightFromToWithTransfer("BERLIN", "MADRYT", "WARSZAWA");
    }
}
