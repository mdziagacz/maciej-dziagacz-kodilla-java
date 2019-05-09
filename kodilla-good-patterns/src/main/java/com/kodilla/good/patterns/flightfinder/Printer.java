package com.kodilla.good.patterns.flightfinder;

import java.util.HashSet;
import java.util.Set;

public class Printer {
    static void print(Set<Flight> result) {
        if (result.size() != 0) {
            result.forEach(System.out::println);
        } else {
            System.out.println("flight not found");
        }
    }

    static void print(HashSet<Set<Flight>> result) {
        if (result.size() != 0) {
            result.forEach(System.out::println);
        } else {
            System.out.println("flight not found");
        }
    }

}
