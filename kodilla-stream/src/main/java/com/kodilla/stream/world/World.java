package com.kodilla.stream.world;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

public final class World {
    Set<Continent> world = new HashSet<>();

    public void addContinent(Continent continent) {
        world.add(continent);
    }

    public BigDecimal getPeopleQuantity() {
        return world.stream()
                .flatMap(continent -> continent.continent.stream())
                .map(country -> country.getPeopleQuantity())
                .reduce(BigDecimal.ZERO, (sum, current) -> sum.add(current));
    }
}


