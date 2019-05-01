package com.kodilla.exception.test;

public class SecondChallenge {
    public String probablyIWillThrowException(double x, double y) throws ExceptionHandling {
        try {
            if (x >= 2 || x < 1 || y == 1.5) {
            }
        }catch (Exception e){
            throw new ExceptionHandling();
        }finally {
            return "Done!";
        }
    }
}
