package com.kodilla.good.patterns.food2door;

public class Runner {

    public static void main(String[] args) {
        Creator order = new Creator();
        FoodOrder foodOrder = order.create();

        FoodOrderProcessor foodOrderProcessor = new FoodOrderProcessor(new OrderConfirmation(), new SupplierOrderService());

        foodOrderProcessor.process(foodOrder);
    }
}