package com.kodilla.good.patterns.flightfinder;

import static com.kodilla.good.patterns.flightfinder.Printer.print;

public class runner {

    public static void main(String[] args) {

        Finder find = new Finder();

        print(find.flightFrom("GDANSK"));
        print(find.flightToWithoutTransfer("PARYZ"));
        print(find.flightToWithTransfer("PARYZ", "WARSZAWA"));
    }
}
