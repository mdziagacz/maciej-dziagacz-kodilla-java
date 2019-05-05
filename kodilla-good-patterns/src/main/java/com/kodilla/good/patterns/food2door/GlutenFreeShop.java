package com.kodilla.good.patterns.food2door;

public class GlutenFreeShop implements Supplier {

    private double price;
    private double minBill;
    private int discountRate;
    private double bill;

    public GlutenFreeShop(double price, double minBill, int discountRate) {
        this.price = price;
        this.minBill = minBill;
        this.discountRate = discountRate;
    }

    @Override
    public boolean process(FoodOrder foodOrder) {
        if (foodOrder.getItemAmount() * price >= minBill) {
            System.out.println("Order from 'GlutenFreeShop' accepted");
        } else return false;

        bill = foodOrder.getItemAmount() * price;

        if (bill > 50) {
            double discount = bill * discountRate / 100;
            bill = bill - discount;
            System.out.println("Your bill: " + bill);
            System.out.println("You receive a discount: " + discount);
        } else {
            System.out.println("Your bill: " + bill);
        }
        return true;
    }
}