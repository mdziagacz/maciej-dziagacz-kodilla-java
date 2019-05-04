package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.Map;

public class Order {
    private int orderNumber;
    private User user;
    private LocalDate oderDate;
    private Map<Product, Integer> orderedProducts;

    public Order(final int orderNumber, final User user, final LocalDate oderDate, final Map<Product, Integer> orderedProducts) {
        this.orderNumber = orderNumber;
        this.user = user;
        this.oderDate = oderDate;
        this.orderedProducts = orderedProducts;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public User getUser() {
        return user;
    }

    public LocalDate getOderDate() {
        return oderDate;
    }

    public Map<Product, Integer> getOrderedProducts() {
        return orderedProducts;
    }
}
