package com.kodilla.good.patterns.food2door;

public class ExtraFoodShop implements Supplier {

    private double price;
    private double minBill;
    private double bill;

    public ExtraFoodShop(double price, double minBill) {
        this.price = price;
        this.minBill = minBill;
    }

    @Override
    public boolean process(FoodOrder foodOrder) {
        if (foodOrder.getItemAmount() * price >= minBill) {
            System.out.println("Order from 'ExtraFoodShop' accepted");
        } else return false;

        bill = foodOrder.getItemAmount() * price;

        System.out.println("Your bill: " + bill);
        return true;
    }
}