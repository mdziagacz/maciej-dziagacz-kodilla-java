package com.kodilla.patterns.factory.tasks;

import org.junit.Assert;
import org.junit.Test;

public class TaskFactoryTestSuite {
    @Test
    public void testFactoryShopping() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task shoppingTask = taskFactory.taskCreator(TaskFactory.SHOPPING);
        shoppingTask.executeTask();

        //Then
        Assert.assertEquals("shopping", shoppingTask.getTaskName());
        Assert.assertEquals(true, shoppingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryDriving() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task drivingTask = taskFactory.taskCreator(TaskFactory.DRIVING);
        drivingTask.executeTask();

        //Then
        Assert.assertEquals("driving", drivingTask.getTaskName());
        Assert.assertEquals(true, drivingTask.isTaskExecuted());
    }

    @Test
    public void testFactoryPainting() {
        //Given
        TaskFactory taskFactory = new TaskFactory();

        //When
        Task paintingTask = taskFactory.taskCreator(TaskFactory.PAINTING);
        paintingTask.executeTask();

        //Then
        Assert.assertEquals("painting", paintingTask.getTaskName());
        Assert.assertEquals(true, paintingTask.isTaskExecuted());
    }
}

