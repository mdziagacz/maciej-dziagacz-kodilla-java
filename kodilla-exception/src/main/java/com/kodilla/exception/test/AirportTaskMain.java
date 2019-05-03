package com.kodilla.exception.test;

public class AirportTaskMain {
    public static void main(String[] args) {
        Flight flight1 = new Flight("X", "A");
        Flight flight2 = new Flight("X", "B");
        Flight flight3 = new Flight("X","C");
        Flight flight4 = new Flight("X","D");

        FlightsSearcher seracher = new FlightsSearcher();

        try{
            seracher.findFilght(flight1);
            seracher.findFilght(flight2);
            seracher.findFilght(flight3);
            seracher.findFilght(flight4);
        }catch (RouteNotFoundException e){
            System.out.println("airport has been not found");
        }finally {
            System.out.println("\nthank you for choose our flights searcher");
        }
    }
}
