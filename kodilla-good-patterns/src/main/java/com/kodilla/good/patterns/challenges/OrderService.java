package com.kodilla.good.patterns.challenges;

public interface OrderService {

    default boolean executeOrder(Order order) {
        System.out.println("fulfillment of the order no " + order.getOrderNumber() +
                " dated " + order.getOderDate() + " from " + order.getUser());
        return true;
    }
}
