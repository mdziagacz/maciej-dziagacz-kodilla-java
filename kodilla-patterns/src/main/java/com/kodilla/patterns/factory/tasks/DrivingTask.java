package com.kodilla.patterns.factory.tasks;

public class DrivingTask implements Task {
    private String taskName;
    private String where;
    private String using;
    private boolean executedTask = false;

    public DrivingTask(String taskName, String where, String using) {
        this.taskName = taskName;
        this.where = where;
        this.using = using;
    }

    @Override
    public void executeTask() {
        System.out.println("I was in " + where + " using " + using);
        executedTask = true;
    }

    @Override
    public String getTaskName() {
        return taskName;
    }

    @Override
    public boolean isTaskExecuted() {
        return executedTask;
    }
}
