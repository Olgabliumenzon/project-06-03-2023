package com.sda.she_likes_java.homework.exercise15;

/*    /*Exercise 15.
Create a Parent class containing the following variables:
- first name
- surname
- address - (use the class Address)
- firstChild (use class Person)
- secondChild (use class Person)
*/
public class Parent {
    // the Parent class is like concatenation of the properties, and those are the objects
    // class has a state, some internal property and behaviors
    String firstName;
    String surname;
    Person firstChild;
    Person secondChild;
    Address address;

    public static void main(String[] args) {
        Address someAddress = new Address();
        someAddress.country = "Poland";

    }

}

