package com.kodilla.good.patterns.food2door;

public class FoodOrderProcessor {

    private InformationService informationService;
    private FoodOrderService foodOrderService;

    public FoodOrderProcessor(InformationService informationService, FoodOrderService foodOrderService) {
        this.informationService = informationService;
        this.foodOrderService = foodOrderService;
    }

    public FoodOrderDto process(final FoodOrder foodOrder) {
        boolean isOrdered = foodOrderService.foodOrderService(foodOrder.getItemAmount());

        if (isOrdered) {
            informationService.inform(foodOrder.getSupplier(), foodOrder);
            return new FoodOrderDto(foodOrder, true);
        } else {
            return new FoodOrderDto(foodOrder, false);
        }
    }
}