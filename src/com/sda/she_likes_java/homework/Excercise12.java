package com.sda.she_likes_java.homework;

import java.util.Random;
import java.util.Scanner;

public class Excercise12 {

    public static void main(String[] args) {
        // get random number A
        // get random number B
        // get random number C
        // show numbers A, B, C
        // compare all three numbers between themselves
        // display them from smallest to largest

        Random numberGenerator = new Random();
        int someFirstRandomNumber = numberGenerator.nextInt();
        int someSecondRandomNumber = numberGenerator.nextInt();
        int someThirdRandomNumber = numberGenerator.nextInt();

        System.out.println("First random number provided by Java:" + someFirstRandomNumber);
        System.out.println("Second random number provided by Java:" + someSecondRandomNumber);
        System.out.println("Third random number provided by Java:" + someThirdRandomNumber);

        System.out.println("Hey, now show them sorted from smallest to largest: ");

        do {
            if (someFirstRandomNumber < someSecondRandomNumber < someThirdRandomNumber) {
                System.out.println(+someFirstRandomNumber + someSecondRandomNumber + someThirdRandomNumber);

            } else if (someFirstRandomNumber < someThirdRandomNumber < someSecondRandomNumber) {
                System.out.println(+someFirstRandomNumber + someThirdRandomNumber + someSecondRandomNumber);

            } else if (someSecondRandomNumber < someFirstRandomNumber < someThirdRandomNumber) {
                System.out.println(+someSecondRandomNumber + someFirstRandomNumber + someThirdRandomNumber);

            } else if (someSecondRandomNumber < someThirdRandomNumber < someSecondRandomNumber) {
                System.out.println(+someSecondRandomNumber + someThirdRandomNumber + someFirstRandomNumber);

            } else if (someThirdRandomNumber < someFirstRandomNumber < someSecondRandomNumber) {
                System.out.println(+someThirdRandomNumber + someFirstRandomNumber + someSecondRandomNumber);

            } else if (someThirdRandomNumber < someSecondRandomNumber < someFirstRandomNumber) {
                System.out.println(+someThirdRandomNumber + someSecondRandomNumber + someFirstRandomNumber);
                break;

            } while (someFirstRandomNumber != someSecondRandomNumber != someThirdRandomNumber);
        }
    }

