package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    @After
    public void after(){
        System.out.println("test zakończony");
    }

    @Before
    public void before(){
        System.out.print("rozpoczynam test ");
    }

    @Test
    public void testOddNumbersExterminatorNormalList(){
        System.out.println("na parzyste");
        //Given
        ArrayList<Integer> testList = new ArrayList<>();
        ArrayList<Integer> exterminatedList = new ArrayList<>();
        List<Integer> expectedList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        boolean test;
        testList.add(3);
        testList.add(6);
        testList.add(9);
        testList.add(2);
        expectedList.add(6);
        expectedList.add(2);
        //When
        exterminatedList = exterminator.exterminate(testList);
        //Then
        Assert.assertEquals(expectedList, expectedList);
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        System.out.println("na pustej liście");
        //Given
        ArrayList<Integer> testList = new ArrayList<>();
        ArrayList<Integer> exterminatedList = new ArrayList<>();
        OddNumbersExterminator exterminator = new OddNumbersExterminator();
        //When
        exterminatedList = exterminator.exterminate(testList);
        //Then
        Assert.assertTrue(exterminatedList.size() == 0);
    }
}