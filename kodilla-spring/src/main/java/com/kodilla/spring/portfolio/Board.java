package com.kodilla.spring.portfolio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Board {
    private final TaskList toDoList;
    private final TaskList inProgressList;
    private final TaskList doneList;

    @Autowired
    public Board(@Qualifier("toDo") TaskList toDoList,
                 @Qualifier("inProgress") TaskList inProgressList,
                 @Qualifier("done") TaskList doneList) {
        this.toDoList = toDoList;
        this.inProgressList = inProgressList;
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

    public void addTaskToDo(String task) {
        toDoList.tasks.add(task);
    }

    public void addTaskInProgress(String task) {
        inProgressList.tasks.add(task);
    }

    public void addTaskDone(String task) {
        doneList.tasks.add(task);
    }
}
