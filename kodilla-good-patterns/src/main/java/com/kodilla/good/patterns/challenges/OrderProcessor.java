package com.kodilla.good.patterns.challenges;

public class OrderProcessor {
    private OrderService orderService;
    private InformationService informationService;
    private OrderRepository orderRepository;

    public OrderProcessor(final OrderService orderService, final InformationService informationService, final OrderRepository orderRepository) {
        this.orderService = orderService;
        this.informationService = informationService;
        this.orderRepository = orderRepository;
    }

    public void process(Order order) {
        boolean isExecuted = orderService.executeOrder(order);

        if (isExecuted) {
            informationService.inform(order);
            orderRepository.createOrder(order, true);
        } else {
            orderRepository.createOrder(order, false);
        }
    }
}
