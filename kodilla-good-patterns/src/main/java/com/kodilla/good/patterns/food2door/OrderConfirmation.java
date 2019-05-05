package com.kodilla.good.patterns.food2door;

public class OrderConfirmation implements InformationService {

    @Override
    public void inform(Supplier supplier, FoodOrder foodOrder) {
        if (supplier.process(foodOrder)) {
            String supplierName = supplier.getClass().toString();
            supplierName = supplierName.substring(supplierName.lastIndexOf(".") + 1, supplierName.length());
            System.out.println("Order from " + supplierName + " has been realized");
        } else {
            System.out.println("Order rejected");
        }
    }
}