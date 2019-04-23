package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;

public class ShapeCollector {

    private List<Shape> shapes = new ArrayList<Shape>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }

    public void removeFigure(Shape shape) {
        shapes.remove(shape);
    }

    public Shape getFigure(int n) {
        if (n < 0 || n > shapes.size() - 1) {
            return null;
        }
        return shapes.get(n);
    }

    public void showFigures() {
        for (Shape shape : shapes) {
            System.out.println(shape);
        }
    }

    public int listSize() {
        return shapes.size();
    }
}
