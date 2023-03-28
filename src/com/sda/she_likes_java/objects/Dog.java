package com.sda.she_likes_java.objects;

public class Dog {
    String name;
    // the variables inside the class, not inside the main method, describe the features of the class (dog here)
    //those variables are the attributes of the dog: in this case we assume that every dog has a name
    // here our class name is dog, but full class name is located to the location where this class is
    // "\" backslash means - change the interpretation of the apostrophe


    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.name = "Azor";

        System.out.println("My dog: " + dog.toString());
    }
}