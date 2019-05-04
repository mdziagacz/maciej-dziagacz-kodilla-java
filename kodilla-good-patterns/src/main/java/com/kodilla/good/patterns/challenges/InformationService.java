package com.kodilla.good.patterns.challenges;

import java.util.Map;

public interface InformationService {
    default void inform(Order order) {
        System.out.println("Dear " + order.getUser().getName().substring(0, order.getUser().getName().indexOf(" ")) +
                ", your order no " + order.getOrderNumber() + " dated: " + order.getOderDate());
        for (Map.Entry<Product, Integer> productList : order.getOrderedProducts().entrySet()) {
            System.out.println(productList.getKey() + ", qty: " + productList.getValue());
        }
        System.out.println("has been realized, we invite you to collect it");
    }
}
