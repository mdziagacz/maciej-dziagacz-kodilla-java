package com.kodilla.spring.portfolio;

import org.springframework.stereotype.Component;


@Component
public class Board {
    private TaskList toDoList;
    private TaskList inProgressList;
    private TaskList doneList;

    public void setToDoList(TaskList toDoList) {
        this.toDoList = toDoList;
    }

    public void setInProgressList(TaskList inProgressList) {
        this.inProgressList = inProgressList;
    }

    public void setDoneList(TaskList doneList) {
        this.doneList = doneList;
    }

    public TaskList getToDoList() {
        return toDoList;
    }

    public TaskList getInProgressList() {
        return inProgressList;
    }

    public TaskList getDoneList() {
        return doneList;
    }
}
