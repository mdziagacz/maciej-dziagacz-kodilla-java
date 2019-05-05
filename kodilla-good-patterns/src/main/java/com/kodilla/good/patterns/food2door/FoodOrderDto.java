package com.kodilla.good.patterns.food2door;

public class FoodOrderDto {

    private FoodOrder foodOrder;
    private boolean isOrdered;

    public FoodOrderDto(FoodOrder foodOrder, boolean isOrdered) {
        this.foodOrder = foodOrder;
        this.isOrdered = isOrdered;
    }

    public FoodOrder getFoodOrder() {
        return foodOrder;
    }

    public boolean isOrdered() {
        return isOrdered;
    }
}