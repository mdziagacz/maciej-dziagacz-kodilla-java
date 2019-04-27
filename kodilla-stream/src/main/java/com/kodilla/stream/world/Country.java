package com.kodilla.stream.world;

import java.math.BigDecimal;

public final class Country {
    private final String countryName;
    private final BigDecimal countryPeopleQuantity;

    public Country(String countryName, BigDecimal countryPeopleQuantity) {
        this.countryName = countryName;
        this.countryPeopleQuantity = countryPeopleQuantity;
    }

    public BigDecimal getPeopleQuantity() {
        return countryPeopleQuantity;
    }
}
