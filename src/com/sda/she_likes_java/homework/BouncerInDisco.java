package com.sda.she_likes_java.homework;

import java.util.Scanner;

public class BouncerInDisco {
    public static void main(String[] args) {
        System.out.println("Bouncer disco");


        Scanner inputReader = new Scanner(System.in);
        System.out.println("Tell me how old are you and what is your height");
        int personAge = inputReader.nextInt();
        int personHeight = inputReader.nextInt();

        if (personAge >= 16 && personHeight >= 164) {
            System.out.println("You are over 16 and so tall! Great! Welcome to the disco! Enjoy it!");
        } else {
            System.out.println("Sorry, not this time, kid :( ");
        }
    }
}






