package com.kodilla.good.patterns.challenges;

import java.util.HashMap;
import java.util.Map;

public interface OrderRepository {
    Map<Order, Boolean> orderRepository = new HashMap<>();

    default boolean createOrder(Order order, boolean executed) {
        orderRepository.put(order, executed);
        System.out.print("order no " + order.getOrderNumber() + " has been processed with status: ");
        if (executed) {
            System.out.println("completed");
        } else {
            System.out.println("unrealized");
        }
        return true;
    }
}
