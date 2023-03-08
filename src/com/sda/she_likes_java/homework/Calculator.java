package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class Calculator {
    // psvm - a magic shortcut for public static void main

    public static void main(String[] args) {
        System.out.println("com.sda.she_likes_java.homework.Calculator ...");
        System.out.println("Calculating sum of two numbers");
        System.out.println("Provide first number: ");
        int firstNumber;
        int secondNumber;
        // TODO explain object creation
        Scanner inputReader = new Scanner(System.in);
        firstNumber = inputReader.nextInt();
        System.out.println("You provided number: " + firstNumber);
        System.out.println("Provide second number");
        secondNumber = inputReader.nextInt();
        System.out.println("You provided number: " + secondNumber);
        int sum = firstNumber + secondNumber;
        System.out.println("Sum is: " + sum);

        System.out.println("Calculating difference of two numbers");
        System.out.println("Provide third number: ");
        int thirdNumber;
        int fourthNumber;
        Scanner inputReader = new Scanner(System.in);
        thirdNumber = inputReader.nextInt();
        System.out.println("You provided number: " + thirdNumber);
        System.out.println("Provide fourth number");
        fourthNumber = inputReader.nextInt();
        System.out.println("You provided number: " + fourthNumber);
        int difference = thirdNumber - fourthNumber;
        System.out.println("Difference is: " + difference);


        System.out.println("Calculating product of two numbers");
        System.out.println("Provide fifth number: ");
        int fifthNumber;
        int sixthNumber;
        Scanner inputReader = new Scanner(System.in);
        fifthNumber = inputReader.nextInt();
        System.out.println("You provided number: " + fifthNumber);
        System.out.println("Provide sixth number");
        sixthNumber = inputReader.nextInt();
        System.out.println("You provided number: " + sixthNumber);
        int product = fifthNumber * sixthNumber;
        System.out.println("Product is: " + product);

        System.out.println("Calculating quotient of two numbers");
        System.out.println("Provide seventh number: ");
        int seventhNumber;
        int eightNumber;
        Scanner inputReader = new Scanner(System.in);
        seventhNumber = inputReader.nextInt();
        System.out.println("You provided number: " + seventhNumber);
        System.out.println("Provide seventh number");
        eightNumber = inputReader.nextInt();
        System.out.println("You provided number: " + eightNumber);
        int quotient = seventhNumber / eightNumber;
        System.out.println("Product is: " + quotient);
    }
}
