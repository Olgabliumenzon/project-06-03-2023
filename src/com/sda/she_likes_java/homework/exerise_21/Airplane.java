package com.sda.she_likes_java.homework.exerise_21;

public class Airplane extends Vehicle implements Flying{
    @Override
    public void fly() {
        System.out.println("Airplane can fly");
    }
}
