package com.kodilla.good.patterns.food2door;

public class Creator {

    public FoodOrder create() {

        Supplier supplier = new GlutenFreeShop(8.3, 50, 5);
        FoodOrder foodOrder = new FoodOrder(supplier, "dumplings", 10);
        return foodOrder;
    }
}