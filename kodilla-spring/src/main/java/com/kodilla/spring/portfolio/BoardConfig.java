package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
public class BoardConfig {
    @Autowired
    @Qualifier("toDo")
    private TaskList toDoList;
    @Autowired
    @Qualifier("inProgress")
    private TaskList inProgressList;
    @Autowired
    @Qualifier("done")
    private TaskList doneList;

    @Bean
    public Board createBoard() {
        return new Board(toDoList, inProgressList, doneList);
    }

    @Bean(name = "toDo")
    @Scope("prototype")
    public TaskList toDoList() {
        return new TaskList();
    }

    @Bean(name = "done")
    @Scope("prototype")
    public TaskList doneList() {
        return new TaskList();
    }

    @Bean(name = "inProgress")
    @Scope("prototype")
    public TaskList inProgressList() {
        return new TaskList();
    }
}
