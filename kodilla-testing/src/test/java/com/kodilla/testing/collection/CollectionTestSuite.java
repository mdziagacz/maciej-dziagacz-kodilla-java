package com.kodilla.testing.collection;

import org.junit.*;

import java.util.*;

public class CollectionTestSuite {

    @After
    public void after() {
        System.out.println("test zakończony");
    }

    @Before
    public void before() {
        System.out.println("rozpoczynam test ");
    }

    @Test
    public void testOddNumbersExterminatorNormalList() {
        //Given
        List<Integer> testList = new ArrayList<>();
        List<Integer> expectedList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        testList.add(3);
        testList.add(6);
        testList.add(9);
        testList.add(2);
        expectedList.add(6);
        expectedList.add(2);

        //When
        List<Integer> exterminatedList = exterminator.exterminate(testList);

        //Then
        Assert.assertEquals(expectedList, exterminatedList);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList() {
        //Given
        List<Integer> testList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();

        //When
        List<Integer> exterminatedList = exterminator.exterminate(testList);

        //Then
        Assert.assertTrue(exterminatedList.isEmpty());
    }
}