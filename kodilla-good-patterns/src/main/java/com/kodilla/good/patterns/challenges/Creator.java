package com.kodilla.good.patterns.challenges;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class Creator {
    public Order createData() {
        User user1 = new User(1, "Peter Root", "p.root@gmail.com");

        Map<Product, Integer> orderedProducts = new HashMap<>();
        Product product1 = new Product(34, "jar", 2.5);
        Product product2 = new Product(21, "gasket", 0.5);
        Product product3 = new Product(56, "pot", 45);
        orderedProducts.put(product1, 5);
        orderedProducts.put(product2, 5);
        orderedProducts.put(product3, 1);

        return new Order(1, user1, LocalDate.now(), orderedProducts);
    }
}
