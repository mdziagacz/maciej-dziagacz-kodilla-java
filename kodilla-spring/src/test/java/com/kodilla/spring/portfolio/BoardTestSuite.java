package com.kodilla.spring.portfolio;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BoardTestSuite {

    @Test
    public void testTaskAdd() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring.portfolio");
        Board board = context.getBean(Board.class);

        //When
        board.getToDoList().tasks.add("toDo1");
        board.getDoneList().tasks.add(("done1"));
        board.getInProgressList().tasks.add("inProgress1");

        //Then
        board.getToDoList().tasks.stream()
                .forEach(System.out::println);

        board.getDoneList().tasks.stream()
                .forEach(System.out::println);

        board.getInProgressList().tasks.stream()
                .forEach(System.out::println);
    }
}
