package com.sda.she_likes_java.homework;

import java.util.Random;


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


        if (someFirstRandomNumber < someSecondRandomNumber && someSecondRandomNumber < someThirdRandomNumber) {
            System.out.println("Smallest number: " + someFirstRandomNumber);
            System.out.println("Middle number: " + someSecondRandomNumber);
            System.out.println("Largest number: " + someThirdRandomNumber);

        } else if (someFirstRandomNumber < someThirdRandomNumber && someThirdRandomNumber < someSecondRandomNumber) {
            System.out.println("Smallest number: " + someFirstRandomNumber);
            System.out.println("Middle number: " + someThirdRandomNumber);
            System.out.println("Largest number: " + someSecondRandomNumber);

        } else if (someSecondRandomNumber < someFirstRandomNumber && someFirstRandomNumber < someThirdRandomNumber) {
            System.out.println("Smallest number: " + someSecondRandomNumber);
            System.out.println("Middle number: " + someFirstRandomNumber);
            System.out.println("Largest number: " + someThirdRandomNumber);

        } else if (someSecondRandomNumber < someThirdRandomNumber && someThirdRandomNumber <
                someSecondRandomNumber) {

            System.out.println("Smallest number: " + someSecondRandomNumber);
            System.out.println("Middle number: "+ someThirdRandomNumber);
            System.out.println("Largest number: " + someFirstRandomNumber);

        } else if (someThirdRandomNumber < someFirstRandomNumber && someFirstRandomNumber <
                someSecondRandomNumber) {
            System.out.println("Smallest number: " + someThirdRandomNumber);
            System.out.println("Middle number: " + someFirstRandomNumber);
            System.out.println("Largest number: " + someSecondRandomNumber);


        } else if (someThirdRandomNumber < someSecondRandomNumber && someSecondRandomNumber <
                someFirstRandomNumber) {
            System.out.println("Smallest number: " + someThirdRandomNumber);
            System.out.println("Middle number: " + someSecondRandomNumber);
            System.out.println("Largest number: " + someThirdRandomNumber);

        }
    }
}




