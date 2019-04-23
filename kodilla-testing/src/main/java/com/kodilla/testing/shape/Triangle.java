package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private String name;
    private double sideLength;

    public Triangle(String name, double sideLength) {
        this.name = name;
        this.sideLength = sideLength;
    }

    @Override
    public String getShapeName() {
        return name;
    }

    @Override
    public double getField() {
        return (Math.pow(sideLength, sideLength) * Math.sqrt(3) / 4);
    }
}
