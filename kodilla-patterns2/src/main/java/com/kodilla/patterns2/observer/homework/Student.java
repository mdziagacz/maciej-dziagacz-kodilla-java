package com.kodilla.patterns2.observer.homework;

import java.util.ArrayList;
import java.util.List;

public class Student implements Observable {
    private final String name;
    private final List<String> taskList;
    private List<Observer> observers;

    public Student(String name){
        this.name = name;
        taskList = new ArrayList<>();
        observers = new ArrayList<>();
    }

    public void addTask(String task){
        taskList.add(task);
        notifyObservers();
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer: observers){
            observer.update(this);
        }
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    public String getName() {
        return name;
    }

    public List<String> getTaskList() {
        return taskList;
    }
}
