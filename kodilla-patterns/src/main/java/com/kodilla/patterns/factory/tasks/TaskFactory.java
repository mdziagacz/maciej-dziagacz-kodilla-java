package com.kodilla.patterns.factory.tasks;

public class TaskFactory {
    public final static String DRIVING = "DRIVING";
    public final static String PAINTING = "PAINTING";
    public final static String SHOPPING = "SHOPPING";

    public Task taskCreator(String task) {
        switch (task) {
            case DRIVING: return new DrivingTask("driving", "Wroclaw", "blablacar");
            case PAINTING: return new PaintingTask("painting", "black", "circle");
            case SHOPPING: return new ShoppingTask("shopping", "bread", 1.5 );
            default: return null;
        }
    }
}
