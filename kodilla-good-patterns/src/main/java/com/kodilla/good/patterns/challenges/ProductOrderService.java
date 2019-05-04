package com.kodilla.good.patterns.challenges;

public class ProductOrderService {
    public static void main(String[] args) {
        Creator creator = new Creator();
        Order order = creator.createData();

        OrderProcessor orderProcessor = new OrderProcessor(
                new OrdersService(), new MailService(), new OrdersDataBase());
        orderProcessor.process(order);
    }
}
