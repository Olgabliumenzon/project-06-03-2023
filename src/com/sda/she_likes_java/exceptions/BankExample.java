package com.sda.she_likes_java.exceptions;


public class BankExample {

    public static void main(String[] args) {
        BankConnector connector = new BankConnector();

        System.out.println("Let's try to check balance of my account");
        int myMoney = 0;
        try {
            myMoney = connector.accountBalance();
            System.out.println("My money: " + myMoney);
        } catch (Exception e) {
            System.out.println("Unexpected condition occurred");
            System.out.println("Exception: " + e);
        }
        System.out.println("Here");
    }
}