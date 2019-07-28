package com.kodilla.patterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"6703210093", "John", "Smith"},
            {"9012048317", "Ivone", "Novak"},
            {"5608193456", "Jessie", "Pinkman"},
            {"7504139432", "Walter", "White"},
            {"7312019823", "Clara", "Lanson"}};
    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};
    public String getWorkers(int n){
        if (n > workers.length){
            return "";
        }
        return workers[n][0] + ", " + workers[n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }

    public String[][] getWorkers() {
        return workers;
    }

    public double[] getSalaries() {
        return salaries;
    }
}
