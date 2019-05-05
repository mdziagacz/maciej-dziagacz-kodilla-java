package com.kodilla.good.patterns.food2door;

public class SupplierOrderService implements FoodOrderService {

    @Override
    public boolean foodOrderService(double foodAmount) {
        return foodAmount > 0;
    }
}