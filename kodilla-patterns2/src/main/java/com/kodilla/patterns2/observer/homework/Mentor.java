package com.kodilla.patterns2.observer.homework;

public class Mentor implements Observer{
    private final String name;
    private int counter;

    public Mentor(String name){
        this.name = name;
    }

    @Override
    public void update(Student student) {
        System.out.println("Student " + student.getName() + " has added new task. All added task: " + student.getTaskList().size());
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
