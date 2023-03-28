package com.sda.she_likes_java.homework;


public class AddressExample1 {
    /*
    Put next variables inside it:
    - country,
    - city,
    - street
    - postal code
    Use proper data types.
    Try to create to create two different addresses objects and init
    them with some values.
     */
    public static void main(String[] args) {
        System.out.println("Creating first address object");
        Address one = new Address();
        one.country = "Lithuania";
        one.city = "Vilnius";
        one.street = "Konarskio 21";
        one.postalCode = "03109";

        System.out.println("My current address is: %s, %s, %s, %s. ".formatted (one.street, one.city,
                one.postalCode, one.country ));

        System.out.println("_____");

        System.out.println("Creating second address object");
        Address two = new Address();
        two.country = "Spain";
        two.city = "San Augustin, Tenerife";
        two.street = "Beach front line";
        two.postalCode = "2009";

        System.out.println("My dream address is: %s, %s, %s, %s. ".formatted (two.street, two.city,
                two.postalCode, two.country ));


    }
}