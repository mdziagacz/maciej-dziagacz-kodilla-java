package com.kodilla.good.patterns.food2door;

public class HealthyShop implements Supplier {

    private double price;
    private final double shipmentCost = 5;
    private double bill;

    public HealthyShop(double price) {
        this.price = price;
    }

    @Override
    public boolean process(FoodOrder foodOrder) {
        System.out.println("Order from 'HealthyShop' accepted");

        bill = foodOrder.getItemAmount() * price + shipmentCost;

        System.out.println("Your bill: " + bill);
        return true;
    }
}