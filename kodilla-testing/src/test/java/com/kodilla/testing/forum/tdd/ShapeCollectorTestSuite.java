package com.kodilla.testing.forum.tdd;

import com.kodilla.testing.shape.Circle;
import com.kodilla.testing.shape.Shape;
import com.kodilla.testing.shape.ShapeCollector;
import com.kodilla.testing.shape.Triangle;
import org.junit.Assert;
import org.junit.Test;

public class ShapeCollectorTestSuite {

    @Test
    public void testAddFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("circle", 5);

        //When
        shapeCollector.addFigure(circle);

        //Then
        Assert.assertEquals(circle, shapeCollector.getFigure(0));
        Assert.assertEquals(1, shapeCollector.listSize());
    }

    @Test
    public void testRemoveFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("circle", 5);
        Shape triangle = new Triangle("triangle", 10);
        shapeCollector.addFigure(circle);
        shapeCollector.addFigure(triangle);

        //When
        shapeCollector.removeFigure(circle);

        //Then
        Assert.assertEquals(triangle, shapeCollector.getFigure(0));
        Assert.assertEquals(1, shapeCollector.listSize());
    }

    @Test
    public void testGetFigure() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();
        Shape circle = new Circle("circle", 5);
        shapeCollector.addFigure(circle);

        //When
        Shape testedShape = shapeCollector.getFigure(0);

        //Then
        Assert.assertEquals(circle, testedShape);
    }

    @Test
    public void testGetFigureBelowZeroIndex() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Shape testedShape = shapeCollector.getFigure(-5);

        //Then
        Assert.assertNull(testedShape);
    }

    @Test
    public void testGetFigureOutOfRange() {
        //Given
        ShapeCollector shapeCollector = new ShapeCollector();

        //When
        Shape testedShape = shapeCollector.getFigure(shapeCollector.listSize() + 1);

        //Then
        Assert.assertNull(testedShape);
    }

}