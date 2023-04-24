package com.sda.she_likes_java.strings;

public class ImmutableString {
    public static void main(String[] args) {
        String name = "Olga";
        name = name.concat("Bliumenzon"); // + is shortcut for concat method call = is the same as name + "p"
        name = name.concat("She is 40");

        System.out.println("My name now: " + name);

        StringBuilder nameWithBuilder = new StringBuilder("Olga");
        nameWithBuilder.append(" Bliumenzon");
        nameWithBuilder.append(" Bliumenzon");
        nameWithBuilder.append(" Bliumenzon");
        nameWithBuilder.append(" Bliumenzon");
        System.out.println("Name with builder: " + nameWithBuilder);
       
        String some = "Alice " + " is" + " 10" + " years";
        // "Alice is" + " 10" + " years"
        // "Alice is 10" + years"
        // Alice is 10 years
        String alice = "Alice ";
        StringBuilder someString = new StringBuilder();
        someString.append("Alice");
        someString.append("is");
        someString.append("10");
        someString.append("years");
    }
}