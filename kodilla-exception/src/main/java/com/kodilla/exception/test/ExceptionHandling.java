package com.kodilla.exception.test;

public class ExceptionHandling {
    public static void main(String[] args) {
        SecondChallenge test = new SecondChallenge();

        try{
            test.probablyIWillThrowException(3, 1);
        }catch (Exception e){
            System.out.println("Exception catched");
        }
    }
}
