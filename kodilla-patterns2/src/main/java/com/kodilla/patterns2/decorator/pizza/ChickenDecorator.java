package com.kodilla.patterns2.decorator.pizza;

import java.math.BigDecimal;

public class ChickenDecorator extends AbstractPizzaDecorator {
    public ChickenDecorator(Pizza pizza) {
        super(pizza);
    }

    @Override
    public BigDecimal getPrice() {
        return super.getPrice().add(new BigDecimal(4));
    }

    @Override
    public String getDescription() {
        return super.getDescription() + " + chicken";
    }
}
