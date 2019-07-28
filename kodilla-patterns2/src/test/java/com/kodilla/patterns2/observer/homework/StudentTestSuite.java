package com.kodilla.patterns2.observer.homework;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@SpringBootTest
public class StudentTestSuite {
    @Test
    public void testAdd(){
        //Given
        Student tom = new Student("Tom");
        Student john = new Student("John");
        Student betty = new Student("Betty");
        Mentor patric = new Mentor("Patrick");
        Mentor mathew = new Mentor("Mathew");
        tom.registerObserver(patric);
        john.registerObserver(patric);
        betty.registerObserver(mathew);

        //When
        tom.addTask("task 1");
        tom.addTask("task 2");
        tom.addTask("task 3");
        john.addTask("task 4");
        john.addTask("task 5");
        betty.addTask("task 6");

        //Then
        assertEquals(5, patric.getCounter());
        assertEquals(1, mathew.getCounter());
    }
}
