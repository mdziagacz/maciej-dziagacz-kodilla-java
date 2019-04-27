package com.kodilla.stream.array;

import org.junit.Assert;
import org.junit.Test;

import static com.kodilla.stream.array.ArrayOperations.getAverage;

public class ArrayOperationsTestSuite {
    @Test
    public void testGetAverage() {
        //Given
        int[] array = {2, 4, 6, 8, 10};

        //When
        double average = getAverage(array);

        //Then
        Assert.assertEquals(6, average, 0);
    }

    @Test
    public void testGetAverage_emptyArray() {
        //Given
        int[] array = new int[0];

        //When
        double average = getAverage(array);

        //Then
        Assert.assertEquals(0, average, 0);
    }
}
