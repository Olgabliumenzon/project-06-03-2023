package com.sda.she_likes_java.homework.exercise_22;


/**
 * Exercise 22.
 * Create a shopping cart class.
 * Add as a field an items variable of type List<Item> - to store products.
 * Item is also the class to be created.
 *
 * It is to contain the following fields:
 * - product name
 * - product price.
 * The shopping cart class should provide the following operations:
 * - add product to basket
 * - displaying products in the shopping cart
 * - calculation of the total basket value.
 * Create a Main class and check the operations of your classes.
 */

public class Main {

    public static void main(String[] args) {
        System.out.println("Let's buy something for barbecue");

        ShoppingCart shoppingCart = new ShoppingCart();
        Item beer = new Item("beer", 10);
        Item sausages = new Item("sausages", 5.5);
        Item meat = new Item("meat", 17.5);

        shoppingCart.addProductToBasket(beer);
        shoppingCart.addProductToBasket(beer);
        shoppingCart.addProductToBasket(beer);
        shoppingCart.addProductToBasket(beer);
        shoppingCart.addProductToBasket(beer);
        shoppingCart.addProductToBasket(sausages);
        shoppingCart.addProductToBasket(meat);

        System.out.println("Show me what's in the shopping cart");
        shoppingCart.displayProducts();

        System.out.println("The total price of the basket of products is: " + shoppingCart.calculateTotalBasketValue());
    }
}

