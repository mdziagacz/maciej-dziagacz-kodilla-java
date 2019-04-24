package com.kodilla;

import com.kodilla.stream.beautifier.PoemBeautifier;
import com.kodilla.stream.beautifier.PoemDecorator;
import com.kodilla.stream.book.Book;
import com.kodilla.stream.book.BookDirectory;
import com.kodilla.stream.iterate.NumbersGenerator;
import com.kodilla.stream.lambda.ExpressionExecutor;
import com.kodilla.stream.lambda.FunctionalCalculator;
import com.kodilla.stream.person.People;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamMain {
    public static void main(String[] args) {
        ExpressionExecutor expressionExecutor = new ExpressionExecutor();

        System.out.println("Calculating expressions with lambdas");
        expressionExecutor.executeExpression(10, 5, (a, b) -> a + b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a - b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a * b);
        expressionExecutor.executeExpression(10, 5, (a, b) -> a / b);

        System.out.println("Calculating expressions with method references");
        expressionExecutor.executeExpression(3, 4, (a, b) -> FunctionalCalculator.multiplyAByB(a, b));
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::addAToB);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::subBFromA);
        expressionExecutor.executeExpression(3, 4, FunctionalCalculator::divideAByB);

//task lambda 7.1
        PoemBeautifier poemBeautifier = new PoemBeautifier();
        System.out.println("text to decorate: lamdba is cool");
        System.out.println("decorated text:");
        String text = "lambda is cool";
        poemBeautifier.beautify(text, textToDecorate -> textToDecorate.toUpperCase());
        poemBeautifier.beautify(text, textToDecorate -> "\\* " + textToDecorate + " */ ");
        poemBeautifier.beautify(text, textToDecorate -> "->" + textToDecorate + "<-");

        System.out.println("Using Stream to generate even numbers from 1 to 20");
        NumbersGenerator.generateEven(20);

// Stream 7.3
        People.getList().stream()
                .filter(s -> s.length() > 11)
                .map(s -> s.substring(0, s.indexOf(' ') + 2) + ".")
                .map(s -> s.toUpperCase())
                .filter(s -> s.substring(0,1).equals("M"))
                .forEach(System.out::println);

        BookDirectory bookDirectory = new BookDirectory();
            BookDirectory theBookDirectory = new BookDirectory();
            String theResultStringOfBooks = theBookDirectory.getList().stream()
                    .filter(book -> book.getYearOfPublication() > 2005)
                    .map(Book::toString)
                    .collect(Collectors.joining(",\n","<<",">>"));

            System.out.println(theResultStringOfBooks);


    }
}
