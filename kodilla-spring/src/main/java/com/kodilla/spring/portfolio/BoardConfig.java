package com.kodilla.spring.portfolio;

import org.springframework.context.annotation.*;

import javax.annotation.Resource;

@Configuration
public class BoardConfig {
    @Resource(name = "toDo")
    private TaskList toDoList;
    @Resource(name = "inProgress")
    private TaskList inProgressList;
    @Resource(name = "done")
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
