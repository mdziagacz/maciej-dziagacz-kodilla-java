package com.kodilla.stream.world;

import java.util.HashSet;
import java.util.Set;

public final class Continent {
    Set<Country> continent = new HashSet<>();

    public void addCountry(Country country) {
        continent.add(country);
    }
}


