package com.sda.she_likes_java.homework.exerise_21;

public class Main {
    public static void main(String[] args){
        Vehicle ship = new Ship();
        ((Floating) ship).floate();

        Vehicle submarine = new Submarine();
        ((Diving) submarine).dive();

        Vehicle airplane = new Airplane();
        ((Flying) airplane).fly();
    }
}
