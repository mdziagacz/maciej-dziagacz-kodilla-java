package com.kodilla.testing.shape;

public class Square implements Shape {
    private String name;
    private double sideLength;

    public Square(String name, double sideLength) {
        this.name = name;
        this.sideLength = sideLength;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return Math.pow(sideLength, sideLength);
    }
}
