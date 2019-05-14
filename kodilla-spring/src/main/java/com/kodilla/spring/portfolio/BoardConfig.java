package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class BoardConfig {

    @Autowired
    private Board board;

    @Bean
    public TaskList toDoList() {
        board.setToDoList(new TaskList());
        return board.getToDoList();
    }

    @Bean
    public TaskList doneList() {
        board.setDoneList(new TaskList());
        return board.getToDoList();
    }

    @Bean
    public TaskList InProgressList() {
        board.setInProgressList(new TaskList());
        return board.getToDoList();
    }
}
