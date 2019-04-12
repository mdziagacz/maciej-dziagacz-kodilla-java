package com.kodilla.testing.collection;

import org.junit.*;
import java.util.*;

public class CollectionTestSuite {

    //Given
    ArrayList<Integer> testList = new ArrayList<>();
    ArrayList<Integer> exterminatedList = new ArrayList<>();
    OddNumbersExterminator exterminator = new OddNumbersExterminator();

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
        testList.add(3);
        testList.add(6);
        testList.add(9);
        testList.add(2);
        //When
        exterminatedList = exterminator.exterminate(testList);
        //Then
        for (int i = 0; i < exterminatedList.size(); i++){
            Assert.assertTrue(exterminatedList.get(i) % 2 == 0);
        }
    }

    @Test
    public void testOddNumbersExterminatorEmptyList(){
        System.out.println("na pustej liście");

        //When
        exterminatedList = exterminator.exterminate(testList);
        //Then
        Assert.assertTrue(exterminatedList.size() == 0);
    }
}