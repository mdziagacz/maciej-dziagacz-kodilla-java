package com.kodilla.good.patterns.food2door;

public class FoodOrder {

    private Supplier supplier;
    private String itemName;
    private int itemAmount;

    public FoodOrder(Supplier supplier, String itemName, int itemAmount) {
        this.supplier = supplier;
        this.itemName = itemName;
        this.itemAmount = itemAmount;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public String getItemName() {
        return itemName;
    }

    public int getItemAmount() {
        return itemAmount;
    }
}