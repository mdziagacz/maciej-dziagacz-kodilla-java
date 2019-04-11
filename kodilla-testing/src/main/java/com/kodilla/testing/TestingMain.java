package com.kodilla.testing;

import com.kodilla.testing.calculator.Calculator;
import com.kodilla.testing.user.SimpleUser;

public class TestingMain {
    public static void main(String[] args){
        System.out.println("Moduł 6. Wprowadzenie to testowania oprogramowania");
        String result;

        SimpleUser simpleuser = new SimpleUser("theForumuser");
        result = simpleuser.getUsername();

        if (result.equals("theForumuser")){
            System.out.println("user test OK");
        }
        else {
            System.out.println("test failed");
        }

        Calculator calc = new Calculator();

        if (calc.add(5,5) == 10){
            System.out.println("calc test OK");
        }
        else{
            System.out.println("calc error");
        }

        if (calc.subtract(5,5) == 0){
            System.out.println("calc test OK");
        }
        else{
            System.out.println("calc error");
        }
    }
}